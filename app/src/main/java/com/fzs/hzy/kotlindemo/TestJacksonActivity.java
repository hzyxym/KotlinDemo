package com.fzs.hzy.kotlindemo;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import com.fzs.hzy.baselibrary.utils.JacksonUtil;
import com.fzs.hzy.kotlindemo.entity.Customer;

import java.util.*;

public class TestJacksonActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        main();
    }

    public void main(){
        String str =  "{\"name\":\"hzy\",\"email\":\"953624084@qq.com\"}";
        Customer customer = JacksonUtil.readValue(str,Customer.class);
        System.out.println("customer:"+customer.getEmail());


        /*List<String> strs = new ArrayList<String>();
        List<Object> objs = strs; // ！！！即将来临的问题的原因就在这里。Java 禁止这样！
        objs.add(1); // 这里我们把一个整数放入一个字符串列表
        String s = strs.get(0); // ！！！ ClassCastException：无法将整数转换为字符串*/

        ArrayList<? extends Object> father = new ArrayList<>();
        ArrayList<String> son = new ArrayList<>();
        son.add("hy");
        father = son;
    }

    void copyAll(Collection<Object> to, Collection<Object> from) {
        to.addAll(from);
        // ！！！对于这种简单声明的 addAll 将不能编译：
        // Collection<String> 不是 Collection<Object> 的子类型
    }
}
