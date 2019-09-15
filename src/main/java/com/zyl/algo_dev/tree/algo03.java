package com.zyl.algo_dev.tree;

/**
 * 判断路径是否等于一个数
 */
public class algo03 {
    public static void main(String[] args) {


    }

    private static boolean hasPathSum(TreeNode root, int sum) {
        if(root==null) return false;
        if(root.left==null&&root.right==null&&root.val==sum) return true;
        return hasPathSum(root.left, sum-root.val)||hasPathSum(root.right,sum-root.val);
    }
}
