package org.algo.binarysearch.patterns;

public class BinarySearchOnReverseSortedArray {
    public static void main(String[] args) {
        System.out.println(new BinarySearchOnReverseSortedArray().search(
                new int[]{20,17,15,14,13,12,10,9,8,4},14
        ));
    }

    public int search(int array[],int element){
        int start =0, end = array.length-1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if(array[mid]==element){
                return mid;
            }else if(array[mid]> element){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
}
