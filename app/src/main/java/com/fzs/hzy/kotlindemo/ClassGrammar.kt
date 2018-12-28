package com.fzs.hzy.kotlindemo

class Invoice {}

class Empty

//class Person(val fistName: String)
class Person constructor(val fistName : String, var lastName : String) {

    var x = fistName
    lateinit var lateString : String
    init {
        lastName = "hzy"
    }
}
