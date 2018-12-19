package com.fzs.hzy.baselibrary.bar

fun showBar(){
    println("this is bar.showBar.")
}

fun showTitle(){
    println("this is bar.title")
}

fun drink(){
    println("eat some bar.fruits")
}

class Bar{
    fun getBar(){
        showBar()
    }

    fun getTitle(){
        showTitle()
    }

    fun getDrink(){
        drink()
    }
}