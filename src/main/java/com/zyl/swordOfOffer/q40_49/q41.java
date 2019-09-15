package com.zyl.swordOfOffer.q40_49;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 字符流中第一个不重复的字符
 */
public class q41 {

    private static int[] cnts = new int[256];
    private static Queue<Character> queue = new LinkedList<>();

    public void Insert(char ch) {
        cnts[ch]++;
        queue.add(ch);
        if(!queue.isEmpty()&&cnts[queue.peek()]>1){
            queue.poll();
        }
    }

    public static char FirstAppearingOnce() {
        return queue.isEmpty() ? '#':queue.peek();
    }

}
