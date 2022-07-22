package org.algo.dp.lcs.patterns;

public class MinimumInsertionDeletionToStringAtoB {
    public static void main(String[] args) {
        MinimumInsertionDeletionToStringAtoB  solution = new MinimumInsertionDeletionToStringAtoB();
        solution.minInsertionDeletion("heap","pea");
    }

    /**
     * Calculate longest substring
     * Deletions = A.length - lcs
     * Insertions= B.length- lcs
     * @param A
     * @param B
     */
    public void minInsertionDeletion(String A,String B){
        int dp[][]=new int[A.length()+1][B.length()+1];

        for(int i=0;i<A.length()+1;i++){
            for(int j=0;j<B.length()+1;j++){
                if(i==0||j==0){
                    dp[i][j]=0;
                }else if(A.charAt(i-1)==B.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }

        int lcs = dp[A.length()][B.length()];
        System.out.println("Deletions "+(A.length()-lcs));
        System.out.println("Insertions "+(B.length()-lcs));
    }
}
