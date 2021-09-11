package OCP

case class AppWithdrawService(account: Account, amount: Double) {
    def withdraw(): String = {
            account.amount = account.amount - amount
            "ALERT: You've withdrawn Rs. " + amount + " Available Bal Rs.  " + account.amount
    }
}