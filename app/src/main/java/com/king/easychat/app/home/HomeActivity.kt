package com.king.easychat.app.home

import android.Manifest
import android.os.Bundle
import android.view.View
import androidx.fragment.app.FragmentTransaction
import androidx.lifecycle.Observer
import com.king.easychat.R
import com.king.easychat.app.Constants
import com.king.easychat.app.base.BaseActivity
import com.king.easychat.app.friend.FriendFragment
import com.king.easychat.app.group.DownloadUtil
import com.king.easychat.app.group.GroupFragment
import com.king.easychat.app.group.GrouptwoFragment
import com.king.easychat.app.group.JSONUtil
import com.king.easychat.app.me.MeFragment
import com.king.easychat.app.web.WebActivity
import com.king.easychat.bean.Operator
import com.king.easychat.bean.UpdApp
import com.king.easychat.databinding.HomeActivityBinding
import com.king.easychat.netty.packet.Packet
import com.king.easychat.netty.packet.PacketType
import com.king.easychat.netty.packet.resp.GroupMessageResp
import com.king.easychat.netty.packet.resp.MessageResp
import com.king.easychat.view.DragBubbleView
import com.king.frame.mvvmframe.base.livedata.StatusEvent
import kotlinx.android.synthetic.main.home_activity.*
import okhttp3.*
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode
import timber.log.Timber
import java.io.IOException


/**
 * @author <a href="mailto:jenly1314@gmail.com">Jenly</a>
 */
