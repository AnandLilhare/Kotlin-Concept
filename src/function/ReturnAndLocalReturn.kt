package function

fun containingFunction(){
    val numbers = 1..100

    numbers.forEach {
        if (it % 5 == 0) {
            return@forEach
        }
    }
    println("Hello!")
}

fun main() {
containingFunction()
}