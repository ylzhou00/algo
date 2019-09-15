package com.zyl.algo_dev.dp;

/**
 * 给定不同面额的硬币和一个总金额。写出函数来计算可以凑成总金额的硬币组合数。假设每一种面额的硬币有无限个。
 */
public class algo12 {

    public static int change(int amount, int[] coins) {
        if(coins==null) return 0;
        int[] dp = new int[amount+1];
        dp[0] = 1;
        for(int coin:coins){
            for(int i=coin;i<=amount;i++){
                dp[i] += dp[i-coin];
            }
        }
        return dp[amount];
    }
}
