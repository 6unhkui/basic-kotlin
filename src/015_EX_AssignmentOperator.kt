/**
 * 배정 연산자 (=)
 * : 변수에 값을 저장할 떄 사용하는 연산자
 */

fun main(args : Array<String>) : Unit {
    val a : Int
    var b : Int

    a = 10 + 5
    b = 10

    b += a //b에 a를 누적
    println(b) //25

    b %= 3 //b를 3으로 나눈 나머지를 b에 저장
    println(b) //1
}