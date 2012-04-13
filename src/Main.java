/**
 * User: Charles
 * Date: 4/5/12
 */
public class Main {

    public static void main(String [] args){

        runProblemSets();

    }

    private static void runProblemSets() {
        System.out.println("Running problem sets...");

        System.out.println("Answer to problem 1: " + new Problem1().solve());
        System.out.println("Answer to problem 2: " + new Problem2().solve());
        System.out.println("Answer to problem 3: " + new Problem3().solve());

        System.out.println("Problem sets solved.");
    }
}
