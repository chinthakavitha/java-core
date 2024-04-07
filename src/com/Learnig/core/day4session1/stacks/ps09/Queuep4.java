package com.Learnig.core.day4session1.stacks.ps09;

class Queuep4 {
    private int front, rear, capacity;
    private int[] queue;

    public Queuep4(int c) {
        front = rear = 0;
        capacity = c;
        queue = new int[capacity];
    }

    // Function to enqueue an element at the rear of the queue
    public void enqueue(int data) {
        if (capacity == rear) {
            System.out.println("Queue is full");
            return;
        }
        queue[rear++] = data;
    }

    // Function to dequeue an element from the front of the queue
    public void dequeue() {
        if (front == rear) {
            System.out.println("Queue is empty");
            return;
        }
        for (int i = 0; i < rear - 1; i++) {
            queue[i] = queue[i + 1];
        }
        if (rear < capacity)
            queue[rear] = 0;
        rear--;
    }

    // Function to display elements in the queue
    public void display() {
        if (front == rear) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Elements in queue: ");
        for (int i = front; i < rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}

