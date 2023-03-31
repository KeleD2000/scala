package Entitys

trait Entity{

  def baseStats(): EntityStats = baseStat

  def heal(hp: Int): Entity = ???

  def takeDamage(hp: Int): Option[Entity] = ???

  def addEffect(effect: Effect, duration: Duration) : Entity = ???

  def removeEffect(p: Effect => Boolean): EntityStats = ???

  def moveTo(position: Position): Entity = ???

  def tick() : Option[Entity] = ???


}
