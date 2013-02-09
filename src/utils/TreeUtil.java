package utils;

/**
 * User: Charles
 * Date: 1/27/13
 */

public class TreeUtil {

    public static Node getTree(String rawTreeData) {

        Node root = new Node();
        String[] numbers = rawTreeData.split(" ");

        root.value = Integer.parseInt(numbers[0]);
        root.leftChild = buildTree(numbers, 0, 1, 0);
        root.rightChild = buildTree(numbers, 0, 1, 1);

        return root;
    }

    public static Node buildTree(String[] numberTree, Integer oldIndex, Integer oldRow, Integer adder) {

        Integer newIndex = (oldIndex + oldRow + adder);
        Integer newRow = oldRow + 1;

        if(newIndex >= numberTree.length)
            return null;

        Node child = new Node();

        child.value = Integer.parseInt(numberTree[newIndex]);
        child.leftChild = buildTree(numberTree, newIndex, newRow, 0);
        child.rightChild = buildTree(numberTree, newIndex, newRow, 1);

        return child;
    }

    public static class Node {

        public int value;
        public Node leftChild;
        public Node rightChild;

        public Node() {
        }

    }

}
