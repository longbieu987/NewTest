package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.oto.Car
import com.example.myapplication.oto.Rickshaw
import com.example.myapplication.oto.VehicleCar
import com.example.myapplication.oto.Truck

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var xe  = Rickshaw("Mercedes","Black",4)
        xe.pullCar("Car")

        var xe2 = Truck("Small Truck","Black",2)
        xe2.pullCar("Car")

    }


}






