package com.zyl.algo_dev.dp;

/**
 * 分割整数
 * 分割整数的最大乘积
 */
public class algo05 {
    public static void main(String[] args) {

    }

    private static int integerBreak(int n){
        int[] dp = new int[n+1];
        dp[1] = 1;
        for(int i=2;i<=n;i++){
            for(int j=1;j<i;j++){
                dp[i] = Math.max(dp[i],Math.max(dp[i-j]*(i-j),i*(i-j)));
            }
        }
        return dp[n];
    }
}
