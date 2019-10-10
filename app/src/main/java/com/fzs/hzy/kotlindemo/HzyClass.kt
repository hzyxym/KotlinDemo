package com.fzs.hzy.kotlindemo

/**
 * author: hzy
 * Date: 2019/2/6
 */
class HzyClass{
    init {
        println("hzy")
        println("1")
        println("2")
    }
}

open class AClass(x: Int) {
    open val y: Int = x
    open var x: Int = 0
}

open interface BInterface {
    open fun sayHello()
}
