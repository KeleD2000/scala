import Entitys.Player
import Items.Placable

sealed trait Request

case object Tick extends Request

case class Join(player: Player) extends Request

case class LeavePlayer(id: String) extends  Request

case class Die(id: String) extends  Request

case class Mine(id: String, position: Position) extends  Request

case class StoreItem(playerID: String, chestID: String) extends  Request

case class LootItem(playerID: String, chestID: String, index: Int) extends  Request

case class Consume(playerID: String) extends  Request

case class MoveEntity(playerID: String, position: Position) extends  Request

case class HitEntity(attackerID: String, defenderID: String) extends  Request


case class WorldState(){
  //Ide kell a Request szekvencia
  def hasRequests(): Boolean = ???

  def proccesNextRequest(request: Request):  WorldState = ???

  def proccesNextRequest():  WorldState = ???

  def players() : Vector[Player] = ???

  def apply(x: Int, y: Int): Option[Placable] = ???

  def apply(position: Position): Option[Placable] = ???

  def width(): Int = ???

  def handle(request: Request): WorldState = request match {
    case Tick => ???
    case Join(player) => ???
    case LeavePlayer(player) => ???
    case Die(id) => ???
    case Mine(id, position) => ???
    case StoreItem(playerID, chestID) => ???
    case LootItem(playerID, chestID, index) => ???
    case Consume(playerID) => ???
    case MoveEntity(playerID, position) => ???
    case HitEntity(attackerID, defenderID) => ???


  }


}