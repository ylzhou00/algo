package com.zyl.swordOfOffer.q40_49;

import java.util.HashMap;

/**
 * 最长不含重复字符的子字符串
 * 使用双指针寻找最长不重复子字符串
 */
public class q48
{
    public static void main(String[] args) {
        String s = "abcabcabc";
        int res = longestSubStringWithoutDuplication(s);
        System.out.println("res is " + res);

    }
    // 错误的!!!
    public static int longestSubStringWithoutDuplication(String str) {
        if(str.length()==0) return 0;
        HashMap<Character,Integer> map = new HashMap<>();
        int max=1,j=0;
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(map.containsKey(c)) {
                j = Math.max(map.get(c) + 1, j);
            }
            if(max < i-j+1){
                max = i-j+1;
            }
            map.put(c,i);
        }
        return max;
    }
}
