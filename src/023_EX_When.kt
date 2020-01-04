/**
 * 흐름 제어 - 조건문 When
 * : Java의 switch-case문의 업그레이드 버전
 */

fun main(args : Array<String>) : Unit {
    val score = 64

    when(score/10){
        6 -> { println("D")}
        7 -> { println("C")}
        8 -> { println("B")}
        9, 10 -> { println("A")}
        else -> { println("F")}
    }

    println("test")
}