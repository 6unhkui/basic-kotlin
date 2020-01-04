/**
 * 정수와 실수
 */

fun main(args : Array<String>) : Unit {
    val a : Byte = 125
    val b : Short = (100 + 200) + 100
    var c : Int = 12_4356_6789
    c = 0xFF_88_88
    c = 0b01010010_01100011_01110101_01000101
    var d : Long = -543_7847_3984_7238_4723
    // 언더스코어를 넣어 숫자를 좀 더 알아보기 쉽게 표현 가능함 (위치, 개수는 제한이 없음 / 실수 타입의 리터럴에도 적용 가능)

    c = a + b
    d =  c + 10L

    var e : Float = 67.6f
    val f : Double = 658.456
    e = (e + f).toFloat()
    println(e) //726.05597
}