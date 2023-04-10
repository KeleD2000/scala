package World
import Items.Item

/**
 * ItemStack csak úgy tudjuk létrehozni, ha a darbszám nemnegatív, és legfeljebb annyi, mint az itemnek a maxStackSizeon
 * @param item Itemet tárol
 * @param db darabszámot tárol
 */
case class ItemStack(item: Item, db: Int) {
  /**
   * Megpróbálja egy stackbe rakni a két itemstacket
   *
   * @param that a másik stack amit egyesíteni akarok a jelenlegivel
   * @return Ha a két stack itemjei különböznek, akkor adjuk vissza az első koordinátán
   * a bal, a másodikon a jobb oldali eredeti stacket Optionba
   * ha egyformák, és az összes mennyiségük elfér egyben, akkor a visszaadott tuple első koordinátájába kerüljön
   * az egyberakott stack, a másodikba pedig kerüljön None, ha nem fér el, akkor a bal oldaliba
   * rakjunk amennyit lehet, a jobb oldaliba pedig a maradékot!
   */
  def +(that: ItemStack) : (ItemStack ,Option[ItemStack]) = ???

}