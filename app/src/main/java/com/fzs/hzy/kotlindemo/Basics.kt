package com.fzs.hzy.kotlindemo

import com.fzs.hzy.baselibrary.utils.*

val PI = 3.14
var x = 0
fun main(vararg args: String) {
//    basics()
    printForeach()
}

fun basics(){
    println("sum:${sum(12, 10)}")
    printSum(2, 3)
    var a = 2
    var b: Int = getValue()
    printSum(a, b)

    println("a++ is ${a++}")
    println("a:$a")
    println("++b is ${++b}")
    println("x changeX is ${changeX()}")
    x += 3
    println("x: $x")
    println(maxOf(5, 4))
    println(parseInt("q"))
    printProduct("12","v")
    println("length: ${getStringLength(1)}")
}

fun printForeach(){
    val list = listOf<String>("a","b","c")
    for(it in list){
        print("$it ")
    }

    println()
    val fruitList = listOf("apple","banana","pear")
    for (index in fruitList.indices){
        println("item at $index is ${fruitList[index]}")
    }

    fruitList.forEach { println("$it") }
    println(fruitList.last { it.equals("banana") })
}




