package com.example.myapplication.oto

class Truck(name: String,var color: String,var seat: Int) :
    VehicleCar(name, color, seat) {
    override fun transport() {
        println("Transporting Cargo")
    }

    override fun printInfo(info:String) {
        println("Information Truck : $info")
    }

}