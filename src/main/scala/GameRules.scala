import Items.{Armor, Consumable, Equipment, Item, Placable, Weapon}

case class GameRules(){

  def getItems(p: Item => Boolean): Vector[Item] = ???

  def getPlacable(): Vector[Placable] = ???

  def getWeapons(): Vector[Weapon] = ???

  def getArmor(): Vector[Armor] = ???

  def getEquipment(): Vector[Equipment] = ???

  def getConsumable(): Vector[Consumable] = ???

}
