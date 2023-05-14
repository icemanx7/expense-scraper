package exps.models

import io.estatico.newtype.macros.newtype

object Types {
  @newtype case class BasicToken(value: String)

  @newtype case class BearerToken(value: String)
}
