package ISP

//Segregation means keeping things separated, and the Interface Segregation Principle is about separating the interfaces.
trait ParkingLot {
  def park(vehicle: Vehicle): String // Decrease empty spot count by 1

  def unpark(vehicle: Vehicle): String // Increase empty spots by 1
}

trait PaidParkingLot extends ParkingLot {
  def calculateFee( vehicle: Vehicle, parkingHour:Int): Double // Returns the price based on number of hours
  def doPayment(totalPayment:Double): Unit
}

trait FreeParkingLot extends ParkingLot {}


