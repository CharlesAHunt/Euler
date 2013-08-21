import java.util.*;

/**
 * User: Charles
 * Date: 7/3/13
 *
 * A permutation is an ordered arrangement of objects. For example, 3124 is one possible permutation of the digits 1, 2, 3 and 4.
 * If all of the permutations are listed numerically or alphabetically, we call it lexicographic order. The lexicographic permutations of 0, 1 and 2 are:

 012   021   102   120   201   210

 What is the millionth lexicographic permutation of the digits 0, 1, 2, 3, 4, 5, 6, 7, 8 and 9?

 */
public class Problem24 implements Solveable {

    public String solve() {

        List<Integer> permutation = new ArrayList<Integer>();
        for (Integer member = 0; member < 10; member++) {
            permutation.add(member);
        }
        int permutationLength = permutation.size();
        int remain = 1000000 - 1;
        StringBuilder permNum = new StringBuilder();

        List<Integer> numbers = new ArrayList<Integer>();

        for (int i = 0; i < permutationLength; i++) {
            numbers.add(i);
        }

        for (int i = 1; i < permutationLength; i++) {
            int j = remain / factorial(permutationLength - i);
            remain = remain % factorial(permutationLength - i);
            permNum.append(numbers.get(j));
            numbers.remove(j);
            if (remain == 0) {
                break;
            }
        }

        for (Integer number : numbers) {
            permNum.append(number);
        }

        return permNum.toString();
    }

    private int factorial(int number) {
        if (number < 1)
            return 0;

        int root = 1;
        for (int inc = 1; inc <= number; inc++) {
            root = root * inc;
        }
        return root;
    }
}
