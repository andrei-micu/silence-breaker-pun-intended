package silence.breaker

import org.scalatest.flatspec.AnyFlatSpec

class ProcessorSpec extends AnyFlatSpec {

  "The processor" should "parse the pauses correctly" in {

    val inputFile = classOf[ProcessorSpec].getResource("silence1.xml").getFile

    Processor.toSilenceEntries(Array(inputFile, "3", "3600", "1"))
  }
}
