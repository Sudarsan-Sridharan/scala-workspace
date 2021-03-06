def findMax(temperatures: List[Int]) = {
  var highTemperature = Integer.MIN_VALUE
  for (temperature <- temperatures) {
    highTemperature = Math.max(highTemperature, temperature)
  }
  highTemperature
}

println(findMax(List(23, 27, 17)))