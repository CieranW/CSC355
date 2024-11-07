public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        int[] keys = { 20, 10, 30, 5, 15, 25, 35, 3, 7, 17, 27, 37 };

        for (int value : keys) {
            tree.insert(value);
        }

        tree.inorder();
    }
}
