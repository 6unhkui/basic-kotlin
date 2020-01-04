/**
 * 문자열 안에 표현식의 값 집어넣기
 */

fun main(args : Array<String>) : Unit {
    val a = 10
    val b = 20

    println("a의 값 : $a") // a의 값 : 10
    println("b의 값 : $b") // b의 값 : 20
    // '$' 뒤에 변수 이름을 적으면 해당 부분은 변수의 값으로 대체함

    println("a + b = ${a + b}") // a + b = 30
    // 표현식의 값을 문자열에 포함하고 싶으면 ${표현식}으로 적음
}