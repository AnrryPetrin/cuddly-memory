package binarytree;

public class BinaryTree {
    Node root;

    public BinaryTree() {
        this.root = null;
    }

    private Node insert(Node current, int data) {
        if (current == null) {
            return new Node(data);
        }
        if (data < current.getData()) {
            current.setLeft(insert(current.getLeft(), data));
        } else if (data > current.getData()) {
            current.setRight(insert(current.getRight(), data));
        } else {
            return current;
        }
        return current;
    }

    public void insert(int data) {
        this.root = insert(this.root, data);
    }

    private void inOrder(Node current) {
        if (current != null) {
            inOrder(current.getLeft());
            System.out.print(current.getData() + " ");
            inOrder(current.getRight());
        }
    }

    public void inOrder() {
        inOrder(this.root);
    }

    private void preOrder(Node current) {
        if (current != null) {
            System.out.print(current.getData() + " ");
            preOrder(current.getLeft());
            preOrder(current.getRight());
        }
    }

    public void preOrder() {
        preOrder(this.root);
    }

    private void postOrder(Node current) {
        if (current != null) {
            postOrder(current.getLeft());
            postOrder(current.getRight());
            System.out.print(current.getData() + " ");
        }
    }

    public void postOrder() {
        postOrder(this.root);
    }
}