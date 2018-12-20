package com.fzs.hzy.kotlindemo

fun main(vararg args: String) {
    println("control flow")
//    println(getMaxValue(4,9))
    println(ifGarmmar(32, 2))
    when2Grammar(1)
}

fun getMaxValue(a: Int, b: Int): Int {
    return if (a < b) b else a
}

fun ifGarmmar(a: Int, b: Int): Int {
    return if (a < b) {
        print("choose b \n")
        b
    } else {
        print("choose a \n")
        a
    }
}

fun when2Grammar(x : Any) = when (x) {
    1 -> 1
    2 -> print("x == 2")
    else -> { // 注意这个块
        print("x is neither 1 nor 2")
    }
}