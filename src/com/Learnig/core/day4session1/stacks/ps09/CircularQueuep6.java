package com.Learnig.core.day4session1.stacks.ps09;

class CircularQueuep6 {
    // Declaring class variables
    private int size, front, rear;
    private int items[];

    // Initialize the circular queue
    CircularQueuep6(int s) {
        size = s;
        front = rear = -1;
        items = new int[size];
    }

    // Checking if the queue is full
    boolean isFull() {
        if (front == (rear + 1) % size)
            return true;
        return false;
    }

    // Checking if the queue is empty
    boolean isEmpty() {
        if (front == -1)
            return true;
        return false;
    }

    // Method to insert a new element in the queue
    void enQueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (front == -1) // If queue is empty
                front = 0;
            rear = (rear + 1) % size;
            items[rear] = data;
        //    System.out.println("Inserted Value: " + data);
        }
    }

    //  to remove an element from the queue
    int deQueue() {
        int data;
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            data = items[front];
            if (front == rear) // If single element
                front = rear = -1;
            else
                front = (front + 1) % size;
           // System.out.println("Deleted value: " + data);
            return data;
        }
    }

    // Method to display the elements in the queue
    void displayQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println(" Queue elements :");
            for (int i = front; i != rear; i = (i + 1) % size)
                System.out.print(items[i] + " ");
            System.out.println(items[rear]);
        }
    }
}

