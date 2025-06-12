package xyz;

class BinaryTree {
    static class Node {
        String name;
        Node left, right;
        Node(String name) { this.name = name; }
    }

    Node root = new Node("Mom");

    BinaryTree() {
        root.left = new Node("Dad");
        root.right = new Node("You");
    }

    void printRoot() {
        System.out.println("Root: " + root.name);
    }

    void printChildren(Node n) {
        System.out.println(n.name + " → Left: " + (n.left != null ? n.left.name : "null")
                         + ", Right: " + (n.right != null ? n.right.name : "null"));
    }

    int countNodes(Node n) {
        return n == null ? 0 : 1 + countNodes(n.left) + countNodes(n.right);
    }

    int countLeaves(Node n) {
        if (n == null) return 0;
        if (n.left == null && n.right == null) return 1;
        return countLeaves(n.left) + countLeaves(n.right);
    }

    void inOrder(Node n) {
        if (n == null) return;
        inOrder(n.left);
        System.out.print(n.name + " ");
        inOrder(n.right);
    }

    Node mirror(Node n) {
        if (n == null) return null;
        Node temp = mirror(n.left);
        n.left = mirror(n.right);
        n.right = temp;
        return n;
    }

    void printPaths(Node n, String path) {
        if (n == null) return;
        path += n.name + " ";
        if (n.left == null && n.right == null)
            System.out.println("Path: " + path);
        else {
            printPaths(n.left, path);
            printPaths(n.right, path);
        }
    }

    public static void main(String[] args) {
        BinaryTree t = new BinaryTree();
        t.printRoot();
        t.printChildren(t.root);
        System.out.println("Nodes: " + t.countNodes(t.root));
        System.out.println("Leaf nodes: " + t.countLeaves(t.root));
        System.out.print("In-order: "); t.inOrder(t.root); 
        System.out.println();
        t.root = t.mirror(t.root);
        System.out.print("In-order (mirrored): "); t.inOrder(t.root); System.out.println();
        t.printPaths(t.root, "");
        System.out.println("Tree is empty: " + (t.root == null));
    }
}

