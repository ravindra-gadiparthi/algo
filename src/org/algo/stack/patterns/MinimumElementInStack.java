package org.algo.stack.patterns;

import java.util.Stack;

public class MinimumElementInStack {
    public static void main(String[] args) {
        MinStack<Integer> stack = new MinStack<>();
        stack.push(19);
        stack.push(18);
        stack.push(28);
        stack.push(15);
        System.out.println(stack.min());
        stack.pop();
        System.out.println(stack.min());
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.min());

    }
}

class MinStack<T extends Comparable<T>> {
    private Stack<T> stack = new Stack<>();
    private Stack<T> minStack = new Stack<>();

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void push(T object) {
        stack.push(object);
        if (minStack.isEmpty()) {
            minStack.push(object);
        } else if (minStack.peek().compareTo(object) != -1) {
            minStack.push(object);
        }
    }

    public T pop() {
        T element = stack.pop();
        if (element.equals(minStack.peek())) {
            minStack.pop();
        }
        return element;
    }

    public T min() {
        return minStack.isEmpty() ? null : minStack.peek();
    }
}

