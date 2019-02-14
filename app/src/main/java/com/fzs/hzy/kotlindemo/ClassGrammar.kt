package com.fzs.hzy.kotlindemo

class Invoice {}

class Empty

//class Person(val fistName: String)
/*class Person constructor(val fistName : String, var lastName : String) {

    var x = fistName
    lateinit var lateString : String
    init {
        lastName = "hzy"
    }
}*/
data class Constructors(var name: String, var age: Int) {
/*    init {
        println("Init block")
    }*/
/*
    constructor(i: Int) : this() {
        println("Constructor")
    }*/
}

class Person(val name: String) {
    var children = ArrayList<Person>()
    var nonNulls: List<String> = listOfNotNull<String>(null, "a", null, "c")

    constructor(name: String, parent: Person) : this(name) {
        parent.children.add(this)
    }

    fun show() {
        nonNulls.map { println("show:$it") }
        println("name:$name")
    }
}

open class Base {
    open fun v() {
        println("base fun v")
    }

    fun nv() {
        println("base nv")
    }
}

class Derived : Base {
    constructor(name: String) : super() {
        println("name:$name")
    }
}

class Fuck : Base() {
    init {
        println("fuck sb")
    }
}

open class Foo {
    open val x: Int get() = 300
    open val y: Int get() = 250
    open fun f() {
        println("foo.f()")
    }
}

class Bar1 : Foo() {
    override val x: Int
        get() = 150

    override fun f() {
        super.f()
        println("bar1.f()")
    }
}

interface IFoo {
    val count: Int
    open fun eat()
}

class Bar2(override val count: Int) : IFoo {
    override fun eat() {
        println("eat")
    }
}

abstract class Bar3 : IFoo {
    //    override var count: Int = 0
    override val count: Int
        get() = 0

    abstract override fun eat()
}

class Bar : Foo() {
    lateinit var bar3 : Bar3
    override fun f() {
        super.f()
        println("Bar.f()")
    }

    override val x: Int get() = 0

    inner class Baz {
        fun g() {
            super@Bar.f() // 调用 Foo 实现的 f()
            println(super@Bar.x) // 使用 Foo 实现的 x 的 getter
        }
    }
    fun testInit(){
        if(this::bar3.isInitialized){
            println("bar3 has init.")
        }else{
            println("bar3 has not init.")
        }
    }
}

open class A {
    open fun f() {
        print("A")
    }

    fun a() {
        print("a")
    }
}

interface B {
    fun f() {
        print("B")
    } // 接口成员默认就是“open”的

    fun b() {
        print("b")
    }
}

interface D {
    fun f() {
        println("D")
    }
}

class C() : A(), B, D {
    override fun f() {
        super<D>.f()
    }
}

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF);

    fun showColorRGB(){
        println("this color rgb is ${rgb.toString(16)}")
    }

    companion object {
        fun parse(color: String): Color{
            return Color.valueOf(color.toUpperCase())
        }
    }
}