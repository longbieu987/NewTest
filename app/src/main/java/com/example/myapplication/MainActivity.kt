package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.oto.Car
import com.example.myapplication.oto.Oto
import com.example.myapplication.oto.Truck

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var xeCon : Oto = Car("Mercedes","Black",4)
        xe.printName()
        xe.diChuyen()
        xe.transport()

        xe = Truck("Xe tải bé","Black",2)
        xe.printName("Xe cua toi")
        xe.diChuyen()
        xe.transport()


    }
}






