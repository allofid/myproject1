package com.tom

fun main() {
//    print("Hello")
    Human().hello()
    val h = Human()
    h.hello()
}

class Human {
    fun hello() {
        println("Hello kotlin")
    }
}
