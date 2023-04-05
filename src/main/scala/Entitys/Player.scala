package Entitys

import World.Chest
import Effects.{Duration, Effect}

case class Player(name: String, id: String, baseStat: EntityStats, currentHP: Int, position: Position, capacity: Int, inventory: Chest, equipmentSlots: Int, activeEffect: Map[Effect, Duration]) extends Entity{
  override def baseStats(): EntityStats = ???

  override def heal(hp: Int): Entity = ???

  override def takeDamage(hp: Int): Option[Entity] = ???

  override def addEffect(effect: Effect, duration: Duration): Entity = ???

  override def removeEffect(p: Effect => Boolean): EntityStats = ???

  override def moveTo(position: Position): Entity = ???

  override def tick(): Option[Entity] = ???
}
