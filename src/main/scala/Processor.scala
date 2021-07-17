package silence.breaker

import model.SilenceInput
import serde.SilenceInputXmlReader._

import com.lucidchart.open.xtract.XmlReader

import scala.concurrent.duration.FiniteDuration
import scala.xml.XML

object Processor {

  def toSilenceEntries(
    inputFile: String,
    minPauseBetweenChapters: FiniteDuration,
    maxShortChapterDuration: FiniteDuration,
    minPauseBetweenLongChapterSegments: FiniteDuration
  ): String = {

    val xml = XML.load(inputFile)
    val value = XmlReader.of[SilenceInput].read(xml)
    println(value)

    "a"
  }
}
