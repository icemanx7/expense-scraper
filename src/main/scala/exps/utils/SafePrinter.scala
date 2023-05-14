package exps.utils

import cats.syntax.all._
import cats.Show

object SafePrinter {

  def print[A: Show](objPrint: A): Unit = println(objPrint.show)

}
