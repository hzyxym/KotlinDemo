package com.fzs.hzy.baselibrary.foo

fun showBar(){
    println("this is foo.showBar.")
}

fun showTitle(){
    println("this is foo.title")
}

fun eat(){
    println("eat some foo.fruits")
}


class Bar{
    fun getBar(){
        showBar()
    }

    fun getTitle(){
        showTitle()
    }

    fun getDrink(){
        eat()
    }
}