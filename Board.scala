//Board

case class Board(grid: Array[Array(Piece)]){
  val ArrayBoard = grid
  def move(Position:(Int,Int),NewPosition:(Int,Int)):Boolean={
    // check if new position can be achieved from previos position
    //if yes return true
    //if no return false 
    
  }
}

object Board{
  def apply(WP2:Player, BP2:Player): Board ={
    NewGrid=Array.ofDim[Piece](8,8)
    val PB1 = new p(WP2) // dummy pawns
    val PW8 = new p(BP2) // dummy pawns
    NewGrid(0)(1) = PB1 
    NewGrid(7)(6)=PW8
    
  }
}
