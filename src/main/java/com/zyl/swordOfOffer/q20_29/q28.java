package com.zyl.swordOfOffer.q20_29;

/**
 * 对称的二叉树
 */
public class q28 {

    public static boolean isSymmetrical(TreeNode pRoot) {
        if (pRoot == null)
            return true;
        return isSymmetrical(pRoot.left, pRoot.right);
    }

    public static boolean isSymmetrical(TreeNode left,TreeNode right) {
        if(left == null && right == null) return true;
        if(left == null || right == null) return false;
        if(left.val != right.val) return false;
        return isSymmetrical(left.left,right.right) && isSymmetrical(left.right,right.left);
    }

}
