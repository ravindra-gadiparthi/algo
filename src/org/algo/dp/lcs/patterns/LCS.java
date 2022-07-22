package org.algo.dp.lcs.patterns;

public class LCS {
    public static void main(String[] args) {
        LCS sequence=new LCS();
        int dp[][] = sequence.getDynamicAlgo("bbabacaa","bbababbb");
        System.out.println(dp[dp.length-1][dp[0].length-1]);
    }

    public int[][] getDynamicAlgo(String x, String y){
        int m= x.length(),n=y.length();
        int dp[][] = new int[m+1][n+1];

        for(int i=0;i<m+1;i++){
            for(int j=0;j<n+1;j++){
                if(i==0||j==0){
                    dp[i][j]=0;
                }else if(x.charAt(i-1)==y.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }else {
                    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        return dp;
    }
}


