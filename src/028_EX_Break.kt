/**
 * 흐름 제어 break
 */

fun main(args : Array<String>) : Unit {
    var i = 0
    while(true) {
        i += 1
        if(i >= 5)
            break //이 문장이 실행되는 순간 while 블록을 탈출
        print(i) //1234
    }
}