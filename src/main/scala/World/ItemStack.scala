package World

import Items.Item

case class ItemStack(item: Item, db: Int) {

  def +(that: ItemStack) : (ItemStack ,Option[ItemStack]) = ???

}