class HomeActivity : BaseActivity<HomeViewModel, HomeActivityBinding>() ,
    HomeFragment.OnTotalCountCallback {

     var homeFragment : HomeFragment? = null

     var friendFragment : FriendFragment? = null

    var groupFragment : GroupFragment? = null

     var grouptwoFragment : GrouptwoFragment? = null

     var meFragment : MeFragment? = null

     var isStorage = false

    override fun initData(savedInstanceState: Bundle?) {
        mBinding.viewModel = mViewModel
        showHomeFragment()
        registerStatusEvent {
            when(it){
                StatusEvent.Status.LOADING -> showLoading()
                StatusEvent.Status.SUCCESS -> hideLoading()
                StatusEvent.Status.FAILURE -> hideLoading()
                StatusEvent.Status.ERROR -> hideLoading()
            }
        }

        dbvCount.setOnBubbleStateListener(object : DragBubbleView.OnBubbleStateListener{
            override fun onDrag() {
            }

            override fun onMove() {
            }

            override fun onRestore() {
            }

            override fun onDismiss() {
                mViewModel.updateAllMessageRead(getApp().getUserId())
            }

        })

        mViewModel.userLiveData.observe(this, Observer {
            getApp().user = it
        })

        mViewModel.getUser()
        mViewModel.friendsLiveData.observe(this, Observer {
            if(getApp().friends == null){
                getApp().friends = it
            }
        })

        mViewModel.groupsLiveData.observe(this, Observer {
            if(getApp().groups == null){
                getApp().groups = it
            }
        })
        if(getApp().friends == null){
            mViewModel.getCacheFriends()
        }
        if(getApp().groups == null){
            mViewModel.getCacheGroups()
        }

        mViewModel.syncMessageReq()

        rxPermission.request(Manifest.permission.WRITE_EXTERNAL_STORAGE,Manifest.permission.READ_EXTERNAL_STORAGE)
            .subscribe{
                isStorage = true
            }


        var request = Request.Builder().url("http://mock-api.com/5n9o63zo.mock/check")
            .build()
        OkHttpClient().newCall(request).enqueue( object :Callback{

            override fun onFailure(call: Call, e: IOException) {

            }

            override fun onResponse(call: Call, response: Response) {
                val string = response.body()!!.string()
                println("查看是否更新" + string)

                var date = JSONUtil.fromJson(string,UpdApp::class.java)

                if(date.switchX ==2){
                    runOnUiThread(){
                        DownloadUtil().onlyDownload(this@HomeActivity,date.url)
                    }

                }else if(date.switchX ==1){
                    val intent = newIntent("详情",WebActivity::class.java)
                    intent.putExtra(Constants.KEY_URL,date.url)
                    startActivity(intent)
                }

            }

        })



    }

    override fun getLayoutId(): Int {
        return R.layout.home_activity
    }

    private fun showHomeFragment(){
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        if(homeFragment == null){
            homeFragment = HomeFragment.newInstance()
            fragmentTransaction.add(R.id.fragmentContent,homeFragment!!)
        }

        hideAllFragment(fragmentTransaction)
        fragmentTransaction.show(homeFragment!!)
        fragmentTransaction.commit()
    }

    private fun showFriendFragment(){
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        if(friendFragment == null){
            friendFragment = FriendFragment.newInstance()
            fragmentTransaction.add(R.id.fragmentContent,friendFragment!!)
        }
        hideAllFragment(fragmentTransaction)
        fragmentTransaction.show(friendFragment!!)
        fragmentTransaction.commit()
    }

    private fun showGroupFragment(){
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        if(groupFragment == null){
            groupFragment = GroupFragment.newInstance()
            fragmentTransaction.add(R.id.fragmentContent,groupFragment!!)
        }
        hideAllFragment(fragmentTransaction)
        fragmentTransaction.show(groupFragment!!)
        fragmentTransaction.commit()
    }


    private fun showGrouptwoFragment(){
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        if(grouptwoFragment == null){
            grouptwoFragment = GrouptwoFragment.newInstance()
            fragmentTransaction.add(R.id.fragmentContent,grouptwoFragment!!)
        }
        hideAllFragment(fragmentTransaction)
        fragmentTransaction.show(grouptwoFragment!!)
        fragmentTransaction.commit()
    }

    private fun showMeFragment(){
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        if(meFragment == null){
            meFragment = MeFragment.newInstance()
            fragmentTransaction.add(R.id.fragmentContent,meFragment!!)
        }
        hideAllFragment(fragmentTransaction)
        fragmentTransaction.show(meFragment!!)
        fragmentTransaction.commit()
    }

    private fun hideAllFragment(fragmentTransaction: FragmentTransaction){
        homeFragment?.let {
            fragmentTransaction.hide(it)
        }
        friendFragment?.let {
            fragmentTransaction.hide(it)
        }

        groupFragment?.let {
            fragmentTransaction.hide(it)
        }

        grouptwoFragment?.let {
            fragmentTransaction.hide(it)
        }

        meFragment?.let {
            fragmentTransaction.hide(it)
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    override fun onMessageEvent(event: Operator){
        super.onMessageEvent(event)
        when (event.event) {
            Constants.EVENT_UPDATE_MESSAGE_READ -> handleMessageRead()
            Constants.EVENT_UPDATE_GROUP_MESSAGE_READ -> handleGroupMessageRead()
        }
    }

    private fun handleMessageRead(){
        getApp().friendId?.let {
            mViewModel.updateMessageRead(getApp().getUserId(),it)
        }
        getApp().friendId = null
    }

    private fun handleGroupMessageRead(){
        getApp().groupId?.let {
            mViewModel.updateGroupMessageRead(getApp().getUserId(),it)
        }
        getApp().groupId = null
    }


    @Subscribe(threadMode = ThreadMode.MAIN)
    override fun onMessageEvent(event: Packet){
        super.onMessageEvent(event)
        when(event.packetType()){
            PacketType.SEND_MESSAGE_RESP -> handleMessageResp(event as MessageResp)
            PacketType.GROUP_MESSAGE_RESP -> handleGroupMessageResp(event as GroupMessageResp)
        }
    }

    /**
     * 处理普通消息
     */
    private fun handleMessageResp(data: MessageResp){
        val read = data.sender == getApp().friendId
        Timber.d("read=$read")
        mViewModel.saveMessage(getApp().getUserId(),data.sender!!,data.senderName,null,read,data)
    }

    /**
     * 处理群消息
     */
    private fun handleGroupMessageResp(data: GroupMessageResp){
        val read = (data.groupId == getApp().groupId)
        Timber.d("read=$read")
        mViewModel.saveGroupMessage(getApp().getUserId(),data.groupId,null,read,data)
    }


    override fun onClick(v: View){
        when(v.id){
            R.id.rb1 -> showHomeFragment()
            R.id.rb2 -> showFriendFragment()
            R.id.rb3 -> showGroupFragment()
            R.id.rb4 -> showMeFragment()
            R.id.rb3_pre -> showGrouptwoFragment()
        }
    }

    override fun onTotalCountChanged(count: Int){
        mBinding.data = count
    }

}
