package org.algo.stack.basic;

import java.util.Stack;

public class NextLargestElement {
    public static void main(String[] args) {
        System.out.println(nextLargerElement(new long[]{1,3,2,4}));
    }

    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] nums)
    {
        long ans[] = new long[nums.length];
        Stack<Long> stack = new Stack<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            if (stack.empty()) {
                ans[i] = -1l;
            } else if (stack.peek() > nums[i]) {
                ans[i] = stack.peek();
            }else{
                while (!stack.isEmpty() && stack.peek()< nums[i]){
                    stack.pop();
                }
                ans[i] = stack.isEmpty()?-1l:stack.peek();
            }
            stack.push(nums[i]);
        }
        return ans;
    }
}
