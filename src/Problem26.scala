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

    var patterns: Seq[String] = Seq()
    var denomWithLongestCycle = 0
    var longestCycle = 0

    for(i <- 1 until 1000) {
        val fraction: BigDecimal = 1.0/i
        val fracString:String = fraction.toString().split('.').toList(1)  //get the fractional part
        var lastElem:String = ""
        fracString.foreach{ e =>
            patterns = patterns:+(lastElem.toString().concat(e.toString()))
            lastElem = patterns.last
        }
        val longestInCurrentPattern = patternFind(patterns).size
        if(longestInCurrentPattern > longestCycle) {
            denomWithLongestCycle = i
            longestCycle = longestInCurrentPattern
        }
        patterns = Seq()
    }

    denomWithLongestCycle.toString

  }

  def patternFind(patterns: Seq[String] ):String = {
     var isMatch = true
     patterns.foreach{ e =>
         val pattern = e.*(20)
         patterns.foreach{ e2 =>
            if(e2.length > e.length) {
              if(pattern.slice(0, e2.length) != e2) isMatch = false
            }
         }
         if(isMatch == true) return e
     }
     return ""
  }
}
