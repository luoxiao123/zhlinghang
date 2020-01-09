package com.king.easychat.binding

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.github.chrisbanes.photoview.PhotoView
import com.king.base.util.TimeUtils
import com.king.easychat.R
import com.king.easychat.glide.GlideApp
import com.king.easychat.view.DragBubbleView
import de.hdodenhof.circleimageview.CircleImageView

/**
 * @author <a href="mailto:jenly1314@gmail.com">Jenly</a>
 */


@BindingAdapter(value = ["time"])
fun TextView.dateFormat(time: String?){
    time?.run {
        text = TimeUtils.formatDate(time,TimeUtils.FORMAT_Y_TO_M_EN)
    } ?: run {
        text = ""
    }

}

@BindingAdapter(value = ["time","curTime"])
fun TextView.dateFormat(time: String?,curTime: Long){
    dateFormat(time,curTime,false)
}

@BindingAdapter(value = ["time","curTime","showDate"])
fun TextView.dateFormat(time: String?,curTime: Long,showDate: Boolean){
    time?.run {
        val date = TimeUtils.formatDate(time,TimeUtils.FORMAT_Y_TO_D)
        val curDate = TimeUtils.formatDate(curTime,TimeUtils.FORMAT_Y_TO_D)
        if(curDate == date){
            text = TimeUtils.formatDate(time,TimeUtils.FORMAT_H_TO_MIN)
        }else{
            text = TimeUtils.formatDate(time,if(showDate) "MM-dd" else TimeUtils.FORMAT_Y_TO_M_EN)
        }

    } ?: run {
        text = ""
    }
}

@BindingAdapter(value = ["count"])
fun TextView.count(count: Int){
    if(count>0){
        text = count.toString()
    }else{
        text = ""
    }

}

@BindingAdapter(value = ["count"])
fun DragBubbleView.count(count: Int){
    reCreate()
    if(count>0){
        setText(count.coerceAtMost(99).toString())
        visibility = View.VISIBLE
    }else{
        setText("")
        visibility = View.INVISIBLE
    }

}

@BindingAdapter(value = ["imageUrl"])
fun ImageView.imageUrl(imageUrl: String?){
    imageUrl?.run {
        var requestOptions = RequestOptions.bitmapTransform(RoundedCorners(20))
        GlideApp.with(context).load(imageUrl).apply(requestOptions).into(this@imageUrl)
    }

}

@BindingAdapter(value = ["imageUrl"])
fun PhotoView.imageUrl(imageUrl: String?){
    imageUrl?.run {
        GlideApp.with(context).load(imageUrl).into(this@imageUrl)
    }

}

@BindingAdapter(value = ["avatar"])
fun ImageView.avatar(imageUrl: String?){
    imageUrl?.run {
        GlideApp.with(context).load(imageUrl).error(R.drawable.default_avatar).into(this@avatar)
    }?: run{
        GlideApp.with(context).load(R.drawable.default_avatar).into(this@avatar)
    }

}

@BindingAdapter(value = ["avatar"])
fun CircleImageView.avatar(avatar: String?){
    avatar?.run {
        GlideApp.with(context).load(avatar).error(R.drawable.default_avatar).into(this@avatar)
    } ?: run{
        GlideApp.with(context).load(R.drawable.default_avatar).into(this@avatar)
    }

}