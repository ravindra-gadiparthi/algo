package org.algo.stack.basic;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Stack;

public class NextLargestElement {
    public static void main(String[] args) {
        nextLargerElement(new long[]{1,3,2,4});
    }

    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] nums)
    {
        long ans[] = new long[nums.length];
        Stack<Long> stack = new Stack<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek()< nums[i]){
                stack.pop();
            }
            ans[i] = stack.isEmpty()?-1l:stack.peek();
            stack.push(nums[i]);
        }
        System.out.println(Arrays.toString(ans));
        return ans;
    }
}
