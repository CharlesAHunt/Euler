/**
 * User: Charles
 * Date: 4/5/12
 */
public class Main {

    public static void main(String [] args){

        runProblemSets();

    }

    private static void runProblemSets() {

        show("Running problem sets...\n");

//        show(label(1) + new Problem1().solve());
//        show(label(2) + new Problem2().solve());
//        show(label(3) + new Problem3().solve());
//        show(label(4) + new Problem4().solve());
//        show(label(5) + new Problem5().solve());
//        show(label(6) + new Problem6().solve());
//        show(label(7) + new Problem7().solve());
//        show(label(8) + new Problem8().solve());
//        show(label(9) + new Problem9().solve());
//        show(label(10) + new Problem10().solve());
//        show(label(11) + new Problem11().solve());
//        show(label(12) + new Problem12().solve());
//        show(label(13) + new Problem13().solve());
//        show(label(14) + new Problem14().solve());
//        show(label(15) + new Problem15().solve());
//        show(label(16) + new Problem16().solve());
//        show(label(17) + new Problem17().solve());
//        show(label(18) + new Problem18().solve());
//        show(label(19) + new Problem19().solve());
//        show(label(20) + new Problem20().solve());
//        show(label(21) + new Problem21().solve());
//        show(label(22) + new Problem22().solve());
//        show(label(23) + new Problem23().solve());
//        show(label(24) + new Problem24().solve());
//        show(label(25) + new Problem25().solve());
//        show(label(26) + new Problem26().solve());
        show(label(27) + new Problem27().solve());
//        show(label(28) + new Problem28().solve());
        show("\nProblem sets solved.");

    }

    private static void show(String text) {
        System.out.println(text);
    }

    private static String label(Integer problemNumber) {
        return ("Answer to problem " + problemNumber + ": ");
    }
}
