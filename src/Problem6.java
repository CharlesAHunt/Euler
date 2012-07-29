/**
 * User: Charles
 * Date: 7/28/12
 *

 The sum of the squares of the first ten natural numbers is,
 1^2 + 2^2 + ... + 10^2 = 385

 The square of the sum of the first ten natural numbers is,
 (1 + 2 + ... + 10)^2 = 55^2 = 3025

 Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

 Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

 */
public class Problem6 implements Solveable {

    public Double solve() {

        Double answer = 0.0;
        Double sumOfSquares = 0.0;
        Double squareOfSums = 0.0;

        for(int i = 1; i <= 100; i++){
            sumOfSquares = sumOfSquares + (i*i);
        }

        for(int i = 1; i <= 100; i++){
            squareOfSums = squareOfSums + i;
        }

        answer = squareOfSums * squareOfSums - sumOfSquares;

        return answer;

    }

}
