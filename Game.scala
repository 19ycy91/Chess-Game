# Chess-Game
Chess



class Game(board: Board, WP, BP) {
  val Player1 = WP
  val Player2 = BP
  var Allboards = List(board)
  def move(Position:(Int, Int), NewPosition:(Int,Int)): Board{
    //return board
  }
}

object Game{
  def apply(): Game = {
    val WP = scala.io.StdIn,readLine("While player name")
    val BP = scala.io.StdIn.readLine("Black player name")
    
    val WP2 = new Player(WP, "White")
    val BP2 = new Player(BP, "Black")
    
    val board = Board()
    new Game(board, WP2, BP2)
    }
  }
  
  
    
