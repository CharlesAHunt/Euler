/**
 * Created  on 3/16/14.
 *
 * The fraction 49/98 is a curious fraction, as an inexperienced mathematician in attempting to simplify it may
 * incorrectly believe that 49/98 = 4/8, which is correct, is obtained by cancelling the 9s.
We shall consider fractions like, 30/50 = 3/5, to be trivial examples.

There are exactly four non-trivial examples of this type of fraction, less than one in value, and containing two
digits in the numerator and denominator.

If the product of these four fractions is given in its lowest common terms, find the value of the denominator.
 */

class Problem33 extends Solveable {

  def solve(): String = {

      var fracList: List[(Int,Int)] = List()

      for( i <- 10 to 99) {
          for( j <- 10 to 99) {
            val i1 = i.toString.substring(0,1).toDouble
            val i2 = i.toString.substring(1,2).toDouble
            val j1 = j.toString.substring(0,1).toDouble
            val j2 = j.toString.substring(1,2).toDouble
            if((j2 != 0 && j1 != 0) && i1 == j1 && (i2/j2 == i.toDouble/j) && (i2/j2 < 1))
              fracList = fracList :+(i, j)
            if((j2 != 0 && j1 != 0) && i2 == j1 && (i1/j2 == i.toDouble/j) && (i1/j2 < 1))
              fracList = fracList :+ (i,j)
            if((j1 != 0 && j2 != 0) && i1 == j2 && (i2/j1 == i.toDouble/j) && (i2/j1 < 1))
              fracList = fracList :+ (i,j)
            if((j1 != 0 && j2 != 0) && i2 == j2 && (i1/j1 == i.toDouble/j) && (i1/j1 < 1))
              fracList = fracList :+ (i,j)
          }
      }

      val frac = fracList.foldLeft((1,1)) {(x,y) =>
        (x._1 * y._1, x._2 * y._2)
      }

    (frac._2/frac._1).toString

  }


}