/**
 * 실수 타입의 함정
 */

fun main(args : Array<String>) : Unit {
    println(0.1f + 0.1f + 0.1f) //0.3
    println(0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f) //1.0000001
    println(0.1f + 10) //1.0

    // => 실수를 계산할때는 항상 대략적인 값만 얻을 수 있다는 것을 염두해야함
}