package org.algo.dp.lcs.patterns;

import java.util.Arrays;

/**
 * Given an array arr[] of N integers, the task is to find and print the Longest Increasing Subsequence.
 * Examples:
 *
 *
 * Input: arr[] = {12, 34, 1, 5, 40, 80}
 * Output: 4
 * {12, 34, 40, 80} and {1, 5, 40, 80} are the
 * longest increasing subsequences.
 * Input: arr[] = {10, 22, 9, 33, 21, 50, 41, 60, 80}
 * Output: 6
 */
public class LIS {
    public static void main(String[] args) {
        System.out.println(new LIS().longestIncreasingSubSequence(new int[]{12, 34, 1, 5, 40, 80}));
    }

    /**
     * find out LCS between array and sorted array
     * @param array
     * @return
     */
    public int longestIncreasingSubSequence(int array[]){
        int length = array.length;
        int[] sortedArray = Arrays.stream(array).distinct().sorted().toArray();
        int dp[][] = new int[length+1][sortedArray.length+1];
        for(int i=0;i<length+1;i++){
            for(int j=0;j<sortedArray.length+1;j++){
                if(i==0||j==0){
                    dp[i][j] = 0;
                }else if(array[i-1]==sortedArray[j-1]){
                    dp[i][j] =1+dp[i-1][j-1];
                }else {
                    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        return dp[length][length];
    }
}
