import java.util.ArrayList;
import java.util.List;

/**
 * User: Charles
 * Date: 1/7/13


 * Starting in the top left corner of a 2×2 grid, there are 6 routes (without backtracking) to the bottom right corner.

 * How many routes are there through a 20×20 grid?

 */

public class Problem15 implements Solveable {

    private int WIDTH = 20;
    private int HEIGHT = 20;

    public Long solve() {

        return getRouteSize();

    }

    public long getRouteSize() {

        int currentX = 0;
        int currentY = 0;
        List<List> routes = new ArrayList<List>();

        while (true) {
            List<Vertex> path = new ArrayList<Vertex>();
            while (currentX < WIDTH && currentY < HEIGHT) {

                path.add(new Vertex(1,1));    //todo figure out a method to chose unique forward paths

            }
            routes.add(path);
            if(isReachedEnd(path))
                break;
        }

        return routes.size();

    }

    private boolean isReachedEnd(List<Vertex> path) {

        for (Vertex vert : path) {
            if (vert.x != 0 && vert.y != HEIGHT) {
                return false;
            }
        }

        return true;

    }

    private class Vertex {

        public int x;
        public int y;

        public Vertex(int x, int y) {
            this.x = x;
            this.y = y;
        }

    }
}
