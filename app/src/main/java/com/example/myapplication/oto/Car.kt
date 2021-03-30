package com.example.myapplication.oto

class Car(ten: String, color: String, gheNgoi: Int) :
    Oto(ten, color, gheNgoi) {
    override fun transport() {
        println("Chở người")
    }

}