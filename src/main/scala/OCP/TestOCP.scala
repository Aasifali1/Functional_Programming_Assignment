package OCP

import com.sun.xml.internal.ws.api.message.Message

object TestOCP {

  val withdrawAmount = (account:Account, amount:Double)=>{
    if (account.amount > amount) {
      AppWithdrawService(account,amount).withdraw()
    }
    else "Sorry, You don't have enough balance. The current balance is " + account.amount
  }

  def printMessage(message: String) = println(message)


  def main(args: Array[String]): Unit = {
    val acc = new WithdrawableAcc("Aasif", 345.00)
    val myFixedTermDepositAccount = new FixedTermDepositAcc("Aasif", 2400.15)

    printMessage(DepositService(acc, 455).deposit())

    printMessage(DepositService(myFixedTermDepositAccount, 455).deposit())

    printMessage(withdrawAmount(acc, 1000))


  }
}
