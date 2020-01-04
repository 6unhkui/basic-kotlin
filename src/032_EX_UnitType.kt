/**
 * Unit 타입
 * : Unit은 Java의 void에 대응되는 개념이지만 완전히 같지는 않음.
 *   void는 반환값이 없음을 의미하는 특수 타입이지만, Unit은 close 키워드로 정의된 일반 타입
 *   Java의 Void 클래스와 비슷한 개념이라 생각하면 됨.
 *   Unit 타입을 반환하는 함수는 암묵적으로 Unit 타입의 객체를 return 하게 되어있음.
 *   Unit 타입은 싱글톤 인스턴스이므로 매번 객체를 생성하지는 않는다.
 */

fun main(args : Array<String>) : Unit {
    println(celsiusToFah(27))
}

fun celsiusToFah(celsius: Int) : Unit {
    println(celsius * 1.8 + 32)
}