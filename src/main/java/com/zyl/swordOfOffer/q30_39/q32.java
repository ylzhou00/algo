package com.zyl.swordOfOffer.q30_39;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 从上往下打印二叉树
 */
public class q32 {

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int cnt = queue.size();
            while(cnt-- > 0){
                TreeNode t = queue.poll();
                res.add(t.val);
                if(t.left!=null) queue.add(t.left);
                if(t.right!=null) queue.add(t.right);
            }
        }
        return res;
    }
}
