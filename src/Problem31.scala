/**
 * Created by Charles on 1/19/14.
 *
 * In England the currency is made up of pound, £, and pence, p, and there are eight coins in general circulation:

1p, 2p, 5p, 10p, 20p, 50p, £1 (100p) and £2 (200p).
It is possible to make £2 in the following way:

1×£1 + 1×50p + 2×20p + 1×5p + 1×2p + 3×1p
How many different ways can £2 be made using any number of coins?
 *
 */
class Problem31 {

  def solve(): String = {

    val r = numberOfCombos(List(1, 2, 5, 10, 20, 50, 100, 200), 200)

    r.toString

  }

  def numberOfCombos(denominations: List[Int], total: Int): Int = denominations match {
    case head :: tail =>

      if (head > total)
        0
      else if (total == head)
        1
      else
        numberOfCombos(denominations, total - head) + numberOfCombos(tail, total)

    case _ => 0
  }

}
