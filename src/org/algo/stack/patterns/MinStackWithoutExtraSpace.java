package org.algo.stack.patterns;

import java.util.Stack;

public class MinStackWithoutExtraSpace {

    int min;
    private Stack<Integer> stack;
    public MinStackWithoutExtraSpace() {
        stack = new Stack<>();
    }

    public static void main(String[] args) {
        MinStackWithoutExtraSpace stackWithoutExtraSpace = new MinStackWithoutExtraSpace();
        stackWithoutExtraSpace.push(4);
        stackWithoutExtraSpace.push(2);
        stackWithoutExtraSpace.push(7);
        stackWithoutExtraSpace.push(1);
        stackWithoutExtraSpace.push(8);
        System.out.println(stackWithoutExtraSpace.peek());
        System.out.println(stackWithoutExtraSpace.pop());
        System.out.println(stackWithoutExtraSpace.pop());
        System.out.println(stackWithoutExtraSpace.peek());
    }

    public int getMin() {

        return stack.isEmpty() ? -1 : min;
    }

    public void push(int value) {
        if (stack.isEmpty()) {
            min = value;
            stack.push(value);
        } else {
            if (value > min) {
                stack.push(value);
            } else {
                int flag = 2 * value - min;
                stack.push(flag);
                min = value;
            }
        }
    }

    public int pop() {
        if (stack.peek() > min) {
            return stack.pop();
        } else {
            int prevMin = 2 * min - stack.peek();
            stack.pop();
            int currentMin = min;
            min = prevMin;
            return currentMin;
        }
    }

    public int peek() {
        return stack.peek() > min ? stack.peek() : min;
    }
}
