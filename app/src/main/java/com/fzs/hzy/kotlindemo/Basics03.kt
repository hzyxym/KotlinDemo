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
    println("show:${person.show()}")
    println("$height,$height2")
    var farther = Person("hzy")
    var daughter = Person("hbx",farther)
    println("show:${farther.show()}")
    println("daughter show:${daughter.show()}")
    println("test push")
}