package Chess



/**
  * Created by Richard Yoon on 6/22/2016.
  */
class Game(board: Board, WP:Player, BP:Player) {
  val Player1 = WP
  val Player2 = BP
  var Allboards:List[Board]=List(board)
  //Allboards::=board
  //add game over note

  def move(Position: (Int, Int), NewPosition: (Int, Int)): Board = {
    var Current_board = Allboards(0)
    if (Current_board.move(Position,NewPosition)) {

      val UpdatedArrayBoard = Current_board.ArrayBoard
      UpdatedArrayBoard(NewPosition._1)(NewPosition._2) = UpdatedArrayBoard(Position._1)(Position._2)
      UpdatedArrayBoard(Position._1)(Position._2)=null
      val NewBoard:Board = Current_board.copy(grid = UpdatedArrayBoard)

      Allboards::=NewBoard
      //NewBoard }
    }
    Allboards(0)
}}

object Game{
  def apply(): Game ={
    val WP = scala.io.StdIn.readLine("White player name")
    val BP = scala.io.StdIn.readLine("Black player name")

    val WP2 = new Player(WP,"White")
    val BP2 = new Player(BP,"Black")

    val board = Board(WP2,BP2)
    new Game(board, WP2, BP2)

  }

}
