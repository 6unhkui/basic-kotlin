// a와 b 중 더 큰 수를 반환하는 함수
fun max(a : Int, b : Int) : Int = if(a > b) a else b

// a와 b 중 더 작은 수를 반환하는 함수
fun mib(a : Int, b : Int) : Int = if(a < b) a else b

// num의 절대값을 반환하는 함수
fun abs(num : Int) : Int = if(num >= 0) num else -num