package com.fzs.hzy.kotlindemo

import com.fzs.hzy.baselibrary.utils.*
import com.fzs.hzy.kotlindemo.entity.Customer

val PI = 3.14
var x = 0
fun main(vararg args: String) {
//    basics()
//    printForeach()
//    println(whenGrammar(3L))
//    rangeGrammar()
//    whenRangeGrammar()
//    filterGrammar()
//    dataClassGrammar()
//    mapGrammar()
//    println("xym".hzyExtend())
//    listGrammar()
//    basicsGrammar()
//    grammarOrNull()
    stringGrammar()
}


fun basics() {
    println("sum:${sum(12, 10)}")
    sumPrint(2, 3)
    var a = 2
    var b: Int = getValue()
    sumPrint(a, b)

    println("a++ is ${a++}")
    println("a:$a")
    println("++b is ${++b}")
    println("x changeX is ${changeX()}")
    x += 3
    println("x: $x")
    println(maxOf(5, 4))
    println(parseInt("q"))
    printProduct("12", "v")
    println("length: ${getStringLength(1)}")
}

fun printForeach() {
    val fruitList = listOf("apple", "banana", "pear")
    val words = listOf("a", "b", "c")
    for (it in words) {
        print("$it ")
    }

    println()
    for (index in fruitList.indices) {
        println("item at $index is ${fruitList[index]}")
    }

    fruitList.forEach { println("$it") }
    println(fruitList.last { it.equals("banana") })

    var index = 0
    while (index < fruitList.size) {
        println("this is ${fruitList[index]}")
        index++
    }
}

fun whenGrammar(obj: Any): String = when (obj) {
    1 -> "1"
    "hello" -> "Greeting"
    is Long -> "Long"
    !is String -> "not a string"
    else -> "Unknown"
}

fun rangeGrammar() {
    var x = 8
    var y = 10
    if (x in 1..y) {
        println("fits in range")
    }

    for (x in 1..5) {
        print("$x ")
    }
    println()

    for (x in 1..10 step 2) {
        print("$x ")
    }
    println()

    for (x in 19 downTo 0 step 3) {
        print("$x ")
    }
}

fun whenRangeGrammar() {
    val fruits = listOf("apple", "orange", "banana", "pear")
    when {
        "orange" in fruits -> println("juicy")
        "apple" in fruits -> println("apple is fine too")
    }
}

fun filterGrammar(){
    val fruits = listOf("apple", "orange", "banana", "pear","are","age","apple")
    fruits
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.toUpperCase() }
        .forEach { println(it) }
    val fruit = fruits.firstOrNull() ?: "none"
    println(fruit)
}

fun dataClassGrammar(){
    var customer = Customer("hzy","953624084@qq.com")
    var hzy = Customer("hzy","953624084@qq.com")
    if(customer.equals(hzy)){
        println("castomer is hzy $hzy")
    }
    var email = customer.email?.let { "hzy email: $it" }
    println(email)
}

fun mapGrammar(){
    val map = mapOf("a" to 1, "b" to 2, "c" to 3)
    println(map["a"])
    for ((k, v) in map) {
        println("$k -> $v")
    }
}

fun listGrammar(){
//    val values = arrayOfNulls<String>(3)
    val values = arrayOfMinusOnes(3)
    values.map { println("list $it") }
}

fun String.hzyExtend(): String{
    return this + "hzy"
}

fun arrayOfMinusOnes(size: Int): IntArray {
    return IntArray(size).apply { fill(-1) }
}

fun basicsGrammar(){
    val bytes = 0b10010010
    val hexBytes = 0xFF_EC_DE_5E
    val socialSecurityNumber = 999_99_99_99L
    println(bytes)
    println(hexBytes)
    println(socialSecurityNumber)

    val a: Int = 10000
    println(a === a) // 输出“true”
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a
    println(boxedA === anotherBoxedA) // ！！！输出“false”！！！
    println("boxedA:$boxedA,anotherBoxedA:$anotherBoxedA")

    println("shl:${1 shl 2}")
    println("shr:${8 shr 4}")
    println("ushr:${8 ushr 4}")
    println("and:${1 and 2}")
    println("or:${1 or 2}")
    println("or:${1 xor 2}")
    println("inv:${37.inv()}")
    println("inv:${38.inv()}")
    println("inv:${100.inv()}")
    println("inv:${(-100).inv()}")
    println("inv:${11.inc()}")
    //1 and 10 = 0; 1 or 10 = 3;
    check('\u0151')
}

fun check(c: Char) {
    println("thi char is $c")
    var char = 'a'
    if(c == char){
        println("thi char is $char")
    }
}

fun grammarOrNull(){
    val fruits = getNull('c')
    val fruit = fruits?.firstOrNull() ?: "none"
    println("fruit:$fruit")
    println("fruit[0]${fruits?.get(0)}")
    var iterator = fruits?.iterator()
    while (iterator?.hasNext() == true){
        println("iterator:${iterator.next()}")
    }

    // 创建一个 Array<String> 初始化为 ["0", "1", "4", "9", "16"]
    val asc = Array(5) { it -> (it * it).toString()}
    asc.forEach { println(it) }

    val x: IntArray = intArrayOf(1, 2, 3)
    x[0] = x[1] + x[2]
}

fun getNull(c: Char): Array<String>? {
    return if(c == 'c'){
        arrayOf("a","b")
    }else{
        null
    }
}

@ExperimentalUnsignedTypes
fun unsignedGrammar(){
    val b: UByte = 1u  // UByte，已提供预期类型
    val s: UShort = 1u // UShort，已提供预期类型
    val l: ULong = 1u  // ULong，已提供预期类型

    val a1 = 42u // UInt：未提供预期类型，常量适于 UInt
    val a2 = 0xFFFF_FFFF_FFFFu // ULong：未提供预期类型，常量不适于 UInt

    val a = 1UL // ULong，即使未提供预期类型并且常量适于 UInt
}

fun stringGrammar() {
    var str = "hzy_xym"
    str.map { print("$it ") }
    println("\n${str[2]}")
    val s = "abc" + 1
    println(s + "def")
    val hello = "Hello, world!\n"
    println(hello)

    val price = """
        ${'$'}9.99
        """.trimIndent()
    println(price)

    val text = """
        |Tell me and I forget.\t\n
        |Teach me and I remember.
        |Involve me and I learn.
        |(Benjamin Franklin)
        """.trimMargin()
    println(text)
    println("int max :${Int.MAX_VALUE}")
    println("uint max :${UInt.MAX_VALUE}")
    println("time :${24 * 60 * 60 * 1000}")
    var f : Float = 2f/3
    val l : Long = Int.MAX_VALUE + 2L
    val ll : Long = 0
    println("float twoThirds = $f")
}




