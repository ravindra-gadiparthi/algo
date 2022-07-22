package org.algo.dp.knacksack.bounded.basic;

public class Memoization {

    public static void main(String[] args) {
        System.out.println(knapSack(new int[]{4,5,1},new int [] {1,2,3},3,4));
    }

    public static int knapSack(int wt[],int vals[],int n,int w,int dp[][]){
        if(n==0|| w==0){
            return 0;
        }
        if(dp[n][w]!=-1){
            return dp[n][w];
        }
        int max=-1;
        if(wt[n-1]<=w){
            max = Math.max(vals[n-1]+knapSack(wt,vals,n-1,w-wt[n-1],dp),
                    knapSack(wt,vals,n-1,w,dp));
        }else{
            max = knapSack(wt,vals,n-1,w,dp);
        }
        return max;
    }

    public static int knapSack(int wt[],int vals[],int n,int w){
        int dp [][]=new int[n+1][w+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<w+1;j++){
                dp[i][j]=-1;
            }
        }
        return knapSack(wt,vals,n,w,dp);
    }
}
