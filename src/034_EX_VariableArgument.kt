/**
 * 가변 인수
 * : N개의 인수를 받고 싶을 경우 vararg 키워드를 매개변수 앞에 붙인다
 *
 * - 가변 인수는 일반 인수와 함께 사용할 수 있다
 * fun function(something: Char, vararg number:Int): Int
 * 호출 => function(Char 타입 인수, N개의 Int 타입의 인수)
 *
 * * 일반 인수가 가변 인수보다 오른쪽에 있을 경우, 인수에 매개변수의 이름을 붙여야 한다
 * fun function(vararg number:Int, something: Char): Int
 * 호출 => function(N개의 Int 타입의 인수, something = Char 타입 인수)
 */

fun main(args : Array<String>) {
    println(getSumOf(1, 2, 3, 4, 5, 6, 7)) //28
    println(getSumOf(32, 57, 12)) //101
    println(getSumOf()) //0
}

fun getSumOf(vararg numbers: Int) : Int {
    val count = numbers.size
    var i = 0
    var sum = 0

    while (i < count){
        sum += numbers[i]
        i += 1
    }
    return sum
}