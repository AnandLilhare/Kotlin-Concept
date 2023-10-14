package function

fun op(x:Int, op:(Int) -> Int) : Int {
    return op(x)
}

fun main() {
    // High order function call
    val valueOf = op(3) { x -> x * x }
    println("Lambda value $valueOf")

    // Anonymous function call

    val anonymousValue = op(0, fun(x):Int {
        return if(x > 10){
            0
        } else {
            x * x
        }

    })
    println("AnonymousFunctionValue $anonymousValue")
}