package stack;

public class Stack {
    private int[] stack;
    private int top;
    private int size;

    public Stack(int size) {
        this.size = size;
        this.stack = new int[size];
        this.top = -1;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack is full");
        } else {
            this.stack[++this.top] = data;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return this.stack[this.top--];
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return this.stack[this.top];
        }
    }

    public boolean isEmpty() {
        return this.top == -1;
    }

    public boolean isFull() {
        return this.top == this.size - 1;
    }
    
    public void print() {
        for (int i = 0; i <= this.top; i++) {
            System.out.print(this.stack[i] + " ");
        }
        System.out.println();
    }
}