package com.king.easychat.netty

import com.king.anetty.ANetty
import com.king.anetty.Netty
import com.king.easychat.app.Constants
import com.king.easychat.bean.Operator
import com.king.easychat.netty.packet.req.AcceptGroupReq
import com.king.easychat.netty.packet.req.AcceptReq
import com.king.easychat.netty.packet.req.AllowGroupReq
import com.king.easychat.netty.packet.resp.ApplyGroupResp
import com.king.easychat.util.Event
import io.netty.channel.ChannelFuture
import io.netty.util.concurrent.GenericFutureListener
import timber.log.Timber

/**
 * @author <a href="mailto:jenly1314@gmail.com">Jenly</a>
 */
class NettyClient {

  private var netty = ANetty(ChannelInitial(),true)

  private var domainHost: String? = null

  companion object{

    private const val HOST = Constants.HOST
    private const val PORT = 8000

    val INSTANCE : NettyClient by lazy (mode = LazyThreadSafetyMode.SYNCHRONIZED) { NettyClient() }

  }


  fun init(host: String){
    this.domainHost = host
  }

  /**
   * Netty建立连接
   */
  fun connect(){
      if(domainHost!= null){
          netty.connect(domainHost, PORT)
      }else{
          netty.connect(HOST, PORT)
      }
  }

  /**
   * 发送消息
   */
  fun sendMessage(msg: Any){
    Timber.d(msg.toString())
    if(netty.isConnected){
        netty.sendMessage(msg)
    }else{
        Event.sendEvent(Operator(Constants.EVENT_NETTY_DISCONNECT))
    }

  }

  /**
   * 重连
   */
  fun reconnect(delayMillis: Long){
    netty.reconnect(delayMillis)
  }

  /**
   * Netty断开连接
   */
  fun disconnect(){
    netty.disconnect()
  }

  /**
   * 关闭
   */
  fun close(){
    netty.close()
  }

  /**
   * Netty是否已经连接
   */
  fun isConnected(): Boolean{
    return netty.isConnected
  }

  /**
   * 通道是否开启
   */
  fun isOpen(): Boolean{
    return netty.isOpen
  }

  fun setOnConnectListener(listener: Netty.OnConnectListener?){
      netty.setOnConnectListener(listener)
  }

  fun setOnSendMessageListener(listener: Netty.OnSendMessageListener?){
    netty.setOnSendMessageListener(listener)
  }

  /**
   * 添加监听、经测试：后续添加的监听并没什么卵用
   */
  fun addListener(listener: GenericFutureListener<ChannelFuture>){
      getChannelFuture()?.addListener(listener)
  }

  /**
   * 移除监听
   */
  fun removeListener(listener: GenericFutureListener<ChannelFuture>){
    getChannelFuture()?.removeListener(listener)
  }

  fun getChannelFuture(): ChannelFuture? {
    return netty.channelFuture
  }

  //----------------------------

  /**
   * 接收好友申请-接受/拒绝
   */
  fun sendAcceptReq(receiver: String,accept: Boolean){
    sendMessage(AcceptReq(receiver,accept))
  }

  /**
   * 接收邀请加群-接受/拒绝
   */
  fun sendAcceptGroupReq(groupId: String,inviterId: String,accept: Boolean){
    sendMessage(AcceptGroupReq(groupId,inviterId,accept))
  }

  /**
   * 接收申请加群-同意/拒绝
   */
  fun sendAllowGroupReq(data: ApplyGroupResp, allow: Boolean){
    sendMessage(AllowGroupReq(data.groupId,data.applyUserId,allow))
  }
}