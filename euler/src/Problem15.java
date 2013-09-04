/**
 * User: Charles
 * Date: 1/7/13
 *
 * <p/>
 * Starting in the top left corner of a 2×2 grid, there are 6 routes (without backtracking) to the bottom right corner.
 * <p/>
 * How many routes are there through a 20×20 grid?
 */

public class Problem15 implements Solveable {

    private int WIDTH = 20;
    private int HEIGHT = 20;

    public Long solve() {
        return get(2*WIDTH, HEIGHT);
    }

    public long get(int row, int column) {
        long current = 1;

        for (int i = 1; i <= column; i++ ) {
            current = (current * (row + 1 - i)) / i;
        }

        return current;
    }

}
