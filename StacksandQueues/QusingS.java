package StacksandQueues;

import java.util.Stack;

class QusingS {
    public Stack<Integer> first;
    public Stack<Integer> second;

    public QusingS() {
        first = new Stack<>();
        second = new Stack<>();
    }

    public void push(int x) {
        first.push(x);
    }

    public int pop() {
        // Move all elements from 'first' to 'second' to reverse the order
        while (!first.isEmpty()) {
            second.push(first.pop());
        }
        
        // The top of 'second' is now the front of the queue
        int removed = second.pop();
        
        // Move all elements back to 'first' to maintain the original state
        while (!second.isEmpty()) {
            first.push(second.pop());
        }
        
        return removed;
    }

    public int peek() {
        // Move all elements from 'first' to 'second'
        while (!first.isEmpty()) {
            second.push(first.pop());
        }
        
        // Peek at the top of 'second'
        int peeked = second.peek();
        
        // Move all elements back to 'first'
        while (!second.isEmpty()) {
            first.push(second.pop());
        }
        
        return peeked;
    }

    public boolean empty() {
        return first.isEmpty();
    }
    public static void main(String[] args) {
        // Instantiate the MyQueue object
        QusingS myQueue = new QusingS();
        // Push elements into the queue
        myQueue.push(1);
        myQueue.push(2);
        myQueue.push(3);
        // Peek at the front element
        // Expected output: 1
        System.out.println("Front element (peek): " + myQueue.peek());

        // Pop an element from the queue
        // Expected output: 1
        System.out.println("Popped element: " + myQueue.pop());

        // Check if the queue is empty
        // Expected output: false
        System.out.println("Is the queue empty? " + myQueue.empty());
        
        // Peek at the new front element
        // Expected output: 2
        System.out.println("New front element (peek): " + myQueue.peek());

        // Pop the remaining elements
        System.out.println("Popped element: " + myQueue.pop()); // Expected: 2
        System.out.println("Popped element: " + myQueue.pop()); // Expected: 3
        
        // Check if the queue is empty now
        // Expected output: true
        System.out.println("Is the queue empty? " + myQueue.empty());
    }
}
