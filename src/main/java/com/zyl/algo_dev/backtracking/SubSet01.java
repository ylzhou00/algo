package com.zyl.algo_dev.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。
 */
public class SubSet01 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new  ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<Integer>();
        if(nums.length==0)
            return subsets;

        //第一步：定义解向量
        findSubsets(nums,0,temp,subsets);
        return subsets;
    }
    //递归加循环的回溯法。
    public static void findSubsets(int[] nums,int start,List<Integer> temp,List<List<Integer>> subsets){
        //第二步：确定分支条件，选出题目需要的解集
        subsets.add(new ArrayList<Integer>(temp));

        //第三步：深度优先搜索
        for(int i=start;i<nums.length;i++){
            temp.add(nums[i]);
            findSubsets(nums,i+1,temp,subsets);
            //回溯法的核心步骤，在遍历完后回退至上一层。
            temp.remove(temp.size()-1);
        }
        return ;
    }
}
