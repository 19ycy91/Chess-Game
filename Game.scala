package Chess
//pull request v1


/**
  * Created by Richard Yoon on 6/22/2016.
  */
class Game(board: Board, WP:Player, BP:Player) {
  val Player1 = WP
  val Player2 = BP
  var GameOver = false
  var movemade = true
  var Allboards:List[Board]=List(board)
  //Allboards::=board
  //add game over note

  def move(Position: (Int, Int), NewPosition: (Int, Int)): Boolean = {
    var Current_board = Allboards(0)
    if (Current_board.move(Position,NewPosition)) {

      val UpdatedArrayBoard = Current_board.ArrayBoard
      UpdatedArrayBoard(NewPosition._1)(NewPosition._2) = UpdatedArrayBoard(Position._1)(Position._2)
      UpdatedArrayBoard(Position._1)(Position._2)=null
      val NewBoard:Board = Current_board.copy(grid = UpdatedArrayBoard)

      Allboards::=NewBoard
      movemade = true
      //NewBoard }
    }
    else {
      movemade = false
    }
    return movemade


}
  def play(): Unit ={
    /*while (GameOver!=true){
      (var Pold, var Pnew) = scala.io.StdIn.readLine("White Player - Insert from Coordinate (x,y)")
      (var Pold1, var Pnew1) = scala.io.StdIn.readLine("White Player - Insert new Coordinate (x,y)")
      while ((Allboards(0).ArrayBoard(Pold)(Pnew)).player.Color != "White"){
        (var Pold, var Pnew) = scala.io.StdIn.readLine("White Player - that is not your piece pick new piece Insert from Coordinate (x,y)")
      }

    }*/
  }

}

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




