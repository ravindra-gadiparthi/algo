package org.algo.binarysearch.patterns;

import java.util.Arrays;

public class FirstAndLastOccurrence {
    public static void main(String[] args) {
        int []result = new FirstAndLastOccurrence().solution(new int[]{2, 4, 10, 10, 10, 18, 20}, 10);
        System.out.println(Arrays.toString(result));
    }

    public int [] solution(int array[],int target){
        return new int[]{search(array,target,true),search(array,target,false)};
    }

    /**
     * if you need first occurrence move to left side
     * else move to right side since it is sorted array
     * @param array
     * @param target
     * @param left
     * @return
     */
    public int search(int array[], int target, boolean left) {
        int start = 0, end = array.length - 1, result = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (array[mid] == target) {
                result = mid;
                if (left) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (array[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return result;
    }
}
