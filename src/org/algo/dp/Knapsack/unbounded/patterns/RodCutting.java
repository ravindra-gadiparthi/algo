package org.algo.dp.Knapsack.unbounded.patterns;


class RodCutting {
    public static void main(String args[]) {
        System.out.println(cutRodNaive(new int[]{1,   5,   8 ,  9,  10,  17 , 17 , 20},8));
    }
    public static int cutRodNaive(int price[], int n) {
        int lengths[] = new int[n];
        for(int i=0;i<n;i++){
            lengths[i]=i+1;
        }
        return cutRod(price,lengths,n,n-1);
    }
    public static int cutRod(int price[],int lengths[], int n,int index) {
        if(index==0)
            return n*price[index];

        int notCut = cutRod(price,lengths,n,index-1);
        int cut = 0;

        if(lengths[index]<=n){
            cut = price[index]+cutRod(price,lengths,n-lengths[index],index);
        }
        return Math.max(notCut,cut);
    }

    public int cutRodDP(int price[], int n) {

        int lengths[] = new int[n];

        for(int i=0;i<n;i++){
            lengths[i]=i+1;
        }

        int dp[][] = new int[n+1][n+1];
        for(int i=0;i<n+1;i++){
            dp[i][0]=0;
            dp[0][i]=0;
        }

        for(int i=1;i<n+1;i++){
            for(int j=1;j<n+1;j++){
                if(lengths[i-1]<=j){
                    dp[i][j] = Math.max(price[i-1]+dp[i][j-lengths[i-1]],dp[i-1][j]);
                }else{
                    dp[i][j] =dp[i-1][j];
                }
            }
        }
        return dp[n][n];
    }
}


