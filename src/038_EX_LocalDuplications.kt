/**
 * 지역 변수와 다른 함수의 지역 변수가 중복 될 때
 */

fun main(args : Array<String>) {
    val a = 52
    println(a) //52

    printA()
    printB()
}

fun printA() {
    val a = 17
    println(a) //17
}

fun printB() {
    val a = 120
    println(a) //120
}