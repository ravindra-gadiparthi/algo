package org.algo.dp.lcs.basic;
import java.util.Arrays;

public class MemoizeSolution {

    public static void main(String[] args) {
        String s1="abcdxyz";
        String s2="xyzabcd";
        System.out.println(lcs(s1,s2,s1.length(),s2.length()));
    }
    static int  lcs(String S1, String S2, int n, int m){
        int dp[][] = new int[1001][1001];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        return lcs(S1,S2,dp);
    }
    static int  lcs(String S1,String S2,int dp[][]){
        int n=S1.length();
        int m=S2.length();
        if(n==0||m==0)
            return 0;
        if(dp[n][m]!=-1){
            return dp[n][m];
        }
        if(S1.charAt(n-1)== S2.charAt(m-1))
            dp[n][m]= 1+lcs(S1,S2,n-1,m-1);
        else
            dp[n][m] = Math.max(lcs(S1,S2,n-1,m),lcs(S1,S2,n,m-1));
        return dp[n][m];
    }
}
