package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.annotation.UiThread
import androidx.lifecycle.LiveData
import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis
import kotlin.time.measureTime

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun showName(name1: String,name2:String,name3:String) {
            Log.d("BBB", "Show User : $name1 $name2 $name3")
        }
        suspend fun lastName() :String{
            delay(4000L)
            return "Long" }
        suspend fun middleName() : String {
            delay(3000L)
            return "Hieu"   }
        suspend fun firstName() :String{
            delay(2000L)
            return "Nguyen" }
       GlobalScope.launch{
          val time = measureTimeMillis {
              val last = async { lastName() }
              val first = async { firstName() }
              showName(first.await(),middleName(),last.await())
          }
           Log.d("BBB", "Time : $time")
       }
    }
}