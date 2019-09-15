package com.zyl.swordOfOffer.q20_29;

import java.util.ArrayList;

/**
 * 顺时针打印矩阵
 */
public class p29 {

    public ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> res = new ArrayList<>();
        int r1=0,r2=matrix.length,c1=0,c2=matrix[0].length;
        while(r1<=r2&&c1<=c2){
            for(int i=c1;i<=c2;i++){
                res.add(matrix[r1][i]);
            }
            for(int i=r1+1;i<=r2;i++){
                res.add(matrix[i][c2]);
            }
            if(r1!=r2){
                for(int i=c2-1;i>=c1;i--){
                    res.add(matrix[r2][i]);
                }
            }
            if(c1!=c2){
                for(int i=r2-1;i>r1;i--){
                    res.add(matrix[i][c1]);
                }
            }
            r1++;r2--;c1++;c2--;
        }
        return res;
    }
}
