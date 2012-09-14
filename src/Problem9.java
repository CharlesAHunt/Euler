/**
 * User: Charles
 * Date: 9/9/12
 * <p/>
 * <p/>
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * a^2 + b^2 = c^2
 * <p/>
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
 * <p/>
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */
public class Problem9 implements Solveable {

    public Double solve() {

        double a, b, c;

        for (a = 0; a <= 1000; a++) {

            for (b = 0; b <= 1000; b++) {

                for (c = 0; c <= 1000; c++) {

                    if(a+b+c == 1000 && a < b && b < c && ((a*a) + (b*b) == (c*c))) {

                        return (a*b*c);

                    }
                }
            }
        }

        return 0.0;

    }
}
