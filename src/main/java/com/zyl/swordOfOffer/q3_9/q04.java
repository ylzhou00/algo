package com.zyl.swordOfOffer.q3_9;

/**
 * 二维数组中的查找
 * 题目描述: 给定一个二维数组，其每一行从左到右递增排序，从上到下也是递增排序。给定一个数，判断这个数是否在该二维数组中。
 */
public class q04 {

    public boolean Find(int target, int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return false;

        int rows = 0,cols = matrix[0].length;
        int r = 0,c = cols-1;  //从右上角开始
        while(r < rows && c > 0){
            if(matrix[r][c]==target){
                return true;
            }else if(matrix[r][c]>target){
                c--;
            }else{
                r++;
            }
        }
        return false;
    }
}
