package org.algo.binarysearch.patterns;

public class FindPeakElement {
    public static void main(String[] args) {
        System.out.println(new FindPeakElement().solution(new int[]{1,2,1}));
    }

    public int solution(int nums[]){
        int start =0,end = nums.length-1;

        if(nums.length==1){
            return nums[0];
        }
        while (start<=end){
            int mid = start + (end - start)/2;

            // if lower index exist , mid-index value should grater than lowe index value
            // if higher index exist then mid-index value grater than high index value
            if(mid>0 && mid+1<nums.length && nums[mid-1]<nums[mid] && nums[mid]>nums[mid+1]){
                return nums[mid];
            }

            //if no low index , then check only high index
            else if(mid==0 && nums[mid+1]<nums[mid]){
                return nums[mid];
            }
            // if no high index check with low index
            else if(mid==nums.length-1 && nums[mid]>nums[mid-1]){
                return nums[mid];
            }
            //if mid-value less than high index move towards high index
            else if(nums[mid]<nums[mid+1]){
                start=mid+1;
            }else{
                end=mid-1;
            }

        }
        return -1;
    }
}
