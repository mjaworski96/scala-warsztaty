object WeekDay extends Enumeration {
  val Mon, Tue, Wed, Thu, Fri, Sat, Sun = Value
}

object Planet extends Enumeration {
  protected case class PlanetValue(mass: Double, radius: Double) extends Val {
    def surfaceGravity: Double = Planet.G * mass / (radius * radius)
    def surfaceWeight(otherMass: Double): Double = otherMass * surfaceGravity
  }
  implicit def valueToPlanetValue(x: Value): PlanetValue = x.asInstanceOf[PlanetValue]

  val G: Double = 6.67300E-11
  val Mercury = PlanetValue(3.303e+23, 2.4397e6)
  val Venus   = PlanetValue(4.869e+24, 6.0518e6)
  val Earth   = PlanetValue(5.976e+24, 6.37814e6)
  val Mars    = PlanetValue(6.421e+23, 3.3972e6)
  val Jupiter = PlanetValue(1.9e+27, 7.1492e7)
  val Saturn  = PlanetValue(5.688e+26, 6.0268e7)
  val Uranus  = PlanetValue(8.686e+25, 2.5559e7)
  val Neptune = PlanetValue(1.024e+26, 2.4746e7)
}