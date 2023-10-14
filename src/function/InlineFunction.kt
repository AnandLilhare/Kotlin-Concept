package function

inline fun operation(op:() -> Unit) {
    val ref = op()
    println("Before calling op")

    println("After calling op")
}

fun main() {
    operation { println("This is actual op function") }
}