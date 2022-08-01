package org.algo.binarysearch.patterns;

public class FindElementInRotatedSortedArray {
    public static void main(String[] args) {
        System.out.println(new FindElementInRotatedSortedArray().solution(new int[]{3,1},3));
    }

    public int solution(int nums[],int target){
        int start =0, n=nums.length, end = n-1;
        int minIndex=0;
        //find minimum index in rotated array
        while (start<=end){
            int mid = start + (end-start)/2;
            int prev = (mid-1+n)%n;
            if(nums[mid]<nums[prev]){
                minIndex = mid;
                break;
            }else if(nums[mid]>nums[end]){
                start = mid+1;
            }else {
                end = mid-1;
            }
        }

        //decide whether to search on left or right
        if(target<=nums[n-1]){
            start = minIndex;
            end = n-1;
        }else{
            start=0;
            end = (minIndex-1+n)%n;
        }

        //implement binary search
        while (start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                start=mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
}
