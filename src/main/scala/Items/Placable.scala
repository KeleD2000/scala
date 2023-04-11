package Items

/**
 * Placable egy trait (interface), ami az Item-ből extends-el
 */
trait Placable extends Item {

  /**
   * Felülírja a name metódus ami az Item nevét adja meg
   */
  override def name: String = ???

  /**
   * Felülírja a maxStackSize metódus aminek pozitívnak kell lennie, és megadja hogy egy adott típusú itemből egy inventory slotban mennyit rakhatsz maximum
   */
  override def maxStackSize: Int = ???
}