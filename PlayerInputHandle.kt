package rock_paper_scissors

class PlayerInputHandle(private var playerName: String) {

    private fun isValidChoice(choice: String): String {
        val valid: String = when (choice) {
            Move.ROCK.optionName, 1.toString(), 4.toString() -> Move.ROCK.optionName
            Move.PAPER.optionName, 2.toString(), 5.toString() -> Move.PAPER.optionName
            Move.SCISSORS.optionName, 3.toString(), 6.toString() -> Move.SCISSORS.optionName
            else -> "Invalid Option..."
        }

        if (valid.compareTo("Invalid Option...") == 0) {
            println("Please Choose valid option...")
            getInput()
        }

        return valid
    }


    fun getInput(): String {
        println("Enter your choice:\n 1. Rock\n 2. Paper\n 3. Scissors")
        val getChoice = readlnOrNull().toString()
        return isValidChoice(getChoice)
    }


    fun generateChoice(): String {
        val range = 1..6
        val choice = range.random()

        return isValidChoice(choice.toString())
    }

    fun getPlayerName(): String {
        return playerName
    }

    fun setPlayerName(playerName: String) {
        this.playerName = playerName;
    }

}