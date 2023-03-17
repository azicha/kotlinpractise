package aska.practise.introduction

fun main() {
    println("Enter Name: ")
    val input: String = readln()

    println("Enter Age: ")
    val age : String = readln()

    println("$input age plus ten is: ${ age.toInt() + 10 }");  // "...." + age + 10
}