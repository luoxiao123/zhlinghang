package com.king.easychat.app.service

import android.app.Service
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.ServiceConnection
import android.os.Binder
import android.os.IBinder
import com.king.anetty.Netty
import com.king.easychat.app.Constants
import com.king.easychat.bean.Operator
import com.king.easychat.netty.NettyClient
import com.king.easychat.netty.packet.req.HeartBeatReq
import com.king.easychat.util.Cache
import com.king.easychat.util.Event
import io.reactivex.Observable
import io.reactivex.disposables.Disposable
import timber.log.Timber
import java.util.concurrent.TimeUnit

/**
 * @author <a href="mailto:jenly1314@gmail.com">Jenly</a>
 */
class HeartBeatService : Service(){

    var sendHeartBeat : Boolean = false

    val binder by lazy { HeartBeatBinder() }

    var disposable : Disposable? = null

    private val connectListener = object: Netty.OnConnectListener{
        override fun onSuccess() {
            Cache.getLoginReq()?.let {
                NettyClient.INSTANCE.sendMessage(it)
            }

        }

        override fun onFailed() {
            Timber.d("Netty connect failed.")
        }

        override fun onError(e: Exception?) {
            Timber.w(e)
        }

    }


    companion object{

        const val HEART_BEAT_INTERVAL = 20L

        private val serviceConnection by lazy {
            val connection = object: ServiceConnection {
                override fun onServiceConnected(name: ComponentName, service : IBinder){
                    service as HeartBeatBinder
                    service.sendHeart()
                }

                override fun onServiceDisconnected(name : ComponentName){

                }
            }
            connection
        }

        fun startHeartBeatService(context: Context){
            context.startService(Intent(context,HeartBeatService::class.java))
        }

        fun bindHeartBeatService(context : Context){
            context.applicationContext?.bindService(Intent(context,HeartBeatService::class.java),serviceConnection,Context.BIND_AUTO_CREATE)
        }

        fun stopHeartBeatService(context: Context){
            context.stopService(Intent(context,HeartBeatService::class.java))
        }
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        sendHeartBeat()
        return super.onStartCommand(intent, flags, startId)
    }


    fun sendHeartBeat(){

        if(sendHeartBeat){
            return
        }
        sendHeartBeat = true

        Timber.d("sendHeartBeat")
        disposable = Observable.interval(HEART_BEAT_INTERVAL, TimeUnit.SECONDS).takeWhile { sendHeartBeat }.subscribe {
            if(NettyClient.INSTANCE.isConnected()){
                NettyClient.INSTANCE.sendMessage(HeartBeatReq())
            }else{
                Event.sendEvent(Operator(Constants.EVENT_NETTY_RECONNECT))
                NettyClient.INSTANCE.setOnConnectListener(connectListener)
                NettyClient.INSTANCE.connect()
            }
        }


    }

    override fun onDestroy() {
        sendHeartBeat = false
        disposable?.dispose()
        super.onDestroy()
    }

    override fun onBind(data: Intent?): IBinder? {
        return binder
    }


    inner class HeartBeatBinder : Binder(){
        fun sendHeart(){
            sendHeartBeat()
        }
    }


}