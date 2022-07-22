package org.algo.dp.lcs.patterns;

public class PrintLongestSubSequence {
    public static void main(String[] args) {
        PrintLongestSubSequence subSequence = new PrintLongestSubSequence();
        //"bbabacaa"
        //"cccababab"
        System.out.println(subSequence.printSubSequence("bbbaaaba","bbababbb"));
    }

    public String printSubSequence(String x,String y){
        LCS lcs = new LCS();
        int dp[][]= lcs.getDynamicAlgo(x,y);
        int i=x.length(),j=y.length();
        StringBuffer builder=new StringBuffer();
        while (i>0 && j>0){
            if(x.charAt(i-1)==y.charAt(j-1)){
                builder.append(x.charAt(i-1));
                i--;
                j--;
            }else if(dp[i-1][j]> dp[i][j-1]){
                i--;
            }else {
                j--;
            }
        }
        return builder.reverse().toString();
    }
}
