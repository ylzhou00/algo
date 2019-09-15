package com.zyl.algo_dev.dp;

/**
 * 强盗抢劫
 * 题目描述：抢劫一排住户，但是不能抢邻近的住户，求最大抢劫量。
 * 递推方程:dp[i]=max(dp[i]+nums[i-2],dp[i-1])
 */
public class algo02 {
    public static void main(String[] args) {


    }

    // 不使用辅助空间
    private static int rob(int[] nums){
        int pre1 = 0,pre2 = 0;
        for(int i=0;i<nums.length;i++){
            int cur = Math.max(pre1+nums[i],pre2);
            pre1 = pre2;
            pre2 = cur;
        }
        return pre2;
    }

    // 环形街区抢劫 需要处理临界问题
}
