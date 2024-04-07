package com.Learnig.core.day4session1.stacks.ps09;

public class Mainp2 {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10.0);
        stack.push(20.0);
        stack.push(30.0);
        stack.push(40.0);

        stack.printStack();

        // Pop twice
        stack.pop();
        stack.pop();

        System.out.println("After popping twice:");
        stack.printStack();
    }
}