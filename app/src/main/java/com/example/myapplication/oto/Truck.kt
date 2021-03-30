package com.example.myapplication.oto

import com.example.myapplication.oto.Oto

class Truck(ten: String, color: String, gheNgoi: Int) :
    Oto(ten, color, gheNgoi) {
    override fun transport() {
        println("Chở hàng")
    }

}