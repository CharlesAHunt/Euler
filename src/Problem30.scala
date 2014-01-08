/**
Surprisingly there are only three numbers that can be written as the sum of fourth powers of their digits:

1634 = 1^4 + 6^4 + 3^4 + 4^4
8208 = 8^4 + 2^4 + 0^4 + 8^4
9474 = 9^4 + 4^4 + 7^4 + 4^4
As 1 = 1^4 is not a sum it is not included.

The sum of these numbers is 1634 + 8208 + 9474 = 19316.

Find the sum of all the numbers that can be written as the sum of fifth powers of their digits.
 */

class Problem30 {

  def solve(): String = {

    var sumOfFifthList: List[Int] = List()

    for(j <- 2 to 999999) {

      val sumOfFifthPowers = j.toString.foldLeft(0) { (z, i) =>  z + Math.pow(Integer.parseInt(i.toString),5).toInt  }

      if(sumOfFifthPowers == j) {
        sumOfFifthList = j :: sumOfFifthList
      }
    }

    sumOfFifthList.sum.toString

  }

}
