package com.zyl.swordOfOffer.q40_49;

/**
 * 礼物的最大价值
 * 题目描述:在一个 m*n 的棋盘的每一个格都放有一个礼物，每个礼物都有一定价值（大于 0）。从左上角开始拿礼物，每次向右或向下移动一格，直到右下角结束。给定一个棋盘，求拿到礼物的最大价值。
 */
public class q47 {

    public static void main(String[] args) {
        int arr[][]={{1,10,3,8},{12,2,9,6},{5,7,4,11},{3,7,16,5}};
        int res = getMost(arr);
        System.out.println("The result is " + res);
    }

    public static int getMost(int[][] values) {
        int r=values.length,c=values[0].length;
        int[][] res = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i==0&&j==0){
                    res[i][j] = values[i][j];
                }else if(i==0){
                    res[i][j] = res[i][j-1]+values[i][j];
                }else if(j==0){
                    res[i][j] = res[i-1][j]+values[i][j];
                }else{
                    res[i][j] = Math.min(res[i-1][j],res[i][j-1])+values[i][j];
                }
            }
        }
        return res[r-1][c-1];
    }
}
