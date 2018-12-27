package com.fzs.hzy.kotlindemo.entity

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

data class Customer(val name: String, val email: String)

@JsonIgnoreProperties(ignoreUnknown = true)
class UserInfo(){
    var userName : String = ""
    var age : Int = 0
}
