package Entitys

import World.Chest

case class Player(name: String, id: String, baseStat: EntityStats, currentHP: Int, position: Position, capacity: Int, inventory: Chest, equipmentSlots: Int) extends Entity{

}
