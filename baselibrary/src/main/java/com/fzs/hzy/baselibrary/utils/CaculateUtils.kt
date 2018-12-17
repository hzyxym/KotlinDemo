package com.fzs.hzy.baselibrary.utils

fun sum(a: Int, b: Int) = a + b

fun printSum(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}")
}

fun maxOf(a: Int, b: Int): Int {
    return if(a > b){
        a
    }else {
        b
    }
}