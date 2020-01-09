package com.king.easychat.bean;

/**
 * Created by luoxiao on 2020/1/9.
 */

import android.widget.ImageView;

import androidx.databinding.BindingAdapter;
import androidx.room.Entity;

import com.bumptech.glide.Glide;

import kotlinx.android.parcel.Parcelize;


public class MessageBean {

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getZuozhe() {
        return zuozhe;
    }

    public void setZuozhe(String zuozhe) {
        this.zuozhe = zuozhe;
    }

    public String getSay() {
        return say;
    }

    public void setSay(String say) {
        this.say = say;
    }

    private String title;
    private String content;
    private String image;

    private String zuozhe ="金牌小编";
    private String say;

    @BindingAdapter({"image"})
    public static void loadImage(ImageView imageView, String image){
        //必须为static方法，否则报错
        Glide.with(imageView.getContext()).load(image).into(imageView);
    }

    public MessageBean(String title, String content, String image,  String say) {
        this.title = title;
        this.content = content;
        this.image = image;
        this.say = say;
    }

    public MessageBean(String id,String title, String content, String image,  String say) {
        this.title = title;
        this.content = content;
        this.image = image;
        this.say = say;
    }
}
