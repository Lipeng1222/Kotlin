package com.micheal.kotlin.utils

import kotlin.concurrent.thread

class Person (name:String,age:Int){
    private var mName:String=name
    private var mAge:Int=age

    constructor(): this("",0)

    public fun setName(name:String){
        this.mName=name
    }

    public fun setAge(age:Int){
        this.mAge=age
    }
}