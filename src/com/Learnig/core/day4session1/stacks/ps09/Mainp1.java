package com.Learnig.core.day4session1.stacks.ps09;

public class Mainp1 {
    public static void main(String[] args) {
        Stackp1 stack = new Stackp1();
        stack.push("Programming");
        stack.push("Java");
        stack.push("world");
        stack.push("Hello");

        System.out.println("After Pushing 4 Elements:");
        stack.printStack();

        stack.pop(); // Remove the top element

        System.out.println("After a Pop:");
        stack.printStack();
    }
}
