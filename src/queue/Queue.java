package queue;

public class Queue {
    private int[] queue;
    private int size;
    private int front;
    private int rear;

    public Queue(int size) {
        this.size = size;
        this.queue = new int[size];
        this.front = 0;
        this.rear = 0;
    }

    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            this.queue[this.rear] = data;
            this.rear = (this.rear + 1) % this.size;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            int data = this.queue[this.front];
            this.front = (this.front + 1) % this.size;
            return data;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            return this.queue[this.front];
        }
    }

    public boolean isEmpty() {
        return this.front == this.rear;
    }

    public boolean isFull() {
        return (this.rear + 1) % this.size == this.front;
    }

    public void print() {
        for (int i = this.front; i != this.rear; i = (i + 1) % this.size) {
            System.out.print(this.queue[i] + " ");
        }
        System.out.println();
    }
}