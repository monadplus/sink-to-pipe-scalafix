package fix

import fs2.{Pipe, Stream}

object Fs2sinkremoval {

  private def foo[F[_], A](s: Stream[F, A], sink: Pipe[F, A, Unit]): Stream[F, Unit] =
    s.through(sink)

  def bar[F[_], A, B](): Pipe[F, A, B] = ???
}
