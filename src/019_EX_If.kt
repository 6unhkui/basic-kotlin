/**
 * 흐름 제어 - 조건문 If
 */

fun main(args : Array<String>) : Unit {
    var a = 15
    var b = 11

    if(a > b) {
        println("if문 안으로 들어옴")
        a -= b
    }

    println(a) //4
}