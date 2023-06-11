package programmes

class Palidromteat {
}

fun isPalindrome(str: String): Boolean {
    val formattedStr = str.replace(Regex("[^A-Za-z0-9]"), "").toLowerCase()
    return formattedStr == formattedStr.reversed()
}

fun modifyPalindrome(str: String): String {
    if (!isPalindrome(str)) {
        return "IMPOSSIBLE" // Not a palindrome, cannot modify
    }

    val charArray = str.toCharArray()
    for (i in charArray.indices) {
        for (c in 'a'..'z') {
            if (c != charArray[i]) {
                val originalChar = charArray[i]
                charArray[i] = c
                val modifiedStr = String(charArray)
                if (modifiedStr < str && !isPalindrome(modifiedStr)) {
                    return modifiedStr
                }
                charArray[i] = originalChar // Restore the original character if no suitable modification found
            }
        }
    }

    return "IMPOSSIBLE" // No suitable modification found
}

fun main() {
    val inputString = "acca"
    val modifiedString = modifyPalindrome(inputString)


    println(modifyPalindrome(inputString))
}
