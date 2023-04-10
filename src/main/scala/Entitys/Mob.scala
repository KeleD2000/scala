package Entitys
import Effects.{Duration, Effect}

/**
 * Egy élő mozgó entitás statjai
 * @param name Entitás neve
 * @param id Entitás idje
 * @param baseStat Az entitás alap statjai
 * @param currentHP Entitás életereje
 * @param position Entitás pozija a térképen
 * @param activeEffect Entitáson lévő aktív statok leképezése: Map(ahol a kulcs az effect és a hozzá tartozó duration az effect lejárati ideje)
 */
case class Mob(name: String, id: String, baseStat: EntityStats, currentHP: Int, position: Position, activeEffect: Map[Effect, Duration]) extends Entity {
  /**
   * Entitás alapjstatajainak visszaadása
   */
  override def baseStats(): EntityStats = baseStat

  /**
   * Felülírja az entitás életerejének növelésére szolgáló metódust,
   * ha a hp negatív ne történjen semmi
   *
   * @param hp ennyivel legyen több az életereje
   * @return A felhealhelt entitás vagy az original ha a hp negatív
   */
  override def heal(hp: Int): Entity = ???

  /**
   * Felülírja az entitás életerejének csökkenésére szolgálaló metódust,
   *
   * @param hp ennyivel legyen kevesebb az életereje
   * @return ha pozítiv marad, akkor adjuk vissza Optionbe, de ha 0 vagy az alá csökken , akkor None
   */
  override def takeDamage(hp: Int): Option[Entity] = ???

  /**
   * Felülírja az entitás effect listájának a bővítésére való metódust,
   * ha az effekt nincs még az entitáson, akkor pluszba kerüljön hozzá
   * ha már rajta van, akkor meglévő és az új duration közül a nagyobb marad meg
   *
   * @param effect   amit hozzáadunk az entitáshoz
   * @param duration mennyi idő alatt
   * @return Entitás a frissített effect listával
   */
  override def addEffect(effect: Effect, duration: Duration): Entity = ???

  /**
   * Felülírja az Effect a levétel az entitásról metódust
   *
   * @param p predikátum
   * @return Entitás a frissített effect listával
   */
  override def removeEffect(p: Effect => Boolean): Entity = ???

  /**
   * Felülírja azEntitás mozgatása egy másik pozira metódust
   *
   * @param position az a pozi, amire mozgatni szeretnénk az entitást
   * @return Entitás amely mozgatva lett az új oldal
   */
  override def moveTo(position: Position): Entity = ???

  /**
   * Felülírja az adott esetben akár el is pusztulhat, ekkor az opcióban Nonet
   * adjunk vissza, egyébként a megváltoztatott entitást (opcióba csomagolva), a rajta lévő effektek durationje egy
   * tickkel csökken, a hp-je az effektekkel megváltoztatott regenerálódásnak megfelelően
   * változik. Ha épp lejár egy effekt, ami a maxHP-t növelte eddig,
   * akkor a HP már a kövi tickben az új maxHP fölé nem mehet, és ezt a felső korlátot
   * alkalmazzuk.
   *
   * @return Hogy egy tickkel később mivé válik ez az entitás.
   */
  override def tick(): Option[Entity] = ???

}
