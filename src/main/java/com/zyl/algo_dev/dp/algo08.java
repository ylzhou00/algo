package com.zyl.algo_dev.dp;

/**
 * 01背包
 * dp[i][j] = max(dp[i-1][j],dp[i-1][j-w]+v)
 */
public class algo08 {
    public static void main(String[] args) {

    }

    private static int knapsack(int W, int N, int[] weights, int[] values){
        int[][] dp = new int[N + 1][W + 1];
        for(int i=1;i<=N;i++){
            int w = weights[i - 1], v = values[i - 1];
            for(int j=1;j<=W;j++){
                if(j>=w){
                    dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-w]+v);
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[N][W];
    }
}
