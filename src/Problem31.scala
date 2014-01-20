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

  val p1 = 1
  val p2 = 2
  val p5 = 5
  val p10 = 10
  val p20 = 20
  val p50 = 50
  val l1 = 100
  val l2 = 200


  def solve(): String = {

    val answer: Int = 0
    val currencyList: List[Integer] = List(p1,p2,p5,p10,p20,p50,l1,l2)
    answer.toString

  }

  //Hmm maybe iterate around a list of 8 coins where each position revolves from 0-200 for all possible combos and if == 00 then increment acc
  def build(): Integer = {

      build()


  }

}
