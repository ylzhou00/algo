package com.zyl.algo_dev.dp;

/**
 * 给定不同面额的硬币 coins 和一个总金额 amount。编写一个函数来计算可以凑成总金额所需的最少的硬币个数。如果没有任何一种硬币组合能组成总金额，返回 -1。
 *
 */
public class algo11 {

    public static void main(String[] args) {

    }

    public static int coinChange(int[] coins, int amount) {
        if(coins==null || coins.length==0 || amount==0){
            return 0;
        }
        int[] dp = new int[amount+1];
        for(int coin:coins){
            for(int i=coin;i<=amount;i++){
                // 有金额amount刚好为硬币值的只需要一个即可
                if(coin==i){
                    dp[i] = 1;
                }else{
                    // 能凑成dp[i-coin]才能凑成dp[i]
                    if(dp[i-coin]!=0){
                        // 暂时能凑成dp[i-coin],之前还未凑成过dp[i]的
                        if(dp[i] == 0){
                            dp[i] = dp[i-coin]+1;
                        }else{
                            // 能凑成dp[i-coin],但是之前也凑成过dp[i]的
                            dp[i] = Math.min(dp[i],dp[i-coin]+1);
                        }
                    }
                }
            }
        }
        return dp[amount] == 0 ? -1 : dp[amount];
    }
}
