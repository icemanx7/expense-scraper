package exps

import pureconfig._
import pureconfig.generic.auto._
import pureconfig.ConfigReader
import pureconfig.module.catseffect._
import cats.effect.kernel.Sync
import io.estatico.newtype.macros.newtype
import cats.Show

object ClientAuth {

  private val hidden = "***Protected***"

  @newtype case class ClientSecret(value: String)
  object ClientSecret {
    implicit val configReader: ConfigReader[ClientSecret] = deriving
    implicit val show: Show[ClientSecret] = _ => hidden
  }

  @newtype case class ClientId(value: String)
  object ClientId {
    implicit val configReader: ConfigReader[ClientId] = deriving
    implicit val show: Show[ClientId] = _ => hidden
  }

  @newtype case class ApiKey(value: String)
  object ApiKey {
    implicit val configReader: ConfigReader[ApiKey] = deriving
    implicit val show: Show[ApiKey] = _ => hidden
  }

  @newtype case class Host(value: String)
  object Host {
    implicit val configReader: ConfigReader[Host] = deriving
  }
}

final case class Port(port: Int) extends AnyVal

final case class AuthCredentials(
    clientSecret: ClientAuth.ClientSecret,
    clientId: ClientAuth.ClientId,
    apiKey: ClientAuth.ApiKey
)

final case class ExpsConfig(
    port: Port,
    host: ClientAuth.Host,
    authCredentials: AuthCredentials
)

object ExpsConfig {
  def load[F[_]: Sync] = loadConfigF[F, ExpsConfig]
}
