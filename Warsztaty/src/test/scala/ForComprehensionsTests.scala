import org.scalatest.FunSuite

class ForComprehensionsTests extends FunSuite {
  val forComprehensions = new ForComprehensions()
  test("shouldReturnStudentNamesUnder22AsList") {
    val result = forComprehensions.getStudentsNamesUnderAgeAsList(22)
    assert(result.isInstanceOf[List[String]])
    assert(result.size == 2)
    assert(result(0) == "Maciek")
    assert(result(1) == "Przemek")
  }
  test("shouldReturnStudentNamesUnder30AsArray") {
    val result = forComprehensions.getStudentsNamesUnderAgeAsArray(30)
    assert(result.isInstanceOf[Array[String]])
    assert(result.size == 3)
    assert(result(0) == "Maciek")
    assert(result(1) == "Przemek")
    assert(result(2) == "Karolina")
  }
  test("shouldReturnStudentAgesThatStartWith????") {
    //todo
    null
  }
}
