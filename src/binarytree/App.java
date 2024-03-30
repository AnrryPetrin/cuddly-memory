package binarytree;

public class App {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insert(50);
        binaryTree.insert(30);
        binaryTree.insert(20);
        binaryTree.insert(40);
        binaryTree.insert(70);
        binaryTree.insert(60);
        binaryTree.insert(80);

        System.out.println("In-order traversal:");
        binaryTree.inOrder();

        System.out.println("\nPre-order traversal:");
        binaryTree.preOrder();

        System.out.println("\nPost-order traversal:");
        binaryTree.postOrder();
    }
}
