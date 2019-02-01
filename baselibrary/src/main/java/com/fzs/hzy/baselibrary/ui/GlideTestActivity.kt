package com.fzs.hzy.baselibrary.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.fzs.hzy.baselibrary.R
import kotlinx.android.synthetic.main.activity_glide_test.*

class GlideTestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_glide_test)
        btnLoad.setOnClickListener {
            println("test")
            val options = RequestOptions()
            options.centerCrop()
            Glide.with(this)
                .load("http://img5.duitang.com/uploads/item/201411/07/20141107164412_v284V.jpeg")
                .apply(options)
                .into(ivBaseGlide)
            Glide.with(this)
                .asGif()
                .load("")
                .into(ivBaseGlide)

//            GlideApp.with(this)
//                .load("")
//                .centerCrop()
//                .into(ivBaseGlide)
//            Glide
//            GlideApp.
//            GlideApp.
        }

    }
}