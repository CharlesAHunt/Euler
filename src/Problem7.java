/**
 * User: Charles
 * Date: 7/28/12
 * <p/>
 * <p/>
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * <p/>
 * What is the 10001st prime number?
 */
public class Problem7 implements Solveable {

    public Double solve() {

        int number = 2;
        int primesFound = 0;

        while (true) {

            if (isPrime(number))
                primesFound++;


            if (primesFound == 10001)
                break;

            number++;
        }

        return Double.parseDouble(Integer.toString(number));
    }

    private boolean isPrime(int number) {

        for (int i = 2; i <= (number / 2); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
