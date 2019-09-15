package com.zyl.swordOfOffer.q10_19;

/**
 * 斐波那契数列
 * 变态跳台阶 dp问题，递推方程dp[n]=dp[n-1]+dp[n-2]+...+dp[0]
 */
public class q10 {

    // dp求解，使用数组辅助空间
    public int Fibonacci01(int n) {
        if(n<=1) return n;
        int[] res = new int[n+1];
        res[1] = 1;
        for(int i=2;i<=n;i++){
            res[i] = res[i-2]+res[i-1];
        }
        return res[n];
    }

    // dp求解，不使用数组辅助空间
    public int Fibonacci02(int n) {
        if(n<=1) return n;
        int pre1 = 0,pre2 = 1;
        int res = 0;
        for(int i=2;i<=n;i++){
            res = pre1+pre2;
            pre1 = pre2;
            pre2 = res;
        }
        return res;
    }
}
