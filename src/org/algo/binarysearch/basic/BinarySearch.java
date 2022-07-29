package org.algo.binarysearch.basic;

public class BinarySearch {
    public static void main(String[] args) {
    BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.search(new int[]{1,2,3,4,5,6,7,8,9},2));
        System.out.println(binarySearch.search(new int[]{1},1));
    }

    public int search(int array[], int element) {
        int start = 0, end = array.length-1, mid;
        while (start <= end) {
            //mid = (start + end) / 2;
            mid = start + (end-start)/2;
            if (array[mid] == element) {
                return mid;
            } else if (array[mid] > element) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
