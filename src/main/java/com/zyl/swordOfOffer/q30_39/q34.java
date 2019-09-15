package com.zyl.swordOfOffer.q30_39;

import java.util.ArrayList;

/**
 * 二叉树中和为某一路经的值
 * 题目描述:输入一颗二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 */
public class q34 {

    private static ArrayList<ArrayList<Integer>> ret = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        backtracking(root, target, new ArrayList<>());
        return ret;
    }

    public static void backtracking(TreeNode root,int target,ArrayList<Integer> path){
        if(root == null)
            return;
        path.add(root.val);
        target -= root.val;
        if(target==0&&root.left==null&&root.right==null){
            ret.add(new ArrayList<>(path));
        }else{
            backtracking(root.left, target, path);
            backtracking(root.right, target, path);
        }
        path.remove(path.size()-1);
    }
}
