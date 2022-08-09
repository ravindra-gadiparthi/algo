package org.algo.stack.patterns;

import java.util.Arrays;
import java.util.Stack;

public class StockSpanProblem {
    public static void main(String[] args) {
        solution(new int[]{100, 80, 60, 70, 60, 75, 85});
    }

    public static int[] solution(int stocks[]) {
        int ans[] = new int[stocks.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < stocks.length; i++) {
            while (!stack.isEmpty() && stocks[stack.peek()] <= stocks[i]) {
                stack.pop();
            }
            int ngsIndex = stack.isEmpty() ? -1 : stack.peek();
            ans[i] = i - ngsIndex;
            stack.push(i);
        }
        System.out.println(Arrays.toString(ans));
        return ans;
    }
}
