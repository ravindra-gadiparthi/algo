package org.algo.binarysearch.patterns;

public class RotationInSortedArray {
    public static void main(String[] args) {
        System.out.println(new RotationInSortedArray().solution(new int[]{3,4,5,1,2}));
    }

    public int solution(int array[]){
        int start = 0,end = array.length-1,n=array.length;

        while (start<=end){
            int mid = start + (end-start)/2;
            int next = (mid+1)%n;
            int prev = (mid-1+n)%n;

            if(array[mid]<array[prev] && array[mid]<array[next]){
                return mid;
            }else if(array[mid]> array[end]){
                start = mid+1;
            }else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
