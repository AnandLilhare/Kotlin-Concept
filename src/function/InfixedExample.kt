package InfixedFuction




infix fun String.shouldBeEqualTo(value:String) = this == value

fun main() {
    val shouldBeEqualTo = "Hellow".shouldBeEqualTo("Hellow")
    println(shouldBeEqualTo)

    // Infix example

    val infiShouldBeEqualeTo = "Hellow" shouldBeEqualTo "Hellow"
    println(infiShouldBeEqualeTo)
}