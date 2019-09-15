package com.zyl.algo_dev.dp;

/**
 * 最长公共子序列
 * 对于两个子序列 S1 和 S2，找出它们最长的公共子序列。
 * dp[i][j]=dp[i-1][j-1]+1 or max(dp[i-1][j],dp[i][j-1])
 */
public class algo07 {
    public static void main(String[] args) {

    }

    private static int lengthOfLCS(int[] nums1,int[] nums2){
        int n1 = nums1.length,n2 = nums2.length;
        int[][] dp = new int[n1+1][n2+1];
        for(int i=1;i<=n1;i++){
            for(int j=1;j<=n2;j++){
                if(nums1[i-1]==nums2[j-1]){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[n1][n2];
    }
}
