package Entitys

import Effects.{Duration, Effect}

trait Entity{

  def baseStats(): EntityStats = ???

  def heal(hp: Int): Entity = ???

  def takeDamage(hp: Int): Option[Entity] = ???

  def addEffect(effect: Effect, duration: Duration) : Entity = ???

  def removeEffect(p: Effect => Boolean): EntityStats = ???

  def moveTo(position: Position): Entity = ???

  def tick() : Option[Entity] = ???


}
