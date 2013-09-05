/**
 * User: Charles
 * Date: 9/3/13
 *
 * The Fibonacci sequence is defined by the recurrence relation:

Fn = Fn−1 + Fn−2, where F1 = 1 and F2 = 1.
Hence the first 12 terms will be:

F1 = 1
F2 = 1
F3 = 2
F4 = 3
F5 = 5
F6 = 8
F7 = 13
F8 = 21
F9 = 34
F10 = 55
F11 = 89
F12 = 144
The 12th term, F12, is the first term to contain three digits.

What is the first term in the Fibonacci sequence to contain 1000 digits?
 *
 */

class Problem25 extends Solveable {

  //After starting with a recursive solution which never seemed to finish, this iterative one takes less than a second
  def solve(): String = {

    var alphaTerm: BigInt = BigInt(1)
    var betaTerm: BigInt = BigInt(1)
    var temp: BigInt = BigInt(0)
    var index: Int = 2

    while(betaTerm.toString().length() < 1000){
      temp = alphaTerm
      alphaTerm = betaTerm
      betaTerm += temp
      index += 1
    }

    index.toString
  }
}
