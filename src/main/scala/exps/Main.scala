package exps

import cats.effect.IOApp
import cats.effect.{ExitCode, IO}

object Main extends IOApp {

  override def run(args: List[String]): IO[ExitCode] = for {
    _ <- IO.println("running scraper")
  } yield ExitCode.Success

}
