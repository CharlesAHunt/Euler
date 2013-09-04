import java.math.BigInteger;

/**
 * User: Charles
 * Date: 2/17/13

 * n! means n  (n  1)  ...  3  2  1

 * For example, 10! = 10  9  ...  3  2  1 = 3628800,
 * and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.

 * Find the sum of the digits in the number 100!
 */

public class Problem20 implements Solveable {

    public Long solve() {

        Long partsSummation = 0L;

        BigInteger factorial = factorial(new BigInteger("100"));

        char[] characters = factorial.toString().toCharArray();

        for (char character : characters) {
            partsSummation += Integer.parseInt(String.valueOf(character));
        }

        return partsSummation;

    }

    public static BigInteger factorial( BigInteger n )
    {
        if ( n.equals(new BigInteger("1")) )
            return new BigInteger("1");
        else
            return ( n.multiply(factorial ( n.subtract(new BigInteger("1"))) ) );
    }

}
