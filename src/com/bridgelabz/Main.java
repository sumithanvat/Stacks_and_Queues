package com.bridgelabz;

public class Main {
    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();

        stack.push(70);
        stack.push(30);
        stack.push(56);

        System.out.print("Stack: ");
        while (stack.top != null) {
            System.out.print(stack.pop() + " ");
        }
    }
}

