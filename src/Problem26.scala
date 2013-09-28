import scala._
import scala.math.BigDecimal.RoundingMode

/**
 * User: Charles
 * Date: 9/4/13
 *
 * A unit fraction contains 1 in the numerator. The decimal representation of the unit fractions with denominators 2 to 10 are given:

1/2	= 	0.5
1/3	= 	0.(3)
1/4	= 	0.25
1/5	= 	0.2
1/6	= 	0.1(6)
1/7	= 	0.(142857)
1/8	= 	0.125
1/9	= 	0.(1)
1/10	= 	0.1
Where 0.1(6) means 0.166666..., and has a 1-digit recurring cycle. It can be seen that 1/7 has a 6-digit recurring cycle.

Find the value of d < 1000 for which 1/d contains the longest recurring cycle in its decimal fraction part.
 */

class Problem26 extends Solveable {

  def solve(): String = {

    //a map of numbers and their decimal pattern -> Fermat’s little theorem says: 1/d has a cycle of n digits if 10^n−1 mod d = 0 for prime d (or 10^n mod d = 1)
    val cycleMap = (1 until 1000).map(i =>
      //returns element from 1-2000 that satisfies (10^_ % i) = 0
      (1 to 2000).find(BigInt(10).modPow(_, i) == 1)
    )

    //flatten the map and find the greatest, then get the index +1 which is the number associated with that decimal length
    (1 + cycleMap.indexOf(Some(cycleMap.flatten.max))).toString
  }

}


