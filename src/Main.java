/**
 * User: Charles
 * Date: 4/5/12
 */
public class Main {

    public static void main(String [] args){

        runProblemSets();

    }

    private static void runProblemSets() {
        show("Running problem sets...");

        show("Answer to problem 1: " + new Problem1().solve());
        show("Answer to problem 2: " + new Problem2().solve());
        show("Answer to problem 3: " + new Problem3().solve());
        show("Answer to problem 4: " + new Problem4().solve());
        show("Answer to problem 5: " + new Problem5().solve());
        show("Answer to problem 6: " + new Problem6().solve());

        show("Problem sets solved.");
    }

    private static void show(String text) {
        System.out.println(text);
    }
}
