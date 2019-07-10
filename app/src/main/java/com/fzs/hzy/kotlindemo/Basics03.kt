package com.fzs.hzy.kotlindemo

import kotlin.properties.Delegates
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

fun main(vararg args : String){
//    test()
//    testHzyClass()
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
    clear()
}

fun clear(vararg items : Int?){
    if(items == null){
        //不会调用
        println("clear items is null")
        return
    }
    items.forEach { println("this is $it") }
}

fun testEnum(){
    val color = Color.parse("red")
    val color2 = Color.valueOf("RED")
    val color3 = Color.RED
    val colors = Color.values()
    colors.forEach { println(it) }
    println(color3)
    color.sayColor()
    color.showColorRGB()
}

/**
 * Create by hzy
 */
fun Color.sayColor(){
    val say = when(this){
        Color.RED -> "this is red"
        Color.GREEN -> "this is green"
        Color.BLUE -> "this is blue"
    }
    println("say:$say")
}


fun testHzyClass(){

    val ab = object : AClass(1), BInterface {
        override fun sayHello() {
            print("hello")
        }
        override val y: Int
            get() = 15

        var counter = 0
            get() = field + 1
            set(value) {
                if (value >= 0) field = value
            }

        override var x: Int = 0
            get() = field +2
            set(value) {
                if (value >= 0) field = value
            }
    }

    ab.x = 2
    ab.counter = 12
    println("counter:${ab.counter},x:${ab.x}")
//    foo()
    val e = Example()
//    e.y = "NEW"
    println(e.y)

    val lazyValue: String by lazy {
        println("computed!")
        "Hello"
    }
    println(lazyValue)
    println(lazyValue)

    var max: Int by Delegates.vetoable(0) { property, oldValue, newValue ->
        newValue > oldValue
    }
    var name:String by Delegates.observable("hzy"){ kProperty: KProperty<*>, s: String, s1: String ->
        println("$s -> $s1")
    }
    name = "xym"

    println(max) // 0

    max = 10
    println(max) // 10

    max = 5
    println(max) // 10

    val user = User()
    user.name = "first"
    user.name = "second"
}

fun foo() {
    val adHoc = object {
        var x: Int = 0
        var y: Int = 0
    }
    print(adHoc.x + adHoc.y)
}


class Example {
    var p: String by Delegate()
    var y: String by DelegateY()
}

class DelegateY : ReadWriteProperty<Example, String> {
    override fun getValue(thisRef: Example, property: KProperty<*>): String {
        return "$thisRef, thank you for delegating '${property.name}' to me!"
    }

    override fun setValue(thisRef: Example, property: KProperty<*>, value: String) {
        println("$value has been assigned to '${property.name}' in $thisRef.")
    }

}


class Delegate{
    operator fun getValue(thisRef: Any?, property: KProperty<*>):String{
        return "$thisRef, thank you for delegating '${property.name}' to me!"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("$value has been assigned to '${property.name}' in $thisRef.")
    }
}

class User {
    var name: String by Delegates.observable("<no name>") {
            prop, old, new ->
        println("$old -> $new")

    }
}
