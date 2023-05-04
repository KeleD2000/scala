import Entitys.{Mob, Player, Position}
import Items.Placable

/**
 * sealed trait Request csak ebben a fájlban extendelhető
 */
sealed trait Request

/**
 * Tick egy speciális request
 */

case object Tick extends Request

/**
 * Join egy speciális request
 * @param player, aki be akar lépni a játékból.
 */

case class Join(player: Player) extends Request

/**
 * LeavePlayer egy speciális request
 * @param id aki ki akar lépni a játékból.
 */

case class LeavePlayer(id: String) extends  Request

/**
 * Die egy speciális request
 * @param id, a játékos id-je akit meg ölük..
 */

case class Die(id: String) extends  Request

/**
 * Mine egy speciális request
 * @param id, a játékos id-je aki bányászik.
 * @param position, a játékos poziciója
 */

case class Mine(id: String, position: Position) extends  Request

/**
 * StoreItem egy speciális request
 * @param playerID, a játékos id-je.
 * @param chestID, a játékoshoz tartozó chest id-je.
 */

case class StoreItem(playerID: String, chestID: String) extends  Request

/**
 * LootItem egy speciális request
 * @param playerID, a játékos id-je .
 * @param chestID, a játékoshoz tartozó chest id-je.
 * @param index, indexet jelöli
 */

case class LootItem(playerID: String, chestID: String, index: Int) extends  Request

/**
 * Consume egy speciális request
 * @param playerID, a játékos id-je .
 */

case class Consume(playerID: String) extends  Request

/**
 * MoveEntity egy speciális request
 * @param playerID, a játékos id-je .
 * @param position, a játékos poziciója
 */

case class MoveEntity(playerID: String, position: Position) extends  Request

/**
 * HitEntity egy speciális request
 * @param attackerID, a támadó id-je
 * @param defenderID, a védekező id-je
 */

case class HitEntity(attackerID: String, defenderID: String) extends  Request

/**  * A WordState objektum fogja tárolni a világot.
 *
 *@param request a világban jelenlévő requestek
 * @param player  a világban jelenlévő játékosok
 * @param mob a világban jelenlévő mobok.
 */

case class WorldState(req: Vector[Request], player: Vector[Player], mob: Vector[Mob]){
  /**
   * Megnezi van e meg feldolgozott request, es ha van visszaadja
   *
   * @return true ha van, false ha nincs
   */


  def hasRequests(): Boolean = ???

  /**
   * Soron következő requestet dolgozza fel
   *
   * @return ha nincs több feldolgozatlan request, vagy nincs benn player a játékban, akkor adjuk vissza az eredeti statet
   */

  def proccesNextNextRequest():  WorldState = ???

  /**
   * Az összes requestet dolgozza fel
   *
   * @return Visszaadja a state, ha elfogxnak a requestek
   */

  def proccesAllNextRequest():  WorldState = ???

  /**
   * A világban aktuálisan belépett játékosok
   *
   * @return a világban aktuálisan belépett játékosok
   */

  def players() : Vector[Player] = ???

  /**
   * Visszaadja az adott térképen koordinátáján lévő blokkot egy Optional[Placeble]
   * @param x a térkép x koordinátája
   * @param y a térkép x koordinátája
   * @return ha nincs ezen pozicíón blokk akkor NONE egyébként az ott lévő Placeble egy Someba
   */

  def apply(x: Int, y: Int): Option[Placable] = ???

  /**
   * Visszaadja az adott pozicíón lévő blokkot egy Optional[Placeble]
   *
   * @param position a térkép poizicíója
   * @return ha nincs ezen pozicíón blokk akkor NONE egyébként az ott lévő Placeble egy Someba
   */

  def apply(position: Position): Option[Placable] = ???

  def height(): Int = ???

  def width(): Int = ???

}