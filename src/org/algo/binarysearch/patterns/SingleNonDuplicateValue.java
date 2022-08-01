package org.algo.binarysearch.patterns;

public class SingleNonDuplicateValue {
    public static void main(String[] args) {
        System.out.println(new SingleNonDuplicateValue().singleNonDuplicate(
                new int[]{1,1,2,2,3,3}
        ));

/*        System.out.println(new SingleNonDuplicateValue().singleNonDuplicate(
                new int[]{3,3,7,7,10,11,11}
        ));*/
    }

    public int singleNonDuplicate(int[] nums) {
        int start = 0, end = nums.length-1;

        while(start<end){
            int mid = (start+end)/2;
            boolean isEven = mid%2==0;
            if((isEven && nums[mid]==nums[mid+1] )||(!isEven && nums[mid]==nums[mid-1])){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        return nums[start];
    }
}
