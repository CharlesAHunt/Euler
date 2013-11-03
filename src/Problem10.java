import utils.PrimeUtil;

/**
 * User: Charles
 * Date: 9/16/12
 *
 The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 *
 Find the sum of all the primes below two million.
 */

public class Problem10 implements Solveable {

    public Double solve() {

        int number = 2;
        long primesTotal = 0;

        while (true) {

            if (PrimeUtil.isPrime(number))   {
                primesTotal += number;
            }

            if (number >= 2000000)
                break;

            number++;
        }

        return Double.parseDouble(Long.toString(primesTotal));
    }
}
