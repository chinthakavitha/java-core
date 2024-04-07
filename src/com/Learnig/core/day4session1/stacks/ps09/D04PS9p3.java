package com.Learnig.core.day4session1.stacks.ps09;
import java.util.Stack;

import java.util.Stack;

public class D04PS9p3 {
    public static int evaluateExpression(String expression) {
        Stack<Integer> operandStack = new Stack<>();
        Stack<Character> operatorStack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (Character.isDigit(c)) {
                int operand = 0;
                while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
                    operand = operand * 10 + (expression.charAt(i) - '0');
                    i++;
                }
                i--;
                operandStack.push(operand);
            } else if (c == '+' || c == '-' || c == '*' || c == '/') {
                while (!operatorStack.isEmpty() && hasPrecedence(c, operatorStack.peek())) {
                    int operand2 = operandStack.pop();
                    int operand1 = operandStack.pop();
                    char operator = operatorStack.pop();
                    operandStack.push(applyOperation(operand1, operand2, operator));
                }
                operatorStack.push(c);
            }
        }

        while (!operatorStack.isEmpty()) {
            int operand2 = operandStack.pop();
            int operand1 = operandStack.pop();
            char operator = operatorStack.pop();
            operandStack.push(applyOperation(operand1, operand2, operator));
        }

        return operandStack.pop();
    }

    private static boolean hasPrecedence(char op1, char op2) {
        if (op2 == '(' || op2 == ')')
            return false;
        return (op1 != '*' && op1 != '/') || (op2 != '+' && op2 != '-');
    }

    private static int applyOperation(int operand1, int operand2, char operator) {
        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                if (operand2 == 0) throw new UnsupportedOperationException("Cannot divide by zero");
                return operand1 / operand2;
        }
        return 0;
    }
    public static void main(String[] args) {
        String expression = "10+2*6";
        int result = evaluateExpression(expression);
        System.out.println("Output: " + result);
    }
}
