package com.fzs.hzy.kotlindemo.entity

import com.fzs.hzy.baselibrary.bar.Bar as bBar

import com.fzs.hzy.baselibrary.foo.Bar

fun main(args: Array<String>) {
    var bar = bBar()
    bar.getBar()
    bar.getTitle()
    bar.getDrink()

    var foo = Bar()
    foo.getBar()
    foo.getTitle()
    foo.getDrink()

    com.fzs.hzy.baselibrary.foo.showBar()
}