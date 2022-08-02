package org.algo.binarysearch.patterns;

public class FindNextAlphabet {
    public static void main(String[] args) {
        System.out.println(new FindNextAlphabet().solution(new char[]{'d', 'h', 'l'},'f'));
    }

    public char solution(char alphas[],char target){
        int start =0,end=alphas.length-1,res = alphas.length+1;
        while (start<=end){
            int mid = start + (end-start)/2;

            if(target<alphas[mid]){
                res = Math.min(res,mid);
                end = mid-1;
            }else{
                start=mid+1;
            }
        }
        return res<alphas.length?alphas[res]:alphas[0];
    }
}
