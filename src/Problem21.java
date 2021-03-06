import java.util.HashMap;
import java.util.Map;

/**
 * User: Charles
 * Date: 2/26/13
 *
 * Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
 If d(a) = b and d(b) = a, where a  b, then a and b are an amicable pair and each of a and b are called amicable numbers.

 For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284.
 The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.

 Evaluate the sum of all the amicable numbers under 10000.
 */

public class Problem21 implements Solveable {

    public Long solve() {

        Long result = 0L;
        Map<Integer, Integer> principalSumMap = new HashMap<Integer, Integer>();

        for(int number = 1; number < 10000; number++) {
            principalSumMap.put(number, getDivisorsSum(number));
        }

        for(Integer key : principalSumMap.keySet()) {
            for(Integer valueKey : principalSumMap.keySet()) {
                if(key.intValue() == principalSumMap.get(valueKey).intValue() && principalSumMap.get(key).intValue() == valueKey && key.intValue() != valueKey.intValue())
                    result += key;
            }
        }

        return result;

    }

    private Integer getDivisorsSum(Integer number) {
        int sum = 0;

        for(int divisor = 1; divisor <= (number/2); divisor++ ) {
            if(number % divisor == 0)
                sum += divisor;
        }

        return sum;
    }

}
