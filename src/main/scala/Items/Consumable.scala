package Items

/**
 * Egy olyan case class, amibe azok az itemek vannak, ami az Item-ből extends-el
 * amiket meg lehet enni
 * és eltárolja hogy milyen effekteket és milyen időtartamra adnak
 * @param name Item neve
 * @param maxStackSize inventory slot maxmimuma egy adott Itemnek
 */
case class Consumable(name: String, maxStackSize: Int = 1) extends Item {

}
