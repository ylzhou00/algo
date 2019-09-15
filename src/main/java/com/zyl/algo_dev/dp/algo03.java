package com.zyl.algo_dev.dp;

/**
 * 矩阵的最小路径和
 * 题目描述：求从矩阵的左上角到右下角的最小路径和，每次只能向右和向下移动。
 *
 */
public class algo03 {
    public static void main(String[] args) {


    }

    private static int minPathSum(int[][] grid){
        int m = grid.length;
        int n = grid[0].length;
        int dp[][] = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 && j==0){
                    dp[i][j] = grid[i][j];
                } else if(i==0){
                    dp[i][j] = dp[i][j-1]+grid[i][j];
                } else if(j==0){
                    dp[i][j] = dp[i-1][j]+grid[i][j];
                } else{
                    dp[i][j] = Math.min(dp[i-1][j],dp[i][j-1])+grid[i][j];
                }
            }
        }
        return dp[m-1][n-1];
    }
}
