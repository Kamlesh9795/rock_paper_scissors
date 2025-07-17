package rock_paper_scissors

class GameStart() {

    fun gameStart(): String {
        var player1Move: String
        var player2Move: String
        var result: String = ""
        while (countRound != 4) {
            println("------------------- Start Round-$countRound -------------------")
            player1Move = player1.getInput()
            player2Move = player2.generateChoice()
            result = checkWin(player1Move, player2Move)
            if (result.compareTo(Move.Tie.optionName) == 0) {
                displayHandler.displayBothMove(player1Move, player2Move)
                Thread.sleep(200)
                displayHandler.displayRoundResult(result)
                Thread.sleep(1000)
            } else {
                displayHandler.displayBothMove(player1Move, player2Move)
                Thread.sleep(200)
                displayHandler.displayRoundResult(result)
                Thread.sleep(1000)
                countRound++
            }
        }
        return displayHandler.gameResult()
    }

    private fun checkWin(player1Move: String, player2Move: String): String {
        return when {
            player1Move.compareTo(Move.ROCK.optionName) == 0 && player2Move.compareTo(Move.SCISSORS.optionName) == 0 -> player1.getPlayerName()
            player1Move.compareTo(Move.SCISSORS.optionName) ==0 && player2Move.compareTo(Move.PAPER.optionName) == 0 -> player1.getPlayerName()
            player1Move.compareTo(Move.PAPER.optionName) == 0 && player2Move.compareTo(Move.ROCK.optionName) == 0 -> player1.getPlayerName()
            player2Move.compareTo(Move.ROCK.optionName) == 0 && player1Move.compareTo(Move.SCISSORS.optionName) == 0 -> player2.getPlayerName()
            player2Move.compareTo(Move.SCISSORS.optionName) == 0 && player1Move.compareTo(Move.PAPER.optionName) == 0 -> player2.getPlayerName()
            player2Move.compareTo(Move.PAPER.optionName) == 0 && player1Move.compareTo(Move.ROCK.optionName) == 0 -> player2.getPlayerName()

            else -> Move.Tie.optionName
        }
    }
}