package com.fzs.hzy.kotlindemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import com.fzs.hzy.baselibrary.utils.JacksonUtil;
import com.fzs.hzy.kotlindemo.entity.Customer;

public class TestJacksonActivity {
    public void main(String[] args){
        String str =  "{\"name\":\"hzy\",\"email\":\"953624084@qq.com\"}";
        Customer customer = JacksonUtil.readValue(str,Customer.class);
        System.out.println("customer:"+customer.getEmail());
    }
}
