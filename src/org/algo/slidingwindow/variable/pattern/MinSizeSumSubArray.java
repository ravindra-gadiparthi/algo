package org.algo.slidingwindow.variable.pattern;

public class MinSizeSumSubArray {

    public static void main(String[] args) {
        MinSizeSumSubArray minSizeSumSubArray=new MinSizeSumSubArray();
        minSizeSumSubArray.minSubArrayLen(7,new int[]{2,3,1,2,4,3});
        minSizeSumSubArray.minSubArrayLen(4,new int[]{1,4,4});
        minSizeSumSubArray.minSubArrayLen(11,new int[]{1,1,1,1,1,1,1,1});
    }

    public int minSubArrayLen(int target, int[] nums) {
        int i=0,min=Integer.MAX_VALUE,sum=0;

        for(int j=0;j<nums.length;j++){
            sum=sum+nums[j];
            while(sum>=target){
                min = Math.min(min,j-i+1);
                sum=sum-nums[i];
                i++;
            }
        }
        min =min==Integer.MAX_VALUE?0:min;
        System.out.println(min);
        return min;
    }
}
