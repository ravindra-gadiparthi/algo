package org.algo.dp.knacksack.bounded.basic;

public class TopDownSolution {

    public static void main(String[] args) {
        System.out.println(knapSack(4,new int[]{4,5,1},new int [] {1,2,3},3));
    }

    public static int knapSack(int w,int wt[],int vals[],int n){
        //initialize DP
        int dp [][]=new int[n+1][w+1];

        //Base Condition
        for(int i=0;i<n+1;i++){
            for(int j=0;j<w+1;j++){
                if(i==0 || j==0){
                    dp[i][j] = 0;
                }
            }
        }
        //Choice Diagram Code
        /**
         * Choice if weight at i-1 is less than or equal to capacity
         *  profit = max profit of (price at i-1)+max profit for remaining weights for
         *           remaining capacity, profit when weight is not included
         * if current weight is grater than capacity , get max profit of sub problem without considering current weight.
         */
        for(int i=1;i<n+1;i++){
            for(int j=1;j<w+1;j++){
                if(wt[i-1]<=j){
                    dp[i][j] = Math.max(vals[i-1]+ dp[i-1][j-wt[i-1]]
                                        ,dp[i-1][j]);
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][w];
    }
}
