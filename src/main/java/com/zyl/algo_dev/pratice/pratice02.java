package com.zyl.algo_dev.pratice;

import java.util.Stack;

public class pratice02 {

    public static void main(String[] args) {
        /**
         * 1
         * 2 3
         * 4 5 6 7
         */
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        left.setLeft(new TreeNode(4));
        left.setRight(new TreeNode(5));
        TreeNode right = new TreeNode(3);
        right.setLeft(new TreeNode(6));
        right.setRight(new TreeNode(7));
        root.setLeft(left);
        root.setRight(right);
        postOrder(root);
    }

    public static void postOrder(TreeNode root){
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        stack1.push(root);
        while (!stack1.isEmpty()){
            TreeNode node = stack1.pop();
            if (node == null){
                continue;
            }
            stack2.push(node.val);
            //stack1.push(node.right);
            stack1.push(node.left);
            stack1.push(node.right);
        }
        while (!stack2.isEmpty()){
            System.out.print(stack2.pop() + " ");
        }
    }
}
