package com.Learnig.core.day4session1.stacks.ps09;

class Nodep2 {
    double data;
    Nodep2 next;

    public Nodep2(double data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
    private Nodep2 top;

    public Stack() {
        this.top = null;
    }

    public void push(double data) {
        Nodep2 newNode = new Nodep2(data);
        newNode.next = top;
        top = newNode;
    }

    public double pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return Double.NaN; // Return NaN for empty stack
        }
        double poppedValue = top.data;
        top = top.next;
        return poppedValue;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void printStack() {
        Nodep2 temp = top;
        System.out.print("The elements of the stack are: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

