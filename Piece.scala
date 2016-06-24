package Chess
import scala.math._
//pull request v1
/**
  * Created by Richard Yoon on 6/22/2016.
  */
abstract class Piece(val player:Player) {
  def allowedMoves(Positions:(Int,Int)):List[(Int,Int)]
  def pathtaken(Position:(Int,Int),NewPosition:(Int,Int)):List[(Int,Int)]



}

//types
//p r n b q k

//position will be stored in the board
//dummy class pawn that only goes up and down
class p(player:Player) extends Piece(player){
  override def allowedMoves(Position:(Int,Int)):List[(Int,Int)]={
    if (player.Color =="W"){
      if ( Position._2 >0){
        List((Position._1,Position._2-1))
      }
      else List()
    }
    else{
      if (Position._2<7){
        List((Position._1,Position._2+1))
      }
      else List()
    }
  }
  override def pathtaken(Position:(Int,Int),NewPosition:(Int,Int)):List[(Int,Int)]={
    val step:Int = (NewPosition._2 - Position._2)
    val step1:Int = step/abs(step)
    var PathTaken = List[(Int,Int)]()
    var movespot = Position._2
    while (NewPosition._2!=movespot){
      movespot+=step1
      PathTaken::=((Position._1,movespot))
    }
    return PathTaken
  }
  }




