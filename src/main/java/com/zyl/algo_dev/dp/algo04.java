package com.zyl.algo_dev.dp;

/**
 * 矩阵的总路径数
 * 题目描述：统计从矩阵左上角到右下角的路径总数，每次只能向右或者向下移动。
 *
 */
public class algo04 {
    public static void main(String[] args) {
        int res = uniquePaths(3,3);
        System.out.println(res);

    }

    private static int uniquePaths(int m, int n){
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) dp[i][j] = 1;
                else if (i == 0) {
                    dp[i][j] = 1;
                } else if (j == 0) {
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
                }
            }
        }
        return dp[m - 1][n - 1];
    }
}
