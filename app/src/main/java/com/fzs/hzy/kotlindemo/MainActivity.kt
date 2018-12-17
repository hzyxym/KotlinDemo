package com.fzs.hzy.kotlindemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.fzs.hzy.baselibrary.User

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var user = User("hzy", 28)
        println(user)
        println("hzyxym0")
    }
}
