/**
 * 지역 변수와 전역 변수의 이름이 중복될 때
 * - 전역 변수와 지역 변수 간에는 이름의 중복을 허용함
 */

var a = 5

fun main(args : Array<String>) {
    var a = 30
    println(a) //30
    func()
}

fun func() {
    println(a) //5
};