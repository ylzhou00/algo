package com.zyl.algo_dev.tree;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 前中后序非递归遍历二叉树
 */
public class algo06 {
    public static void main(String[] args) {

    }

    // 前序非递归遍历
    private static ArrayList<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            if(node==null) continue;
            res.add(node.val);
            stack.push(node.right);
            stack.push(node.left);
        }
        return res;
    }

    // 中序非递归遍历
    private static ArrayList<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (cur!=null && stack.isEmpty()){
            while(cur!=null){
                stack.push(cur);
                cur=cur.left;
            }
            TreeNode node = stack.pop();
            res.add(node.val);
            cur = node.right;
        }
        return res;
    }

    // 后序非递归遍历
    private static ArrayList<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> stackRes = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            if(node==null) continue;
            stackRes.add(node.val);
            stack.add(node.left);
            stack.add(node.right);
        }
        while (!stackRes.isEmpty()){
            res.add(stackRes.pop());
        }
        return res;
    }
}
