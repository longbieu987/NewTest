package com.example.myapplication.oto

abstract class Oto(ten : String, color: String, gheNgoi:Int) {
    var name:String = ten
        get() = field
        // setter
        set(name) {
            field = name
        }
    private var color:String = color
        get() = field
    set(color){
        field =color
    }
    private var gheNgoi:Int = gheNgoi
        get() = field
        set(color){
            field =color
        }

    abstract fun transport()
    fun diChuyen(){
        println("Đi chuyển bằng bánh xe")
    }
    fun printName(name : String){
        println("Name = $name")
    }
    fun printName(){
        println("Name = $name")
    }
}