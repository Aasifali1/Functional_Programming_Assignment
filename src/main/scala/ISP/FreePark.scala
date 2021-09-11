package ISP

class FreePark extends FreeParkingLot {
  override def park(vehicle: Vehicle): String = {
    vehicle.name+" is parked in free Parking"
  }
  override def unpark(vehicle: Vehicle): String = {
    vehicle.name+" is unparked in free Parking"
  }

}