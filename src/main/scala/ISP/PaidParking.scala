package ISP

class PaidParking extends PaidParkingLot {
  def calculateFee( vehicle: Vehicle, parkingHour:Int): Double ={
    vehicle.parkingHour * parkingHour
  }
  // Returns the price based on number of hours

  def doPayment(totalPayment:Double): Unit ={
    "Payment is initiated "+totalPayment
  }

  override def park(vehicle: Vehicle): String = "Car is unparked in paid parking"

  override def unpark(vehicle: Vehicle): String = "Car is unparked hours calculated"
}
