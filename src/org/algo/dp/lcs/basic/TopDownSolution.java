package org.algo.dp.lcs.basic;

public class TopDownSolution {

    public static void main(String[] args) {
        TopDownSolution solution = new TopDownSolution();
        System.out.println(solution.lcs("abcde", "ace"));
    }

    public int lcs(String x, String y) {
        int n=x.length(),m=y.length();

        int dp[][] = new int[n + 1][m + 1];

        // Base Condition
        for (int i = 0; i < n + 1; i++) {
            dp[i][0] = 0;
        }

        for (int j = 0; j < m + 1; j++) {
            dp[0][j] = 0;
        }

        // TopDown
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (x.charAt(i-1) == y.charAt(j-1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                }
            }
        }
        return dp[n][m];
    }
}
