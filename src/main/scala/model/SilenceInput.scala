package silence.breaker
package model

import scala.concurrent.duration.FiniteDuration

case class SilenceInput(
  silences: Seq[SilenceInputEntry]
)

case class SilenceInputEntry(
  from: FiniteDuration,
  to: FiniteDuration
)
