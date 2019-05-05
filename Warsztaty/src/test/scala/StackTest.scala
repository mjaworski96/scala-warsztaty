import org.scalatest.FunSuite

class StackTest extends FunSuite {

  val stack = new Stack[Int]
  stack.push(1)
  stack.push(2)

  test("Test stack type") {
    assert(stack.isInstanceOf[Stack[Int]])
  }
  test("Test stack element") {
    assert(stack.pop == 2)
    assert(stack.pop == 1)
  }

}



