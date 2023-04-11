import Items.{Armor, Consumable, Equipment, Item, Placable, Weapon}

/**
 * Egy olyan case class, ami tartalmaza a világban lévő összes item típust
 * és az alkalmazható összes receptet
 */
case class GameRules(){

  /**
   * Visszaadja az összes Itemet amire igaz a predikátum
   * @param p predikátum
   */
  def getItems(p: Item => Boolean): Vector[Item] = ???

  /**
   * Visszaadja az Placable Itemeket amire igaz a predikátum
   * @param p predikátum
   */
  def getPlacables(p: Item => Boolean): Vector[Placable] = ???

  /**
   * Visszaadja az Weapons Itemeket amire igaz a predikátum
   * @param p predikátum
   */
  def getWeapons(p: Item => Boolean): Vector[Weapon] = ???

  /**
   * Visszaadja az Armors Itemeket amire igaz a predikátum
   * @param p predikátum
   */
  def getArmors(p: Item => Boolean): Vector[Armor] = ???

  /**
   * Visszaadja az Equipments Itemeket amire igaz a predikátum
   * @param p predikátum
   */
  def getEquipments(p: Item => Boolean): Vector[Equipment] = ???

  /**
   * Visszaadja az Consumables Itemeket amire igaz a predikátum
   * @param p predikátum
   */
  def getConsumables(p: Item => Boolean): Vector[Consumable] = ???

}
