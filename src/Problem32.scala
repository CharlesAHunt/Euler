/**
 * Created by Charles on 1/29/14.
 *
 * We shall say that an n-digit number is pandigital if it makes use of all the digits 1 to n exactly once; for example, the 5-digit number, 15234, is 1 through 5 pandigital.

The product 7254 is unusual, as the identity, 39 × 186 = 7254, containing multiplicand, multiplier, and product is 1 through 9 pandigital.

Find the sum of all products whose multiplicand/multiplier/product identity can be written as a 1 through 9 pandigital.

HINT: Some products can be obtained in more than one way so be sure to only include it once in your sum. */

class Problem32 extends Solveable {

  def solve(): String = {

    //= ((0 to 999).filter(_ % 5 == 0) ++ ((0 to 999).filter(_ % 3 == 0))).distinct.foldLeft(0)(_ + _)

    var nums: Set[Int] = Set()

    for(i <- 1 until 987) {
      for(j <- 1 until 987) {
        if(isPandigital(i, j, i*j)) {
          nums = nums + (i*j)
        }
      }
    }

    nums.sum.toString
  }

  def isPandigital(i :Int, j :Int, k :Int): Boolean = {
    var stringConcat = i.toString + j.toString + k.toString
    stringConcat = stringConcat.filter(i => dupInList(stringConcat, i.charValue()))
    //println(stringConcat.length)
    if(stringConcat.length < 9)
      false
    else
      true
  }

  def dupInList(stringConcat: String, i : Int): Boolean = {
    var count:Int = 0
    stringConcat.foreach(j => if(j.charValue() == i){count+=1})
    //println(stringConcat + "  :  " + count + "   :" + i)
    if(count > 1)
      true
    else
      false

  }

}