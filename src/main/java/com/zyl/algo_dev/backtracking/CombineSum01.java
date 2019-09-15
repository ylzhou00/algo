package com.zyl.algo_dev.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 组合总和I
 * 给定一个无重复元素的数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
 * candidates 中的数字可以无限制重复被选取。
 */
public class CombineSum01 {

    private static List<List<Integer>> lists = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if(candidates == null || candidates.length<=0 || target < 0){
            return lists;
        }
        Arrays.sort(candidates);
        ArrayList<Integer> list = new ArrayList<>();
        backtracking(0,candidates,list,target);
        return lists;
    }

    public static void backtracking(int start, int[] candidates, ArrayList<Integer> list, int target){
        if(target<0){
            return;
        }
        if(target==0){
            lists.add(new ArrayList<>(list));
            return;
        }else{
            for(int i=start;i<candidates.length&&target-candidates[i]>=0;i++){
//                if(i>start&&candidates[i]==candidates[i-1]){
//                    continue;
//                }
                list.add(candidates[i]);
                backtracking(i,candidates,list,target-candidates[i]);
                list.remove(list.size()-1);
            }

        }
    }
}
