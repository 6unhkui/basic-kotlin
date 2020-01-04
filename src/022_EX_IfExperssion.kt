/**
 * if~else를 표현식으로 사용하기
 * - if와 else가 모두 갖춰져 있으면 if~else 부분 전체가 표현식이 된다.
 *
 * * if~else 표현식을 삼항 연산자처람 사용 가능하므로 코틀린에는 삼항 연산자가 존재하지 않는다.
 */

fun main(args : Array<String>) : Unit {
    val value : Int = if(10 > 5) {
        println("10은 5보다 크다.")
        10
    }else {
        println("10은 5보다 크지 않다.")
        5
    }

    println(value) //10
}