/**
 * User: Charles
 * Date: 4/28/12
 *
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class Problem5 implements Solveable {

    public Double solve() {
        Double lowerBound = 2520.0;

        while (true) {
            if (lowerBound % 2 == 0 && divisibleByAll(lowerBound))
                return lowerBound;

            lowerBound++;
        }
    }

    private boolean divisibleByAll(Double input) {
        return (input % 20 == 0 && input % 19 == 0 && input % 18 == 0 && input % 17 == 0 && input % 16 == 0 && input % 15 == 0
                && input % 14 == 0 && input % 13 == 0 && input % 12 == 0 && input % 11 == 0 && input % 10 == 0 && input % 9 == 0
                && input % 8 == 0 && input % 7 == 0 && input % 6 == 0 && input % 5 == 0 && input % 4 == 0 && input % 3 == 0);
    }
}
