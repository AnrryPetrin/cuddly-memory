package linkedlist;

public class App {
    public static void main(String[] args) throws Exception {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);

        linkedList.add(5, 2);
        linkedList.add(9, 3);

        System.out.println("Linked list elements:");
        linkedList.print();
    }
}