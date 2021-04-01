package com.example.myapplication

fun main(){
    val list: MutableList<Int> = ArrayList<Int>(listOf(4))
    list.addAll(listOf(3,4,2,341,23,4,2,3))
    println(list)
    var a :List<Int> = ArrayList(list)

    println(a.size)
}
