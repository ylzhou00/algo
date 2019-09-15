package com.zyl.algo_dev.tree;

/**
 * 翻转树
 */
public class algo02 {
    public static void main(String[] args) {

    }

    private static TreeNode invertTree(TreeNode root) {
        if(root==null){
            return null;
        }
        TreeNode left = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(left);
        return root;
    }

}
