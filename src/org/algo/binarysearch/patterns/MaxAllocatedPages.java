package org.algo.binarysearch.patterns;

public class MaxAllocatedPages {
    public static void main(String[] args) {
        System.out.println(findPages(new int[]{12,34,67,90},4,2));
    }
    //Function to find minimum number of pages.
    public static int findPages(int[]A,int N,int M)
    {
        if(N<M){
            return -1;
        }

        int max = A[N-1];
        int res=-1,sum=0;
        for(int value:A){
            sum+=value;
        }

        int start=max,end=sum;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(isValid(A,N,M,mid)){
                res = mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return res;

    }

    private static boolean isValid(int A[],int N,int M, int max){
        int sum=0,s=1;
        for(int i=0;i<N;i++){
            sum+=A[i];
            if(sum>max){
                s++;
                sum=A[i];
            }

            if(M<s){
                return false;
            }
        }
        return true;
    }
}
