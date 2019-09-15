package com.zyl.algo_dev.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * 找出所有相加之和为 n 的 k 个数的组合。组合中只允许含有 1 - 9 的正整数，并且每种组合中不存在重复的数字。
 */
public class CombineSum03 {

    private static List<List<Integer>> lists = new ArrayList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        backtracking(n,k,0,1,list);
        return lists;
    }

    public static void backtracking(int n,int k,int sum,int start,ArrayList<Integer> list){
        if(k==list.size()){
            if(sum==n){
                lists.add(new ArrayList<>(list));
                return;
            }
        }
        for(int i=start;i<10&&k-list.size()<10-start;i++){
            if(sum+i>n){
                continue;
            }
            list.add(i);
            backtracking(n,k,sum+i,i+1,list);
            list.remove(list.size()-1);
        }
    }

}
