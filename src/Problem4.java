/**
 * User: Charles
 * Date: 4/13/12
 * <p/>
 * <p/>
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class Problem4 {

    public Long solve() {

        Long longestSoFar = 0L;

        for (long i = 999; i > 500; i--) {
            for (long j = 999; j > 500; j--) {
                if (isPalindrome(i * j) && (i * j) > longestSoFar) {
                    longestSoFar = i * j;
                }
            }
        }

        return longestSoFar;
    }

    private boolean isPalindrome(Long number) {
        int size = number.toString().length();
        String numberAsString = number.toString();

        for (int i = 0; i < size; i++) {
            if (numberAsString.charAt(i) != numberAsString.charAt(size - (i + 1)))
                return false;
        }

        return true;
    }
}
