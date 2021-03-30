package com.example.myapplication.oto

import com.example.myapplication.CanPullCar

class Truck(name: String,var color: String,var seat: Int) :
    VehicleCar(name, color, seat), CanPullCar {
    override fun transport() {
        println("Transporting Cargo")
    }

    override fun pullCar(car:String) {
        println("Truck Pull $car")
    }

}