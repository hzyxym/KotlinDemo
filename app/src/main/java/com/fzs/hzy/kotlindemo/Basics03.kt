package com.fzs.hzy.kotlindemo

fun main(vararg args : String){
    test()
}

fun test(){

    var height = 226 * (232/225)
    var height2 = 226 * (232/225f)
    println("$height,$height2")
    println("$height,$height2")
    println("$height,$height2")
    var person = Person("hzy")
    var daughter = Person("hbx",person)
    println("show:${person.show()}")
}