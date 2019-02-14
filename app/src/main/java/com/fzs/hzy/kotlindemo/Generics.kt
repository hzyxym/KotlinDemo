package com.fzs.hzy.kotlindemo


fun main(vararg args: String){
    println("hzy")
    val box = Box("hzy")
    println("${box.value}")

    val source = object : Source<String>{
        override fun nextT(): String {
            return "xym"
        }

    }
    demo(source)
}

class Box<T>(t: T) {
    var value = t
}

interface Source<out T> {
    fun nextT(): T
}

fun demo(str: Source<String>) {
    val objects: Source<Any> = str // 这个没问题，因为 T 是一个 out-参数
    println("${objects.nextT()}")
    // ……
}