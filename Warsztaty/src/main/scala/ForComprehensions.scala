case class Student(name: String, age: Int)

class ForComprehensions {
  def getStudentsList() : List[Student] = {
    List(
      Student("Maciek", 21),
      Student("Piotr", 31),
      Student("Przemek", 19),
      Student("Karolina", 23),
    )
  }
  def getStudentsNamesUnderAgeAsList(age: Int): List[String] = {
    val names = for(student <- getStudentsList() if (student.age < age))
      yield student.name
    names
  }
  def getStudentsArray() : Array[Student] = {
    Array(
      Student("Maciek", 21),
      Student("Piotr", 31),
      Student("Przemek", 19),
      Student("Karolina", 23),
    )
  }
  def getStudentsNamesUnderAgeAsArray(age: Int): Array[String] = {
    val names = for(student <- getStudentsArray() if (student.age < age))
      yield student.name
    names
  }
  def getStudentsAgesWitchNamesStartWithString(prefix: String): List[Int] = {
    //todo
    null
  }
}
