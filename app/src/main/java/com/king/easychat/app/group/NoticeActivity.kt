package com.king.easychat.app.group

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.king.easychat.R
import kotlinx.android.synthetic.main.activity_notice.*
import kotlinx.android.synthetic.main.group_fragment.*
import kotlinx.android.synthetic.main.home_toolbar.*

class NoticeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notice)

        tvTitle.setText("详情")
        
        ivLeft.setImageResource(R.drawable.btn_back_normal)
        ivLeft.setOnClickListener { finish() }

        var mytitle = intent.getStringExtra("title")
        var mycontent=  intent.getStringExtra("content")

        noticetitle.text =mytitle
        content.text =mycontent
    }
}
