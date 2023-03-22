package aska.practise.introduction

fun main() {
    enterResultsB()
}

fun enterResultsB() {
    // variables to store subject marks
    var math: String = "";
    var eng: String = "";
    var science: String = "";
    var social: String = "";
    var swa: String = "";

    // variables to count how many entries have been entered
    var count: Int = 0
    print(sumB(math.toInt(), eng.toInt(), science.toInt(), social.toInt(), swa.toInt()))
}

fun sumB (math: Int, eng: Int, science: Int, social: Int, swa: Int) : String{
    println(averageB(math + eng + science + social + swa))
    return "Your Total Score is: ${math + eng + science + social + swa}"

}

fun averageB(sum: Int) : String {
    return "Your average Score is ${sum/ 5}"

}