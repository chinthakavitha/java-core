package com.Learnig.core.day4session1.stacks.ps09;

public class Mainp5 {
    public static void main(String[] args) {
        Queuep5 queue = new Queuep5();
        queue.enqueue(89);
        queue.enqueue(99);
        queue.enqueue(109);
        queue.enqueue(209);
        queue.enqueue(309);

        System.out.print("Elements in queue: ");
        printQueue(queue);

        // Remove two elements
        queue.dequeue();
        queue.dequeue();

        System.out.print("\nAfter removing two elements: ");
        printQueue(queue);
    }

    public static void printQueue(Queuep5 queue) {
        Node front = queue.getFront();
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }
        Node current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}