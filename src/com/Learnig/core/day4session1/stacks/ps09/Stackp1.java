package com.Learnig.core.day4session1.stacks.ps09;

class Stackp1 {
    private static final int MAX_SIZE = 1000;
    private int top;
    private String[] array;

    public Stackp1() {
        top = -1;
        array = new String[MAX_SIZE];
    }

    public void push(String item) {
        if (top == MAX_SIZE - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        array[++top] = item;
    }

    public String pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return null;
        }
        return array[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void printStack() {
        for (int i = top; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

