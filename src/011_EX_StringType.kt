/**
 * 문자열
 */

fun main(args : Array<String>) : Unit {
    var str : String = "Hello"
    println(str) //Hello

    str = str + "\nKotlin!"
    println(str) // Hello
                 // Kotlin!

    println(str[8]) //t

    val num = 10 * 8 + 3
    println(str + num) // Hello
                       // Kotlin!83
}