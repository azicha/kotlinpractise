package aska.practise.introduction
fun main() {
   enterResults()
}

fun enterResults() {
    print("Enter your Mathematics score:")
    val math: String = readln()
    print("Enter your English score:")
    val eng: String = readln()
    print("Enter your Science score:")
    val science: String = readln()
    print("Enter your social Studies score:")
    val social: String = readln()
    print("Enter your Kiswahili score: ")
    val swa: String = readln()

   print(sum(math.toInt(), eng.toInt(), science.toInt(), social.toInt(), swa.toInt()))
}

fun sum (math: Int, eng: Int, science: Int, social: Int, swa: Int) : String{
    println(average(math + eng + science + social + swa))
    return "Your Total Score is: ${math + eng + science + social + swa}"

}

fun average(sum: Int) : String {
    return "Your average Score is ${sum/ 5}"

}