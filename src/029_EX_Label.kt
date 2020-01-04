/**
 * 레이블
 * : 레이블은 특정 반복문에 붙인 이름
 */

fun main(args : Array<String>) : Unit {
    var x = 0
    var y = 0

    outer@ while (x <= 20){ //레이블을 지정함
        y = 0
        while(y <= 20) {
            if(x + y == 15 && x - y == 5)
                break@outer //break@레이블명 을 실행하면 그 레이블에 해당하는 반복문을 빠져나옴
            y += 1
        }
        x += 1
    }

    println("x : $x, y: $y") //x : 10, y: 5
}