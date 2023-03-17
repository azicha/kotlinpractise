package aska.practise.introduction

fun main() {
    val fullName: String = getNames()
    val product: Int =  twoIntegers()

    println("$fullName product is: $product")
}

fun getNames() :String {
    print("Enter Your FirstName:")
    val mine : String = readln()
    print("Enter Your LastName:")
    val name : String = readln()

    return "$mine $name"
}

fun twoIntegers() : Int {
    print("Enter first number: ")
    val num1 : String = readln()

    print("Enter second number: ")
    val num2 : String = readln()

    return num1.toInt() * num2.toInt()
}


