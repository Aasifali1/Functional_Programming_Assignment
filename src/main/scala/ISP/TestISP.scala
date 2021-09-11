package ISP

object TestISP {

  val parkVehicle =(vehicle:Vehicle, parkingLot:ParkingLot)=>{
    parkingLot.park(vehicle)
  }
  val unpark =(vehicle:Vehicle,parkingLot:ParkingLot)=>{
    parkingLot.unpark(vehicle)
  }

  val calculateFee = (vehicle:Vehicle)=>{
   val pricePerHour =10;
    Calculate(pricePerHour,vehicle.parkingHour).calculateFee
  }


  def main(args: Array[String]): Unit = {

    val car = Vehicle("Car","UK1452",10)
    val bus = Vehicle("Bus","UK1452",5)

    println(parkVehicle(car, new FreePark()))
    println(unpark(car,new FreePark()))

    println(parkVehicle(car, new PaidParking()))
    println(unpark(car,new PaidParking()))
    println(calculateFee(car))

  }
}