package org.algo.stack.patterns;

import java.util.Arrays;
import java.util.Stack;

public class NearestSmallerToRight {
    public static void main(String[] args) {
        solution(new int[]{4,5,2,10,8});
    }

    public static int[] solution(int nums[]) {
        int ans[] = new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() > nums[i]) {
                stack.pop();
            }
            ans[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(nums[i]);
        }
        System.out.println(Arrays.toString(ans));
        return ans;
    }
}
