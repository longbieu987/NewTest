package com.example.myapplication.oto

import com.example.myapplication.CanPullCar

class Rickshaw(name: String, color: String, seat: Int) : VehicleCar(name, color, seat),
    CanPullCar {

    override fun transport() {
        println("Transporting Car")
    }

    override fun pullCar(car: String) {
        println("Rickshaw Pull $car")
    }
}