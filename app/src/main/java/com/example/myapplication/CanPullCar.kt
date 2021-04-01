package com.example.myapplication

interface CanPullCar {
    fun pullCar(info:String)
    fun hello() = "Hello there"
    fun abc(a:Int){
        print("hello $a")
    }
}