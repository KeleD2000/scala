package Effects

import Entitys.EntityStats

case class IncreaseDamage(value: Int) extends Effect{
  override def apply(stats: EntityStats): EntityStats = ???
}
