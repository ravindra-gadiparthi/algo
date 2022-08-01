package org.algo.binarysearch.patterns;

public class FloorInSortedArray {
    public static void main(String[] args) {
        FloorInSortedArray floorInSortedArray = new FloorInSortedArray();
        System.out.println(floorInSortedArray.solution(new int[]{1,2,3,4,8,10,10,12,19},5));
        System.out.println(floorInSortedArray.solution(new int[]{1,3,5,6},0));
    }

    public int solution(int nums[], int target) {
        int start = 0, end = nums.length - 1, res = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                res = Math.max(res,mid);
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return res;
    }
}
