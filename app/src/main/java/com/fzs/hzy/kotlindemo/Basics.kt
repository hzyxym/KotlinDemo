package com.fzs.hzy.kotlindemo

import com.fzs.hzy.baselibrary.utils.*
val PI = 3.14
var x = 0
fun main(vararg args: String) {
    println("sum:${sum(12, 10)}")
    printSum(2, 3)
    var a = 2
    var b : Int = getValue()
    printSum(a, b)

    println("a++ is ${a++}")
    println("a:$a")
    println("++b is ${++b}")
    println("x changeX is ${changeX()}")
    x += 3
    println("x: $x")
}

fun getValue():Int{
    return 2
}
