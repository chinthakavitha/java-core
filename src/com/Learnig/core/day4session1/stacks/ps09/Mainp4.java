package com.Learnig.core.day4session1.stacks.ps09;

public class Mainp4 {
    public static void main(String[] args) {
        Queuep4 q = new Queuep4(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);

        q.display();

        q.dequeue();
        System.out.print("After removing first element: ");
        q.display();
    }
}
