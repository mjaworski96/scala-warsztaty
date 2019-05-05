import org.scalatest.FunSuite


class PatternMatchingTests extends FunSuite {
  val patternMatching = new PatternMatching

  test("shouldReturnValidCaseForInt") {
    assert(patternMatching.matchInt(1) == "one")
    assert(patternMatching.matchInt(2) == "two")
    assert(patternMatching.matchInt(3) == "many")
    assert(patternMatching.matchInt(5) == "many")
  }
  test("shouldReturnValidCaseForSubclasses") {
    assert(patternMatching.matchSubclasses(Email("sender", "title", "any string"))
      == "You got an email from sender with title: title")
    assert(patternMatching.matchSubclasses(Email("sender", "title", "any string 2"))
      == "You got an email from sender with title: title")
    assert(patternMatching.matchSubclasses(SMS("123456789", "message"))
      == "You got an SMS from 123456789! Message: message")
    assert(patternMatching.matchSubclasses(VoiceRecording("name", "link"))
      == "you received a Voice Recording from name! Click the link to hear it: link")
  }
  test("shouldReturnValidCaseForSubclassesWithGuard") {
    assert(patternMatching.matchSubclassesWithGuard(Email("sender@gmail.com", "any title 1", "any string"))
      == "You got an email from Gmail account")
    assert(patternMatching.matchSubclassesWithGuard(Email("sender@other.com", "any title 2", "any string"))
      == "You got an email from sender@other.com with title: any title 2")
    assert(patternMatching.matchSubclassesWithGuard(SMS("123456789", "message"))
      == "You got an SMS from 123456789! Message: message")
    assert(patternMatching.matchSubclassesWithGuard(VoiceRecording("name", "link"))
      == "you received a Voice Recording from name! Click the link to hear it: link")
  }
  test("shouldReturnValidCaseTypeOnly") {
    assert(patternMatching.matchForTypeOnly(Email("sender", "title", "any string"))
      == "email")
    assert(patternMatching.matchForTypeOnly(Email("sender", "title", "any string 2"))
      == "email")
    assert(patternMatching.matchForTypeOnly(SMS("123456789", "message"))
      == "sms")
    assert(patternMatching.matchForTypeOnly(VoiceRecording("name", "link"))
      == "voice")
  }
  test("shouldReturnSenderData") {
    //todo
    null
  }
}

