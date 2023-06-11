

fun main() {
    val option = arrayOf("Rock", "paper", "Scissors")
    val gameChoice = getGameChoice(option)
    val userChoice = getUserChoice(option)
    printResult(userChoice, gameChoice)
}

fun printResult(userChoice: String, gameChoice: String) {
    val result: String = if (userChoice == gameChoice) "Tie!"
    else if ((userChoice == "Rock" && gameChoice == "Scissors") || (userChoice == "Paper" && gameChoice == "Rock")
        || (userChoice == "Scissors" && gameChoice == "Paper")) "You win!"
    else "You lose!"
    println("You chose $userChoice. I chose $gameChoice. $result")
}
fun getGameChoice(option: Array<String>) = option[(Math.random() * option.size).toInt()]

fun getUserChoice(optionsParam: Array<String>): String {
    var isValideChoice = false
    var userchoice = ""
    while (!isValideChoice) {
        println("Please enter one of the following: Rock Paper Scissors.")
        for (item in optionsParam) print("$item")
        println(".")
        val userInput = readLine()
        if (userInput !=null && userInput in optionsParam){
            isValideChoice = true
            userchoice = userInput
        }
        if(!isValideChoice) println("you must enter valid choice")
    }

 return userchoice

}