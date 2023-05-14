package exps.service

import exps.ClientAuth
import exps.models.Types._

trait InvestecHttpClient[F[_]] {
  def retrieveAccessToken(apiKey: ClientAuth.ApiKey, basicToken: BasicToken)

  def retrieveAccounts(bearerToken: BearerToken)
}
