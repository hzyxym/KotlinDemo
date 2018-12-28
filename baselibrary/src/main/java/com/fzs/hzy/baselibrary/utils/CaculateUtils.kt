package com.fzs.hzy.baselibrary.utils

fun sum(a: Int, b: Int) = a + b

fun sumPrint(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}")
}

fun maxOfSimple(a: Int, b: Int): Int {
    return if(a > b){
        a
    }else {
        b
    }
}

fun maxOf(a :Int,b: Int) = if(a > b) a else b

fun parseInt(str : String): Int?{
    return try {
        val i = Integer.parseInt(str)
        i
    } catch (e: Exception) {
        null
    }
}

fun getValue(): Int {
    return 2
}

fun printProduct(str1: String, str2: String) {
    val x = parseInt(str1)
    val y = parseInt(str2)
    if (x != null && y != null) {
        println("x*y=${x * y}")
    } else {
        println("either '$str1' or '$str2' is not a number")
    }
}

fun getStringLength(obj : Any): Int?{
    if(obj is String){
        return obj.length
    }
    return null
}

fun todoFun(){
    //TODO do the functions
}