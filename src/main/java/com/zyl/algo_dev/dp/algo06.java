package com.zyl.algo_dev.dp;

/**
 * 最长递增子序列
 */
public class algo06 {
    public static void main(String[] args) {

    }

    private static int lengthOfLIS(int[] nums){
        int length = nums.length;
        int[] dp = new int[length];
        for(int i=0;i<length;i++){
            int max = 1;
            for(int j=0;j<i;j++){
                if (nums[i] > nums[j]) {
                    max = Math.max(max, dp[j] + 1);
                }
            }
            dp[i] = max;
        }
        int res = 0;
        for (int i = 0; i < length; i++) {
            res = Math.max(res, dp[i]);
        }
        return res;
    }
}
