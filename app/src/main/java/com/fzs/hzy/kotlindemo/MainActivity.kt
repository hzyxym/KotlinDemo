package com.fzs.hzy.kotlindemo

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.fzs.hzy.baselibrary.User
import com.fzs.hzy.baselibrary.ui.GlideTestActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        tvText.text = "fdasfdasf"//赋值

        //this is nothing

        var user = User("hzy", 28)
        println(user)
        println("hzyxym0")
        println("abc")
        btn_fzs.setOnClickListener{println("aa")}
        val bar3 = Bar()
        bar3.testInit()
        val listener = MyListener
        btn_fzs.setOnClickListener(MyListener)

//        val options = RequestOptions().centerCrop()
//        Glide.with(this)
//            .load("http://www.pptbz.com/pptpic/UploadFiles_6909/201211/2012111719294197.jpg")
//            .apply(options)
//            .into(ivGlide)
        btn_fzs.setOnClickListener {
            val intent = Intent(this,GlideTestActivity::class.java)
            startActivity(intent)
        }

        btnLoad.setOnClickListener {
            GlideApp.with(this)
                .load("http://pic17.nipic.com/20111021/8633866_210108284151_2.jpg")
                .fitCenter()
                .into(ivGlide)
        }


    }

    fun eat(){
        print("eat")
    }

    private object MyListener: View.OnClickListener{
        override fun onClick(v: View?) {
            print("hzy")
        }

    }

}
