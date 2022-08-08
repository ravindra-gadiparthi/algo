package org.algo.binarysearch.patterns;

public class MinDiffInSortedArray {
    public static void main(String[] args) {
        System.out.println(new MinDiffInSortedArray().solution(new int[]{4, 6, 10}, 7));
        System.out.println(new MinDiffInSortedArray().solution(new int[]{1, 3, 8, 10, 15, 25}, 12));
    }

    /**
     * At the end of the while loop,
     *     a[start] is the ceiling of target (Smallest number greater than target), and
     *     a[end] is the floor of target (Largest number smaller than target).
     * @param nums
     * @param key
     * @return
     */
    public int solution(int nums[], int key) {
        int start = 0, end = nums.length, min = Integer.MIN_VALUE, max = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == key) {
                return nums[mid];
            }
            if (nums[mid] < key) {
                min = Math.max(min, mid);
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println(start + " " + end);

        int rightDiff = nums[start] - key;
        int leftDiff = key - nums[end];
        if (rightDiff < leftDiff) {
            return nums[start];
        } else {
            return nums[end];
        }


    }
}
