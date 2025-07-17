package rock_paper_scissors

class Display() {
    fun displayRoundResult(result: String) {
        when (result) {
            player1.getPlayerName() -> {
                player1RoundResult++
                nextRoundMsg(result)
            }

            player2.getPlayerName() -> {
                player2RoundResult++
                nextRoundMsg(result)
            }

            else -> println("Game is Tie. So let's start again round $countRound")
        }
    }

    private fun nextRoundMsg(result: String) {
        println("Round-$countRound result is:\n$result is Win!")
        if (countRound < 3){
            println("Move to next round...")
        }
    }

    fun welcomeMsg() {
        val welcomeMsg = "Welcome ${player1.getPlayerName()}! to Rock-Paper-Scissors! Let's start the game."
        println(welcomeMsg)
    }

    fun gameResult(): String {
        val result: String = when {
            player1RoundResult > player2RoundResult -> player1.getPlayerName()
            else -> player2.getPlayerName()
        }
        return result
    }

    fun displayGameResult(result: String) {
        println()
        println("-------------------- Game Over! --------------------")
        println("${player1.getPlayerName()} win round is: $player1RoundResult")
        println("${player2.getPlayerName()} win round is: $player2RoundResult")
        println()
        println("------ Congratulations $result is win! -------")
    }

    fun displayBothMove(player1Move:String, player2Move: String) {
        print("${player1.getPlayerName()} -> $player1Move and ")
        println("${player2.getPlayerName()} -> $player2Move")
    }
}