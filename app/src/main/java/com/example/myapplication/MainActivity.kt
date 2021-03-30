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
        xeCon.printName()
        xeCon.diChuyen()
        xeCon.transport()

        xeCon = Truck("Xe tải bé","Black",2)
        xeCon.printName("Xe cua toi")
        xeCon.diChuyen()
        xeCon.transport()


    }
}






