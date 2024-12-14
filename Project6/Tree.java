package Project6;

public class Tree<K extends Comparable<K>, V> {

    class Node<K, V> {
    K key;
    V value;
    Node<K, V> left, right;
    int size;  // Number of nodes in the subtree
    int height; // Height of the subtree

    Node(K key, V value) {
        this.key = key;
        this.value = value;
        this.size = 1;
        this.height = 1;
        }
    }

    private Node<K, V> root;

    // Insert or update a key-value pair
    public void put(K key, V value) {
        root = put(root, key, value);
    }

    private Node<K, V> put(Node<K, V> node, K key, V value) {
        if (node == null) return new Node<>(key, value);

        int cmp = key.compareTo(node.key);
        if (cmp < 0) node.left = put(node.left, key, value);
        else if (cmp > 0) node.right = put(node.right, key, value);
        else node.value = value;

        updateNode(node);
        return node;
    }

    // Retrieve a value by key
    public V get(K key) {
        Node<K, V> node = get(root, key);
        return node == null ? null : node.value;
    }

    private Node<K, V> get(Node<K, V> node, K key) {
        if (node == null) return null;

        int cmp = key.compareTo(node.key);
        if (cmp < 0) return get(node.left, key);
        else if (cmp > 0) return get(node.right, key);
        else return node;
    }

    // Check if the tree is empty
    public boolean isEmpty() {
        return root == null;
    }

    // Return the total size of the tree
    public int size() {
        return root == null ? 0 : root.size;
    }

    // Return the height of the tree
    public int height() {
        return root == null ? 0 : root.height;
    }

    // Return the height of the subtree containing the key
    public int height(K key) {
        Node<K, V> node = get(root, key);
        return node == null ? -1 : node.height;
    }

    // Check if the tree contains a key
    public boolean contains(K key) {
        return get(root, key) != null;
    }

    // Return the size of the subtree containing the key
    public int size(K key) {
        Node<K, V> node = get(root, key);
        return node == null ? -1 : node.size;
    }

    // Helper to update size and height of a node
    private void updateNode(Node<K, V> node) {
        node.size = 1 + size(node.left) + size(node.right);
        node.height = 1 + Math.max(height(node.left), height(node.right));
    }

    private int size(Node<K, V> node) {
        return node == null ? 0 : node.size;
    }

    private int height(Node<K, V> node) {
        return node == null ? 0 : node.height;
    }
}
