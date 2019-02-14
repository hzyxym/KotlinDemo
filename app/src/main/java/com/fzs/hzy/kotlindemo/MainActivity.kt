package com.fzs.hzy.kotlindemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.fzs.hzy.baselibrary.User
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var user = User("hzy", 28)
        println(user)
        println("hzyxym0")
        btn_fzs.setOnClickListener{println("aa")}
        val bar3 = Bar()
        bar3.testInit()
        val listener = MyListener
        btn_fzs.setOnClickListener(MyListener)
    }
    private object MyListener: View.OnClickListener{
        override fun onClick(v: View?) {
            print("hzy")
        }
    }
}
