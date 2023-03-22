package aska.practise.introduction

fun main() {
    getResults()

}
fun getResults() {
    print("Enter your Physics marks: ")
    var physics : String = readln()
    print("Enter your Chemistry marks: ")
    var chem : String = readln()
    print("Enter your Computer marks: ")
    var comp : String = readln()
    print("Enter your CRE marks: ")
    var cre : String = readln()
    print("Enter your Biology marks: ")
    var bio : String =  readln()
    println(sumC(physics.toInt(), chem.toInt(), comp.toInt(), cre.toInt(), bio.toInt()))
}

fun sumC(physics :Int, chem: Int, comp: Int, cre: Int, bio: Int) {
    println("Your total marks is ${physics + chem + comp + cre + bio}")
    println(averageC(physics + chem + comp + cre + bio))

}

fun averageC(sum: Int)  :String{
    if ((sum / 5) >= 81 && (sum / 5) <= 100){
        println("Your grade is A")
    } else if ((sum / 5) >=71  && (sum / 5) <= 80){
        println("Your grade is B")
    } else if ((sum / 5) >= 61 && (sum / 5) <= 70){
        println("Your grade is C")
    } else if ((sum / 5) >= 51 && (sum / 5) <= 60 ) {
        println("Your grade is D")
    } else{
       println("Fail")
    }
    return "Your average score is ${sum/5}"
}