package com.example.myapplication

import kotlinx.coroutines.runBlocking

fun main(){
    var list = arrayListOf(0,1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)
    val thread1 =Thread {
        try {
                for(i in list.size-1 downTo 0) {
                    if (i % 2 == 0) {
                        println("${Thread.currentThread().name} Xóa ptu thứ $i : ${list.get(i)}")
                        list.remove(i)
                    }
                    Thread.sleep(50)
                }
        } finally {
            println("List sau chỉnh sửa = $list")
            print("\n")
        }
    }
    val thread2 =Thread {
        try {
            for (i in 0 until list.size) {
                if (i % 4 == 0) {
                    println("${Thread.currentThread().name} Thêm ptu vào vtri $i: ${i+100}")
                    list.add(i, i + 100)
                }
                Thread.sleep(50)
            }
        } finally {
            println("List sau chỉnh sửa = $list")
            print("\n")
        }
    }
    val thread3 = Thread {
        try {
            for (i in 0 until list.size) {
                println("${Thread.currentThread().name} Sửa ptu thứ $i: ${list.get(i)} = ${i+5}")
                list.set(i, i + 5)
                Thread.sleep(50)
            }
        } finally {
            println("List sau chỉnh sửa = $list")
            print("\n")
        }
    }
    thread1.start()
    thread1.join()
    thread2.start()
    thread2.join()
    thread3.start()
    thread3.join()
}