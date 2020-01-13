package com.king.easychat.app.group

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.king.easychat.R
import kotlinx.android.synthetic.main.home_toolbar.*

class YinsiActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yinsi)

        tvTitle.setText("隐私协议")
        ivLeft.setImageResource(R.drawable.btn_back_normal)
        ivLeft.setOnClickListener { finish() }
    }

    fun onClick(v: View) {

    }
}
