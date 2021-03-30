package com.example.myapplication.oto

abstract class VehicleCar(name : String, color: String, seat:Int) {
    var name:String = name
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
    private var seat:Int = seat
        get() = field
        set(color){
            field =color
        }

    abstract fun transport()
    fun move(){
        println("Move by wheel ")
    }
    fun printName(name : String){
        println("Name = $name")
    }
    fun printName(){
        println("Name = $name")
    }
}