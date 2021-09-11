package ISP

case class Calculate(pricePerHour:Int, hour: Int) {
  def calculateFee: Double = pricePerHour * hour
}
