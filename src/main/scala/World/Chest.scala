package World
import Items.{Item, Placable}

/**
 * Láda case class
 * @param cap a láda kapacitását írja le
 * @param id láda azonosítója
 */
case class Chest(cap: Int, id: String) extends Placable {

  /**
   * Megnézi hogy a láda üres-e
   * @return true ha igen, false ha nem
   */
  def isEmpty(): Boolean = ???

  /**
   * Visszaadja a láda-beli slotok számát
   * @return a slotok száma
   */
  def capacity(): Int = cap

  /**
   * A láda megadott pozijánlévő ItemStacket egy Option-be adja vissza
   * @param i index
   * @return ha az item stack nem üres a megadott indexen, ha 0-nál kisebb vagy legalább capacity kapott indexen akkor None
   */
  def apply(i: Int): Option[ItemStack] = ???

  /** A kapott stack berakása a chestbe.Pakoláskor
   * ha már eleve van a ládában ilyen itemből nem - full stack, akkor elsősorban azt / azokat
   * próbálja feltölteni a maximális stack méretig;
   * ha(már ezután) nincs, akkor az első üres slotba tegye a maradékot;
   * ha nincs üres slot se és még mindig van a berakni kívánt stackből, akkor a maradékot adja vissza a második koordinátán
   * @param stack stack amit be szeretnék rakni a chestbe
   * @return Ha befér az aktualizálst chestet adja vissza a bal oldali koordinátán
   *, az esetleges maradékot
   *, ami már nem fér a ládába a másodikon
   */

  def +(stack: ItemStack): (Chest, Option[ItemStack]) = ???

  /** Próbáljuk meg betenni az indexedik slotba az érkező stacket.
   * @param index a slot indexe ahova helyezni akarjuk a stacket
   * @param stack a berakni kívánt stack
   * @return Ha nincs ilyen index
   * , akkor adja vissza az eredeti ládát és az eredeti stacket;
   * ha van ilyen index
   * , akkor a visszaadott érték láda komponensében az épp berakott stack legyen
   * , az itemstack opció komponensében pedig az ezen a pozíción eredetileg lévő tartalom !(Ami lehet épp None is, ha ebben a slotban nem volt eredetileg a chestben semmi.)
   */

  def swap(index: Int, stack: ItemStack): (Chest, Option[ItemStack]) = ???

  /** Adja vissza hogy van - e a ládában a megadott itemből
   *
   * @param item amit keresünk a ládában
   * @return true ha van, false ha nincs
   */

  def contains(item: Item): Boolean = ???

  /** Adja vissza hogy összesen mennyi van a ládában a megadott itemből(adja össze azoknak a stackeknek a méretét, amikben ez az item van)
   *
   * @param item amit megakarunk számolni a ládába
   * @return összesen mennyi található a ládában az itemből
   */

  def count(item: Item): Int = ???
}
