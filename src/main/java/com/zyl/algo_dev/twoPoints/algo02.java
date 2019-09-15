package com.zyl.algo_dev.twoPoints;

/**
 * 回文字符串
 * 题目描述：可以删除一个字符，判断是否能构成回文字符串。
 */
public class algo02 {
    public static void main(String[] args) {

    }

    public static boolean validPalindrome(String s) {
        for(int i=0,j=s.length()-1;i<j;i++,j--){
            if(s.charAt(i)!=s.charAt(j)){
                return isPalindrome(s,i,j-1) || isPalindrome(s,i+1,j);
            }
        }
        return true;
    }

    private static boolean isPalindrome(String s, int i, int j) {
        while(i<j){
            if(s.charAt(i++)!=s.charAt(j--)){
                return false;
            }
        }
        return true;
    }
}
