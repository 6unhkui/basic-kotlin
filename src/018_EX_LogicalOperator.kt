/**
 * 논리 연산자
 */

fun main(args : Array<String>) : Unit {
    val a = 15
    val b = 17

    var bool : Boolean = (a - b < a + b) && (a == b)
    println(bool) //false

    bool = !((a + b) > (a * 3) || (b - a) > 0)
    println(bool) //false
}