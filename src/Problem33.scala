/**
 * Created by Charles on 3/16/14.
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

      var num = 10
      var den = 10
      var fracList: List[(Int,Int)] = List()

      for( i <- 10 to 99) {
          for( j <- 10 to 99) {
            if((i/j == i/j || i/j == i/j ||i/j == i/j || i/j == i/j) && (i%10!=0 && j%10!=0))
                //todo add to list

          }
      }

      fracList.foreach((x:Int,y:Int) => x+y)


  }


}