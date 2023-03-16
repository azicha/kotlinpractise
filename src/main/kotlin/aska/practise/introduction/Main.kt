package aska.practise.introduction

fun main() {
   println(sum(12, 6))
}

fun sum(x: Int, y: Int) : Int {
    val result: Int = x + y
    multiply(23, result)

    return result
}

fun multiply(x: Int, y: Int) : Int {
    val result: Int = x * y
    println("Multiplication is $result")
    divide(900, result)

    return result

}

fun divide(x: Int, y: Int) : Int {
    val result: Int = x / y
    println("Division is $result")
    subtraction(40, result)

    return result
}

fun subtraction(x: Int, y: Int) {
    println("Subtraction is ${x - y}")
}



