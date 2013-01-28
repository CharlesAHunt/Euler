package utils;

/**
 * User: Charles
 * Date: 1/27/13
 */

public class TreeUtil {

    public static Node buildTree(String rawTreeData) {
        int row = 1;
        Node root = null;
        String[] numbers = rawTreeData.split(" ");

        for (int i = 1; i <= numbers.length; i++) {

            if (numbers[i].equals("\n"))
                row++;

            Node node = new Node();
            node.row = row;
            //Integer.parseInt(numbers[i - 1]

            if (i == 1)
                root = node;
        }

        return root;
    }

    public static class Node {

        public int value;
        public int row;
        public Node leftChild;
        public Node rightChild;

        public Node() {
        }

    }

}
