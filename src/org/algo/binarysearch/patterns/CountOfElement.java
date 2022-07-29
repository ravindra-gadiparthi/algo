package org.algo.binarysearch.patterns;

public class CountOfElement {
    public static void main(String[] args) {
        System.out.println(new CountOfElement().solution(new int[]{2, 4, 10, 10, 10, 10, 20}, 10));
    }

    public int solution(int []array, int target){
        int first = solutionSide(array,target,true);
        int last = solutionSide(array,target,false);
        if(first==-1 || last ==-1)
            return 0;
        else
            return last-first+1;
    }

    public int solutionSide(int array[],int target, boolean left){
        int start = 0, end = array.length-1,result = -1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if(array[mid] == target){
                result = mid;
                if(left){
                    end = mid-1;
                }else{
                    start=mid+1;
                }
            }else if(array[mid]>target){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return result;
    }
}
