/*
rule = Fs2sinkremoval
*/
package fix

import fs2.{Sink, Pure}

object Fs2sinkremoval {
  private def writeSink[F[_]]: Sink[F, Byte] = ???
}
