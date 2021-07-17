package silence.breaker
package serde

import model.{SilenceInput, SilenceInputEntry}

import cats.syntax.all._
import com.lucidchart.open.xtract.XmlReader._
import com.lucidchart.open.xtract.{XmlReader, __}

import scala.concurrent.duration.FiniteDuration
import scala.jdk.DurationConverters._

object SilenceInputXmlReader {

  implicit val finiteDurationReader: XmlReader[FiniteDuration] =
    __.read[String].map(java.time.Duration.parse(_).toScala)

  implicit val silenceInputEntryReader: XmlReader[SilenceInputEntry] =
    (
      attribute[FiniteDuration]("from"),
      attribute[FiniteDuration]("until")
      ).mapN(SilenceInputEntry.apply)

  implicit val silenceInputReader: XmlReader[SilenceInput] =
    (__ \ "silences").read(seq[SilenceInputEntry]).map(SilenceInput.apply)
}
