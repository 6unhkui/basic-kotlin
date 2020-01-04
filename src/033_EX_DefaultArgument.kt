/**
 * 디폴트 인수
 */

fun main(args : Array<String>) : Unit {
    println(getAverage(89,96))
    getAverage(100, 50, true)
    println(getAverage(90))
    getAverage(66, print = true)
    getAverage(print = true)
    getAverage(print = true, a = 10, b = 30)

    // 매개변수의 이름을 지정한 인수는 일반 인수들보다 항상 오른쪽에 있어야 한다
    // ex) getAverage(print = true, 10, 30)  --- Error
    //     getAverage(10, print = true, 30)  --- Error
}

fun getAverage(a : Int = 0, b : Int = 0, print:Boolean = false): Double {
    val result = (a + b) / 2.0
    if(print)
        println(result)
    return result
}