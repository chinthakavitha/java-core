package com.Learnig.core.day4session1.stacks.ps09;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queuep5 {
    private Node front, rear;

    public Queuep5() {
        front = rear = null;
    }

    public void enqueue(int item) {
        Node newNode = new Node(item);
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1; // Return -1 for empty queue
        }
        int item = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return item;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1; // Return -1 for empty queue
        }
        return front.data;
    }

    public boolean isEmpty() {
        return front == null;
    }

    // Getter for front field
    public Node getFront() {
        return front;
    }
}