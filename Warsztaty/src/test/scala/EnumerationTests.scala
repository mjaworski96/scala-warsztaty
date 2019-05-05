import org.scalatest.FunSuite

class EnumerationTests extends FunSuite{
  test("MondayShouldBeBeforeTuesday") {
    assert(WeekDay.Mon < WeekDay.Tue)
  }
  test("EarthShouldHaveValidData") {
    assert(Planet.Earth.mass == 5.976e+24)
    assert(Planet.Earth.radius == 6.37814e6)

    assert(Planet.Earth.surfaceGravity == 9.802652743337129)
    assert(Planet.Earth.surfaceWeight(10) == 98.02652743337129)
  }
  test("ShouldFilterPlanets") {
    val hugePlanets = Planet.values.filter(_.radius > 7.0e6)
    val iterator  = hugePlanets.iterator
    assert(iterator.next() == Planet.Jupiter)
    assert(iterator.next() == Planet.Saturn)
    assert(iterator.next() == Planet.Uranus)
    assert(iterator.next() == Planet.Neptune)
    assert(!iterator.hasNext)
  }
}
