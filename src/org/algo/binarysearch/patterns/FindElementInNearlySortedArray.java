package org.algo.binarysearch.patterns;

public class FindElementInNearlySortedArray {
    public static void main(String[] args) {
        System.out.println(new FindElementInNearlySortedArray().solution(
                new int[]{10, 3, 40, 20, 50, 80, 70},
                40
        ));


        System.out.println(new FindElementInNearlySortedArray().solution(
                new int[]{10, 3, 40, 20, 50, 80, 70},
                100
        ));
    }

    public int solution(int array[], int target) {
        int start = 0, end = array.length - 1;
        while (start <= end) {
            int mid = (start + (end - start) / 2);
            if (array[mid] == target) {
                return mid;
            } else if (mid - 1 >= start && array[mid - 1] == target) {
                return mid - 1;
            } else if (mid + 1 <= end && array[mid + 1] == target) {
                return mid + 1;
            } else if (array[mid] < target) {
                start = mid + 2;
            } else {
                end = mid - 2;
            }
        }
        return -1;
    }
}
