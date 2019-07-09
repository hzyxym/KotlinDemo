package com.fzs.hzy.kotlindemo

import com.fzs.hzy.baselibrary.foo.eat
import com.fzs.hzy.baselibrary.utils.*
import com.fzs.hzy.kotlindemo.entity.Customer
import kotlin.random.Random

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
//    stringGrammar()
//    testJackson()
//    testRadom()

//    testCalculate()
    testVi2()
}

fun testVi2(){
    println("commit 2")
}

fun testVi1(){
    println("commit 1")
}

fun testCalculate(){
    var a = 0
    a = a or 67108864
    println("a:$a")
    var b = 0
    b = b and 67108864.inv()
//    b = b and 67108864
    println("b:$b")
}

fun testRadom(){
   for (i in 1..4){
       println("radom:${(0..3).random()}")
   }
}

fun testArray(){
    val array = IntArray(3)
    array.forEach {
        println("it:$it")
    }

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

fun filterGrammar() {
    val fruits = listOf("apple", "orange", "banana", "pear", "are", "age", "apple")
    fruits
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.toUpperCase() }
        .forEach { println(it) }
    val fruit = fruits.firstOrNull() ?: "none"
    println(fruit)
}

fun dataClassGrammar() {
    var customer = Customer("hzy", "953624084@qq.com")
    var hzy = Customer("hzy", "953624084@qq.com")
    if (customer.equals(hzy)) {
        println("castomer is hzy $hzy")
    }
    var email = customer.email?.let { "hzy email: $it" }
    println(email)
}

fun mapGrammar() {
    val map = mapOf("a" to 1, "b" to 2, "c" to 3)
    println(map["a"])
    for ((k, v) in map) {
        println("$k -> $v")
    }
}

fun listGrammar() {
//    val values = arrayOfNulls<String>(3)
    val values = arrayOfMinusOnes(3)
    values.map { println("list $it") }
}

fun String.hzyExtend(): String {
    return this + "hzy"
}

fun arrayOfMinusOnes(size: Int): IntArray {
    return IntArray(size).apply { fill(-1) }
}

fun basicsGrammar() {
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
    if (c == char) {
        println("thi char is $char")
    }
}

fun grammarOrNull() {
    val fruits = getNull('c')
    val fruit = fruits?.firstOrNull() ?: "none"
    println("fruit:$fruit")
    println("fruit[0]${fruits?.get(0)}")
    var iterator = fruits?.iterator()
    while (iterator?.hasNext() == true) {
        println("iterator:${iterator.next()}")
    }

    // 创建一个 Array<String> 初始化为 ["0", "1", "4", "9", "16"]
    val asc = Array(5) { it -> (it * it).toString() }
    asc.forEach { println(it) }

    val x: IntArray = intArrayOf(1, 2, 3)
    x[0] = x[1] + x[2]
}

fun getNull(c: Char): Array<String>? {
    return if (c == 'c') {
        arrayOf("a", "b")
    } else {
        null
    }
}

@ExperimentalUnsignedTypes
fun unsignedGrammar() {
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
    var f: Float = 2f / 3
    val l: Long = Int.MAX_VALUE + 2L
    val ll: Long = 0
    println("float twoThirds = $f")
    //TODO show view
    println("task1")
    println("task3")
    println("task2")
    var index = 1
    index = ++index
    println("index : $index")
}

lateinit var bar33: Bar3
fun testJackson() {
    val customer = Customer("hzy", "953624084@qq.com")
    println("customer:" + JacksonUtil.toJSON(customer))
    val hzy = "{\"name\":\"hzy\",\"email\":\"953624084@qq.com\"}"

//    val userInfo = UserInfo()
//    userInfo.age = 2
//    userInfo.userName = "hzy"
//    println("user:${JacksonUtil.toJSON(userInfo)}")
//
//    val userJson = "{\"userName\":\"hzy\",\"age\":\"2\",\"nickName\":\"aa\"}"
//    val user = JacksonUtil.readValue(userJson,UserInfo::class.java)
//    println("user name:${user.userName},user age:${user.age}")
    val hzyCustomer = JacksonUtil.readValue(hzy, Customer::class.java)
    println("hzy email:${hzyCustomer.email}")
    println("customer :$hzy")

    val bar1 = Bar1()
    bar1.f()
    println("bar1 y：${bar1.y} \nbar1 x: ${bar1.x}")

    val bar3 = object : Bar3() {
        override fun eat() {
            println("bar3.eat()")
        }
    }
    bar3.eat()

    val bar3Copy = object : Bar3() {
        override fun eat() {
            println("bar3Copy eat")
        }
    }
    bar3Copy.eat()

    val bar = Bar()
    println("")
    bar.Baz().g()
    bar.bar3 = object : Bar3() {
        override fun eat() {
            println("bar3 has init")
        }
    }
    bar.testInit()
    println("isInitialized : ${::bar33.isInitialized}")

    var sub = Subclass()
    val nested = Outer.Nested()
    println("c:${sub.c} d:${sub.d}  nested.e:${nested.e} sub.nested.e:${sub.nested.e}")

    val l = mutableListOf(1, 2, 3)
    l.swap(0, 2) // “swap()”内部的“this”得到“l”的值
    l.map { println("$it") }

    printFoo(C())

    val myList = listOf<Int>(9,8,7)
    println("lastIndex:${myList.lastIndex}")

}


fun C.foo() = "c"

fun D.foo() = "d"

fun C.f(){
    println("extension")
}

fun printFoo(c: C) {
    println(c.foo())
    c.f()
}

fun Any?.toString(): String {
    if (this == null) return "null"
    // 空检测之后，“this”会自动转换为非空类型，所以下面的 toString()
    // 解析为 Any 类的成员函数
    return toString()
}

val <T> List<T>.lastIndex: Int
    get() = size - 1

fun testBranch(){
    println("测试分支")
}

fun testBranch2(){
    println("测试分支2.0.0")
    println("测试分支2.1.0")
}