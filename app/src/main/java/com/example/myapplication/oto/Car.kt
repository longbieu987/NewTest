package com.example.myapplication.oto

class Car(name: String, var color: String, var seat: Int) :
    VehicleCar(name, color, seat) {
    override fun transport() {
        println("Transporting people ")
    }

    override fun printInfo(info:String) {
        println("Information Car: $info")
    }

}