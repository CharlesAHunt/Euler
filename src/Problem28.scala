/**
Starting with the number 1 and moving to the right in a clockwise direction a 5 by 5 spiral is formed as follows:

21 22 23 24 25
20  7  8  9 10
19  6  1  2 11
18  5  4  3 12
17 16 15 14 13

It can be verified that the sum of the numbers on the diagonals is 101.

What is the sum of the numbers on the diagonals in a 1001 by 1001 spiral formed in the same way?
 */
class Problem28 extends Solveable {

  def solve(): String = {

    var arrayDiags: Seq[Int] = Seq(1)
    var gap = 2
    var valueToAdd = 1
    val maxEntriesInArray = 1002001
    for(  a <- 2 to maxEntriesInArray  ) {

      for(  b <- 1 to 4  ) {
        valueToAdd = valueToAdd + gap
        arrayDiags = arrayDiags:+valueToAdd
      }

      if(valueToAdd >= maxEntriesInArray)
        return arrayDiags.foldLeft(0)(_ + _).toString

      gap = gap + 2
    }

    None.toString
  }
}
