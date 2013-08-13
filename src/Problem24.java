import java.util.LinkedHashSet;
import java.util.Set;

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

    public Long solve() {

        Long result = 0L;
        Integer nthPermutation = 0;
        StringBuilder permutationString = new StringBuilder();
        Set<Integer> permuteSet = new LinkedHashSet<Integer>();
        for () {
            for (int index = 0; index < permuteSet.size(); index++) {
                permutationString.append(nextMin());
            }
        }

        return result;

    }

    private Integer nextMin() {
        return 0;
    }

}
