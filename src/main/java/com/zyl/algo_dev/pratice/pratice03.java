package com.zyl.algo_dev.pratice;

import java.util.ArrayList;
import java.util.Stack;

public class pratice03 {
    /**
     * 1
     * 2 3
     * 4 5 6 7
     */
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        left.setLeft(new TreeNode(4));
        left.setRight(new TreeNode(5));
        TreeNode right = new TreeNode(3);
        right.setLeft(new TreeNode(6));
        right.setRight(new TreeNode(7));
        //root.setLeft(left);
        root.setRight(right);
        inorder(root);
    }

    public static void inorder(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        ArrayList<Integer> res = new ArrayList<>();
        TreeNode cur = root;
        while(cur!=null || !stack.isEmpty()){
            while(cur!=null){
                stack.push(cur);
                cur = cur.left;
            }
            TreeNode node = stack.pop();
            res.add(node.val);
            cur = node.right;
        }
        System.out.print(res.toString());
    }
}
