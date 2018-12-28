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
data class Constructors(var name: String,var age :Int) {
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

    fun show(){
        nonNulls.map { println("show:$it") }
        println("name:$name")
    }
}