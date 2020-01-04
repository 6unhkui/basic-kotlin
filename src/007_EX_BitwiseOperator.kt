/**
 * 비트 연산자
 * --------------------------
 * Kotlin      | Java
 * --------------------------
 * 15 and 7    | 15 & 7
 * 5 or 2      | 15|2
 * 15 xor 5    | 15 ^ 5
 * 32767.inv() | ~32767
 * 1 shl 3     | 1<<3
 * 8 ahr 1     | 8>>1
 * -17 ushr 2  | -17>>>2
 */

fun main(args : Array<String>) : Unit {
    println(15 and 7) //7
    println(5 or 2) //7
    println(15 xor 5) //10
    println(32767.inv()) //-32768
    println(1 shl 3) //8
    println(8 shr 1) //4
    println(-17 ushr 2) //1073741819
}