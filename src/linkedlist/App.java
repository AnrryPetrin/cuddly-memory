package linkedlist;

public class App {
    public static void main(String[] args) throws Exception {
        LinkedList linkedListist = new LinkedList();
        linkedListist.add(1);
        linkedListist.add(2);
        linkedListist.add(3);
        linkedListist.add(4);

        System.out.println("Linked list elements:");
        linkedListist.print();
    }
}