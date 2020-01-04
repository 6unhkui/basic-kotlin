/**
 * 매개변수(Parameter)와 인수(Argument)
 * - 매개변수를 선언할때는 var, val 키워드를 붙이지 않는다.
 *   또한, 매개변수는 val로 선언되므로 값을 수정 할 수 없다.
 */

fun main(args : Array<String>) : Unit {
    println(cToF(30)) //86.0
    // 매개변수에 저장되는 표현식 30을 인수라 함
    println(getAverage(89, 96)) //92.5
}

fun cToF(celsius:Int):Double = celsius * 1.8 + 32

fun getAverage(a : Int, b : Int):Double = (a+b)/2.0