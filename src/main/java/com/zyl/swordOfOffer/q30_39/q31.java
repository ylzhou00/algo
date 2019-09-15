package com.zyl.swordOfOffer.q30_39;

import java.util.Stack;

/**
 * 栈的压入、弹出序列
 * 解题思路是用一个栈模拟压入弹出操作
 */
public class q31 {

    public static boolean IsPopOrder(int[] pushSequence, int[] popSequence) {
        int n = pushSequence.length;
        Stack<Integer> stack = new Stack<>();
        for(int pushIndex=0,popIndex=0;pushIndex<n;pushIndex++){
            stack.push(pushSequence[popIndex]);
            while(popIndex<n && !stack.isEmpty() && stack.peek()==popSequence[popIndex]){
                stack.pop();
                popIndex++;
            }
        }
        return stack.isEmpty();
    }
}
