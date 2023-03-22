package com.bridgelabz;

public class LinkedListStack {
    Node top;

    public LinkedListStack() {
        this.top = null;
    }

    public void push(int data) {
        Node new_node = new Node(data);

        if (top == null) {
            top = new_node;
            return;
        }

        new_node.next = top;
        top = new_node;
    }

    public int pop() {
        if (top == null) {
            throw new IllegalStateException("Stack is empty");
        }

        int popped = top.data;
        top = top.next;
        return popped;
    }
}