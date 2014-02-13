/**
 * Created by Charles on 1/29/14.
 *
 * We shall say that an n-digit number is pandigital if it makes use of all the digits 1 to n exactly once; for example, the 5-digit number, 15234, is 1 through 5 pandigital.

The product 7254 is unusual, as the identity, 39 × 186 = 7254, containing multiplicand, multiplier, and product is 1 through 9 pandigital.

Find the sum of all products whose multiplicand/multiplier/product identity can be written as a 1 through 9 pandigital.

HINT: Some products can be obtained in more than one way so be sure to only include it once in your sum. */

class Problem32 extends Solveable {

  def solve(): String = {

    var products: List[Int] = List()

    for(i <- 1 until 9876) {
      for(j <- 1 until 98) {
        val item = i.toString+j.toString+(i*j).toString
        if(isPandigital(item)) {
          if(!products.contains(i*j)) {
            products = (i*j) :: products
          }
        }
      }
    }

    products.sum.toString
  }

  def isPandigital(stringConcat : String): Boolean = {
    if(stringConcat.contains("0") || stringConcat.length < 9 || stringConcat.length > 9)
      false

    val newStringConcat = stringConcat.filter(!isDuplicate(stringConcat, _))

    if(newStringConcat.length != 9 || stringConcat.contains("0"))
      false
    else
      true
  }

  def isDuplicate(stringConcat: String, i : Char): Boolean = {
    var count:Int = 0
    stringConcat.foreach(j => if(j.charValue() == i.charValue()){count+=1})
    if(count > 1)
      true
    else
      false
  }

}