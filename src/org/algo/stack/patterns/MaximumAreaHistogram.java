package org.algo.stack.patterns;

import java.util.Arrays;
import java.util.Stack;

public class MaximumAreaHistogram {
    public static void main(String[] args) {
        new MaximumAreaHistogram().solution(new int[]{1,1});
    }

    public int solution(int nums[]) {
        int nsr[] = nsr(nums);
        int nsl[] = nsl(nums);
        System.out.println(Arrays.toString(nsr));
        System.out.println(Arrays.toString(nsl));
        int maxArea = 0;
        for (int i = 0; i < nums.length; i++) {
            int width = nsr[i] - nsl[i] - 1;
            int area = width * nums[i];
            maxArea = Math.max(area, maxArea);
        }
        System.out.println("Max Area " + maxArea);
        return maxArea;
    }

    public int[] nsr(int nums[]) {
        int ans[] = new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = nums.length-1; i >= 0; i--) {
            while (!stack.isEmpty() && nums[stack.peek()] >= nums[i]) {
                stack.pop();
            }
            ans[i] = stack.isEmpty() ? nums.length : stack.peek();
            stack.push(i);
        }
        return ans;
    }


    public int[] nsl(int nums[]) {
        int ans[] = new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < nums.length; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] >= nums[i]) {
                stack.pop();
            }
            ans[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
        return ans;
    }
}
