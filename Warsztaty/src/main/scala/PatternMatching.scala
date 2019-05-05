abstract class Notification

case class Email(sender: String, title: String, body: String) extends Notification
case class SMS(caller: String, message: String) extends Notification
case class VoiceRecording(contactName: String, link: String) extends Notification



class PatternMatching {
  def matchInt(x: Int): String = x match {
    case 1 => "one"
    case 2 => "two"
    case _ => "many"
  }
  def matchSubclasses(notification: Notification): String = {
    notification match {
      case Email(sender, title, _) =>
        s"You got an email from $sender with title: $title"
      case SMS(number, message) =>
        s"You got an SMS from $number! Message: $message"
      case VoiceRecording(name, link) =>
        s"you received a Voice Recording from $name! Click the link to hear it: $link"
    }
  }
  def matchSubclassesWithGuard(notification: Notification): String = {
    notification match {
      case Email(sender, _, _) if sender.contains("@gmail.com") =>
        "You got an email from Gmail account"
      case other =>
        matchSubclasses(notification)
    }
  }
  def matchForTypeOnly(notification: Notification): String = {
    notification match {
      case e: Email => "email"
      case s: SMS => "sms"
      case v: VoiceRecording => "voice"
    }
  }
  def getSenderData(notification: Notification): String = {
    //todo
    null
  }
}
