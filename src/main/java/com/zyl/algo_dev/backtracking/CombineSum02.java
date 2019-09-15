package com.zyl.algo_dev.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 组合总和II
 * 给定一个数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
 * candidates 中的每个数字在每个组合中只能使用一次。
 */
public class CombineSum02 {

    private static List<List<Integer>> lists = new ArrayList<>();


    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if (candidates == null || candidates.length == 0 || target < 0) {
            return lists;
        }
        Arrays.sort(candidates);
        ArrayList<Integer> list = new ArrayList<>();
        backtracking(0,candidates,list,target);
        return lists;
    }

    public static void backtracking(int start,int[] candidates,ArrayList list,int target){
        if (target < 0) {
            return;
        }
        if (target == 0) {
            lists.add(new ArrayList<>(list));
        }else {
            for (int i = start; i < candidates.length && target - candidates[i] >= 0; i++) {
                //后面重复数字的分支需要剪枝，前面相同数字的分区覆盖范围更大
                if (i > start && candidates[i] == candidates[i - 1]) {
                    continue;
                }
                list.add(candidates[i]);
                backtracking(i + 1, candidates, list, target - candidates[i]);
                list.remove(list.size() - 1);
            }
        }
    }

}
