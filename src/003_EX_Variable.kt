/**
 * 변수
 * 1) Kotlin은 Java와 달리 원시 타입이 없다.
 *    Java의 Wrapper 클래스가 Kotlin에서는 기본 타입이 되었다고 생각하면 됨
 * * 원시 타입이 객체가 되었지만 성능상 문제가 되지 않음
 * => 코틀린 컴파일러가 어느정도의 최적화를 해줌.
 *    기본타입에 null을 저장하거나 제너릭에 사용하지 않으면 원시 타입의 자바 바이트 코드를 생성함
 *
 * 2) var / val 차이
 * - var : 일반 변수
 * - val : Java의 final 변수(상수)로 불변변수
 */

fun main(args: Array<String>) : Unit {
    var total : Int
    total = 0

    val a: Int = 10 + 53 - 7
    println(a) //56

    val b: Int = 43 + 75 + a
    println(b) //174

    total = a + b
    println(total) //230
}