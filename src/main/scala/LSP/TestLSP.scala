package LSP

object TestLSP {

  val withdraw = (account: Account, amount:Double)=>{
    account.amount = account.amount - amount
    "ALERT: You've withdrawn Rs. " + amount + " Available Bal Rs.  " + account.amount
  }
  val deposit = (account: Account, amount:Double)=>{
    account.amount = account.amount + amount
    "UPDATE: Rs. " + amount + " has been deposited into your account. Avl Bal INR " + account.amount
  }


  def main(args: Array[String]): Unit = {

    val savingAccount = new SavingAccount("Aasif Ali", 4500.45)
    val currentAccount = new CurrentAccount("Sajal", 8000.66)

    // The Liskov Substitution Principle states that subclasses should be substitutable for their base classes.

    Printer(withdraw(savingAccount, 500)).printMessage
    Printer(withdraw(currentAccount, 500)).printMessage


  }
}