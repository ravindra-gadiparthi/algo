package org.algo.dp.lcs.patterns;

public class PrintSuperSequence {
    public static void main(String[] args) {
        PrintSuperSequence subSequence = new PrintSuperSequence();
        //"bbabacaa"
        //"cccababab"
        System.out.println(subSequence.printSubSequence("bbbaaaba","bbababbb"));
    }

    public String printSubSequence(String x,String y){
        int dp[][]= new int[x.length()+1][y.length()+1];
        for(int i=0;i<=x.length();i++){
            for(int j=0;j<=y.length();j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
                else if(x.charAt(i-1)==y.charAt(j-1)){
                    dp[i][j] = 1+ dp[i-1][j-1];
                }else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        int i=x.length(),j=y.length();
        StringBuffer builder=new StringBuffer();
        while (i>0 && j>0){
            if(x.charAt(i-1)==y.charAt(j-1)){
                builder.append(x.charAt(i-1));
                i--;
                j--;
            }else if(dp[i-1][j]> dp[i][j-1]){
                builder.append(x.charAt(i-1));
                i--;
            }else {
                builder.append(y.charAt(j-1));
                j--;
            }
        }
        while (i>0){
            builder.append(x.charAt(i-1));
            i--;
        }

        while (j>0){
            builder.append(y.charAt(j-1));
            j--;
        }
        return builder.reverse().toString();
    }
}
