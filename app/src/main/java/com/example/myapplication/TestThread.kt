package com.example.myapplication

import kotlinx.coroutines.Dispatchers
import java.util.*

fun main() {
    var list = arrayListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)
    Thread {
        try {
            for (i in 0 until list.size) {
                list.remove(i)
                println("${Thread.currentThread().name} list.get($i): ${list.get(i)}")
                Thread.sleep(100)
            }
            print("\n")
        } finally {
            println("List = $list")
        }
    }.start()
    Thread {
        try {
            for (i in 0 until list.size) {
                if (i % 4 == 0) {
                    list.add(i,i+100)
                }
                println("${Thread.currentThread().name} list.get($i): ${list.get(i)}")
                Thread.sleep(100)
            }
            print("\n")
        } finally {
            println("List = $list")
        }
    }.start()
    Thread {
        try {
            for (i in 0 until list.size) {

                list.set(i, i + 5)
                println("${Thread.currentThread().name} list.get($i): ${list.get(i)}")
                Thread.sleep(100)
            }
            print("\n")
        } finally {
            println("List = $list")
        }
    }.start()


}