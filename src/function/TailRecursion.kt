package function

fun factorialNumber(num : Int) : Int {
    return when(num) {
        1,0 -> 1
        else -> num * factorialNumber(num - 1)
    }
}


tailrec fun factorialNumberTrc(num : Int, accumatoreValue : Int = 1) : Int {
    return when(num) {
        0 -> accumatoreValue
        else -> factorialNumberTrc(num - 1, accumatoreValue * num)
    }
}
fun main() {
    //println("Factorial number of 5 is ${factorialNumber(5)}")
    println("Factorial number of 5 is ${factorialNumberTrc(5, 1)}")
}