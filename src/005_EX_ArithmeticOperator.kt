/**
 * 산술 연산자
 */

fun main(args : Array<String>) : Unit {
    val num: Int = 15 - 4 + 3
    val num2 : Int = 65 % 7
    val num3 : Double = 7.5 / 5 + 22.25
    val num4 : Double = num / num2 + 0.7
    val num5 : Double = num.toDouble() + 4

    println(num) //14
    println(num2) //2
    println(num3) //23.75
    println(num4) //7.7
    println(num5) //18.0
}