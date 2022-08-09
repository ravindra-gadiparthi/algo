package org.algo.stack.patterns;

import java.util.Arrays;
import java.util.Stack;

public class NearestGraterToLeft {
    public static void main(String[] args) {
        NearestGraterToLeft.solution(new int[]{1, 3, 2, 4});
    }

    public static int[] solution(int nums[]) {
        int ans[] = new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < nums.length; i++) {
            while (!stack.isEmpty() && stack.peek() < nums[i]) {
                stack.pop();
            }
            ans[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(nums[i]);
        }
        System.out.println(Arrays.toString(ans));
        return ans;
    }
}
