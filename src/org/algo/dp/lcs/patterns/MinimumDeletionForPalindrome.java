package org.algo.dp.lcs.patterns;

public class MinimumDeletionForPalindrome {
    public static void main(String[] args) {
        MinimumDeletionForPalindrome solution = new MinimumDeletionForPalindrome();
        System.out.println(solution.minDeletionsForPalindrome("aebcbda"));
    }

    /**
     * find out lcs b/w string and reveresd string.
     * @param input
     * @return
     */
    public int minDeletionsForPalindrome(String input){
        String reverseInput = new StringBuffer(input).reverse().toString();

        int dp[][]=new int[input.length()+1][reverseInput.length()+1];
        for(int i=0;i<input.length()+1;i++){
            for(int j=0;j<reverseInput.length()+1;j++){
                if(i==0||j==0){
                    dp[i][j]=0;
                }else if(input.charAt(i-1)==reverseInput.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        return input.length()-dp[input.length()][reverseInput.length()];
    }
}
