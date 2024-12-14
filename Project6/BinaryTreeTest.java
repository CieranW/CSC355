package Project6;

public class BinaryTreeTest {
    public static void main(String[] args) {
        Tree<Integer, String> tree = new Tree<>();

        // Insert test cases
        tree.put(10, "A");
        tree.put(5, "B");
        tree.put(15, "C");
        tree.put(3, "D");
        tree.put(7, "E");

        // Testing methods
        System.out.println("Tree Size: " + tree.size()); // Output: 5
        System.out.println("Tree Height: " + tree.height()); // Output: 3
        System.out.println("Contains 10: " + tree.contains(10)); // Output: true
        System.out.println("Height of node 5: " + tree.height(5)); // Output: 2
        System.out.println("Subtree size of 5: " + tree.size(5)); // Output: 3
    }
}
