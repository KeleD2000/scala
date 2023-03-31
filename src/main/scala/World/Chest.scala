package World

import Items.{Item, Placable}

case class Chest(cap: Int, id: String) extends Placable{

  def isEmpty(): Boolean = ???

  def capacity(): Int = cap

  def apply(i: Int): Option[ItemStack] = ???

  def +(stack: ItemStack): (Chest, Option[ItemStack]) = ???

  def swap(index: Int, stack: ItemStack): (Chest, Option[ItemStack]) = ???

  def contains(item: Item): Boolean = ???

  def count(item: Item): Int = ???
}