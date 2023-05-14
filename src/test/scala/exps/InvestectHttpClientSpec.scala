package exps

import org.scalatest.funsuite.AnyFunSuite
import sttp.client3.testing.SttpBackendStub
import sttp.model.Method
import sttp.client3.impl.cats.CatsMonadAsyncError
import cats.effect.IO
import io.circe.literal._
import io.circe.generic.auto._

class InvestectHttpClientSpec extends AnyFunSuite {

  test("test") {
    val testingBackend = SttpBackendStub(new CatsMonadAsyncError[IO])
      .whenRequestMatches(_.uri.path.startsWith(List("a", "b")))
      .thenRespond(json"""{"name": "rich"}""")
      .whenRequestMatches(_.method == Method.POST)
      .thenRespondServerError()
  }
}
