import java.math.BigInteger;

/**
 * User: Charles
 * Date: 1/10/13

 * 2^(15) = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

 * What is the sum of the digits of the number 2^1000?
 */
public class Problem16 implements Solveable {

    public Long solve() {

        Long number = 0L;
        BigInteger num = new BigInteger("2");
        num = num.pow(1000);

        for(char character : num.toString().toCharArray()) {
           number = number + Integer.parseInt(String.valueOf(character));
        }

        return number;
    }

}
