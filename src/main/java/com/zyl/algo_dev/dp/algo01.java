package com.zyl.algo_dev.dp;

/**
 * 爬楼梯
 * 题目描述:有 N 阶楼梯，每次可以上一阶或者两阶，求有多少种上楼梯的方法。
 * 递推方程:dp[n]=dp[n-1]+dp[n-2]
 */
public class algo01 {
    public static void main(String[] args) {
        int res = climbStairs01(10);
        System.out.println(res);
    }

    // 使用辅助空间
    private static int climbStairs01(int n){
        if(n<=2){
            return n;
        }
        int[] res = new int[n];
        res[0] = 1;
        res[1] = 2;
        for(int i=2;i<n;i++){
            res[i] = res[i-1]+res[i-2];
        }
        return res[n-1];
    }

    // 不使用辅助空间
    private static int climbStairs02(int n){
        if(n<=2){
            return n;
        }
        int pre1 = 1,pre2 = 2;
        for(int i=0;i<n-2;i++){
            int cur = pre1 + pre2;
            pre1 = pre2;
            pre2 = cur;
        }
        return pre2;
    }
}
