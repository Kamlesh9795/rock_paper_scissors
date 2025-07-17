package rock_paper_scissors

val player1 = PlayerInputHandle("Player1")
val player2 = PlayerInputHandle("Player2")

val displayHandler = Display()
val gameHandler = GameStart()

var countRound = 1
var player1RoundResult = 0
var player2RoundResult = 0

fun main() {
    print("Enter your Name or skip: ")
    val playerName = readln()
    println()

    if (playerName.compareTo("skip") != 0){
        player1.setPlayerName(playerName)
        player2.setPlayerName("Computer")
    }

    displayHandler.welcomeMsg()
    Thread.sleep(500)

    val result = gameHandler.gameStart()
    displayHandler.displayGameResult(result)
}





