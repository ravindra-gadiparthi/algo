package org.algo.dp.lcs.patterns;

class LongestSubString {
    public static void main(String[] args) {
        LongestSubString solution = new LongestSubString();
        System.out.println(solution.findLength(new int[]{1,2,3,2,1},new int[]{3,2,1,4,7}));
    }

    /**
     * when elements are not matching reset count to 0 on lcs
     * @param nums1
     * @param nums2
     * @return
     */
    public int findLength(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m= nums2.length;

        int dp[][] = new int[n+1][m+1];

        // BASE Condition
        for(int i=0;i<n+1;i++){
            dp[i][0]=0;
        }
        for(int j=0;j<m+1;j++){
            dp[0][j]=0;
        }
        int max=0;
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(nums1[i-1]==nums2[j-1]){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    // Deviation from lcs
                    dp[i][j]=0;
                }
                max = Math.max(max,dp[i][j]);
            }
        }
        return max;
    }
}