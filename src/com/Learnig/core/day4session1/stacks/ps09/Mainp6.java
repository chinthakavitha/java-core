package com.Learnig.core.day4session1.stacks.ps09;

public class Mainp6 {
    public static void main(String[] args) {
        CircularQueuep6 q = new CircularQueuep6(5);

        q.enQueue(14);
        q.enQueue(22);
        q.enQueue(13);
        q.enQueue(-8);

        q.displayQueue();

        q.deQueue();

        q.displayQueue();
    }
}
