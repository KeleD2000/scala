package Effects

import Entitys.EntityStats

trait Effect {

  def apply(stats: EntityStats): EntityStats = ???

}
