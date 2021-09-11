package OCP

 case class DepositService(account: Account,amount: Double) {
  def deposit() ={
    account.amount = account.amount + amount
    "UPDATE: Rs. " + amount + " has been deposited into your account. Avl Bal INR " + account.amount
  }
}
