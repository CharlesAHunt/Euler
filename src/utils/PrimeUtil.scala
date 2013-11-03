package utils

object PrimeUtil {

  def isPrime(number: Int): Boolean = {

    var i: Int = 2
    while (i * i <= number) {

      if (number % i == 0)
        return false

      i = i + 1
    }

    true
  }

}
