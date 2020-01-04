/**
 * 비교 연산자
 * : Kotlin에서 ==, != 연산자는 Java의 equals 메소드르 호출한 것과 같다.
 *   Java처럼 참조값끼리 비교하려면 ===, !== 연산자를 사용해야 한다.
 */

fun main(args : Array<String>) : Unit {
    var isRight : Boolean = (10 + 70) > (3 * 25)
    println(isRight) //true

    isRight = false
    println(isRight) //false

    isRight = 30 == (10 + 20)
    println(isRight) //true

    isRight = 0.00001f == 0.005f * 0.002f
    println(isRight) //false

    isRight = 3.0 * 5 + 2.7 <= 16
    println(isRight) //false
}