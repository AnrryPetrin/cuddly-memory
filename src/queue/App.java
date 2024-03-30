package queue;

public class App {
    public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        System.out.println("Peek: " + queue.peek());

        System.out.println("Elements dequeued from queue:");
        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }
    }
}