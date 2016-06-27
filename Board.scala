package Chess
//testing pull request 

/**
  * Created by Richard Yoon on 6/22/2016.
  */

//since it's case class i can use .copy(board)
case class Board(var grid: Array[Array[Piece]]){
  val ArrayBoard = grid
  var MoveBool = true
  //Array.ofDim[Piece]
  def move(Position:(Int,Int),NewPosition:(Int,Int)): Boolean= {
    val MovePiece = ArrayBoard(Position._1)(Position._2)
    val possible = MovePiece.allowedMoves(Position) contains NewPosition
    val PathTaken = MovePiece.pathtaken(Position,NewPosition)

    if (MovePiece!=null & possible!= false ){
      for (coordinate <- PathTaken){
        if (ArrayBoard(coordinate._1)(coordinate._2)!=null){ //also need to build in a case for when it's not just moving but capturing
          MoveBool = false

        }
      }
    }
    MoveBool
    
    }

  }






object Board{
  def apply(WP2:Player, BP2:Player): Board ={
    val NewGrid = Array.ofDim[Piece](8,8)
   // NewGrid(0)(0)= RB1
    //NewGrid(1)(0)= NB1
    //NewGrid(2)(0)=BB1
    //NewGrid(3)(0) = QB
    //NewGrid(4)(0)=KB
    //NewGrid(5)(0) = BB2
    //NewGrid(6)(0)=NB2
    //NewGrid(7)(0) = RB2
    val PW8 = new p(WP2)
    val PB1 = new p(BP2)

    NewGrid(0)(1)= PB1
    //NewGrid(1)(1)= PB2
    //NewGrid(2)(1)=PB3
    //NewGrid(3)(1) = PB4
    //NewGrid(4)(1)=PB5
    //NewGrid(5)(1) = PB6
    //NewGrid(6)(1)=PB7
    //NewGrid(7)(1) = PB8


    //NewGrid(0)(7)= RW1
    ///NewGrid(1)(7)= NW1
    //NewGrid(2)(7)=BW1
    //NewGrid(3)(7) = QW
    //NewGrid(4)(7)=KW
    //NewGrid(5)(7) = BW2
    //NewGrid(6)(7)=NW2
    //NewGrid(7)(7) = RW2

    //NewGrid(0)(6)= PW1
    //NewGrid(1)(6)= PW2
    //NewGrid(2)(6)=PW3
    //NewGrid(3)(6) = PW4
    //NewGrid(4)(6)=PW5
    //NewGrid(5)(6) = PW6
    //NewGrid(6)(6)=PW7
    NewGrid(7)(6) = PW8

    //fill array with pieces
    //put arraly in board
    //return board
    new Board(NewGrid)
  }

}

