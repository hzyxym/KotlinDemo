package com.fzs.hzy.kotlindemo

import java.security.SecureRandom
import kotlin.random.Random

fun main(vararg args: String) {
    println("control flow")
//    println(getMaxValue(4,9))
//    println(ifGarmmar(32, 2))
//    when2Grammar(1)
    randomGrammar()
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

fun randomGrammar(){
    var r = SecureRandom()
    println(r.nextFloat())
    println(r.nextFloat())
    println(r.nextFloat())
    println(r.nextFloat())
    println(r.nextFloat())
    println(r.nextFloat())
    println(r.nextFloat())
    println(r.nextFloat())
    println(r.nextFloat())
    println(r.nextFloat())
    println(r.nextFloat())
    println(r.nextFloat())
    println(r.nextFloat())
    println(r.nextFloat())
    println(r.nextFloat())
//    println(r.nextInt(3))

//    var random = Random(255)
//    println(random.nextInt())
//    println(random.nextInt())
//    println(random.nextInt())

//    val random = (Math.random() * 5).toInt()
//    println(random)
}