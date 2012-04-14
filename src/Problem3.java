/**
 * User: Charles
 * Date: 4/12/12
 *
 * The prime factors of 13195 are 5, 7, 13 and 29.
 *   What is the largest prime factor of the number 600851475143 ?
 */
public class Problem3 implements Solveable {

    public Long solve() {
        Long number = 600851475143L;
        Long answer = number;
        boolean isWhole = false;
        double attemptedWhole;

        while (!isWhole) {
            attemptedWhole = Math.sqrt(answer);
            if (Math.rint(attemptedWhole) == attemptedWhole) {
                isWhole = true;
                answer = (long) Math.sqrt(answer);
            } else {
                answer--;
            }
        }

        while(answer > 1) {

            if(number % answer == 0) {
                if(isPrime(answer))
                    break;
            }

            answer--;
        }

        return answer;
    }

    private boolean isPrime(Long number) {

        for (Long i = 2L; i < number; i++) {
            if(number % i == 0)
                return false;

        }

        return true;
    }
}
