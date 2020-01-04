/**
 * 함수 (Function)
 */

fun main(args : Array<String>) : Unit {
    println(myFunction())
    //a : 3, b : 6
    //9
    println(myFunction() + 10)
    //a : 3, b : 6
    //19
}

fun myFunction() : Int {
    val a = 3
    val b = 6
    println("a : $a, b : $b")
    return a + b
}