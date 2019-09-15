package com.zyl.algo_dev.tree;

/**
 * 树的高度
 * 变形题   平衡树  两节点的最长路径  ---  dfs
 */
public class algo01 {
    public static void main(String[] args) {


    }

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
