package programmes

import java.util.*

class Palindrome {

    //function to check string is palindrome or not
    fun isPalindromeString(inputStr: String): Boolean {
        val sb = StringBuilder(inputStr)

        //reverse the string
        val reverseStr = sb.reverse().toString()

        //compare reversed string with input string
        return inputStr.equals(reverseStr, ignoreCase = true)
    }

    fun isPalindromeString(num: Int): Int {
        var reversedInteger = 0
        var remainder: Int
        var number = num
        // reversed integer is stored in variable
        while (number != 0) {
            remainder = number % 10
            reversedInteger = reversedInteger * 10 + remainder
            number/= 10
        }
       return reversedInteger
    }
}

fun main() {
    //Input Stream
    val sc = Scanner(System.`in`)

    //Input String Value
    println("Enter String : ")
    val inString: String = sc.nextLine()
     val palindrome = Palindrome()
    //Call function to check String
    if (palindrome.isPalindromeString(inString)) {
        println("$inString is a Palindrome String")
    } else {
        println("$inString is not a Palindrome String")
    }
    println("Enter integer:")
    var num = sc.nextInt()
    if (num == palindrome.isPalindromeString(num)) {
        println("$num is a Palindrome String")
    } else {
        println("$num is not a Palindrome String")
    }
}