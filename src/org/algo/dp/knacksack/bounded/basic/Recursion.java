package org.algo.dp.knacksack.bounded.basic;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(knapSack(4,new int[]{4,5,1},new int [] {1,2,3},3));
    }
    static int knapSack(int W, int wt[], int val[], int n)
    {
        if(n==0 || wt.length==0)
            return 0;
        if(wt[n-1]<=W){
            return Math.max(val[n-1]+knapSack(W-wt[n-1],wt,val,n-1),knapSack(W-wt[n-1],wt,val,n-1));
        }else{
            return knapSack(W,wt,val,n-1);
        }
    }
}
