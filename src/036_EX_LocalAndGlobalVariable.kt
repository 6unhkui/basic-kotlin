/**
 * 지역 변수와 전역 변수
 */

var count = 0

fun main(args : Array<String>) {
    var a = 15
    println(a)

    count += 1
    printCount()
    println(count)
}

fun printCount() {
    println(count)
    count ++
};