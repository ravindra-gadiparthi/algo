package org.algo.dp.lcs.basic;

class Solution{
    public static void main(String[] args) {
        String s1="abcdxyz";
        String s2="xyzabcd";
        System.out.println(lcs(s1,s2,s1.length(),s2.length()));
    }
    static int  lcs(String S1, String S2, int n, int m){
       return lcs(S1.toCharArray(),S2.toCharArray(),n,m);
    }

    static int  lcs(char[] S1, char[] S2, int n, int m){
        if(n==0||m==0)
            return 0;
        if(S1[n-1]== S2[m-1])
            return 1+lcs(S1,S2,n-1,m-1);
        return Math.max(lcs(S1,S2,n-1,m),lcs(S1,S2,n,m-1));
    }
}