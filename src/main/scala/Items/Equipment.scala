package Items

/**
 * Egy olyan case class, amibe fix számú eqiupment slotjuk van
 * maximum egy Equipment-je lehet
 * @param name Item neve
 * @param maxStackSize inventory slot maxmimuma egy adott Itemnek
 */
case class Equipment(name: String, maxStackSize: Int = 1) extends Item{

}
