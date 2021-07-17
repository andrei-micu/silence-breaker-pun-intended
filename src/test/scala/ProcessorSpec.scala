package silence.breaker

import org.scalatest.flatspec.AnyFlatSpec

import scala.concurrent.duration._

class ProcessorSpec extends AnyFlatSpec {

  "The processor" should "parse the pauses correctly" in {

    val inputFile = classOf[ProcessorSpec].getResource("/silence1.xml").getFile

    Processor.toSilenceEntries(
      inputFile = inputFile,
      minPauseBetweenChapters = 3.seconds,
      maxShortChapterDuration = 30.minutes,
      minPauseBetweenLongChapterSegments = 1.second
    )
  }
}
