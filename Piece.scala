//piece


abstract class Piece(val player:Player){
  def allowedmoves;
  }
  
class p(player:Player) extends Piece(player){
  def allowedmoves(Position:(Int,Int))={
    if (player.color == "W"){
      if (y>0){
        Array((x,y-1))
      }
      else return Array()
    }
    else{
      if (y<7){
        return Array(x,y+1)
      }
      else return Array()
    }
  }
  }
  
