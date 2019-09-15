package com.zyl.algo_dev.twoPoints;

import java.util.Arrays;
import java.util.HashSet;

/**
 * 反转字符串中的元音字符
 */
public class algo01 {
    private final static HashSet<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));

    public static void main(String[] args) {

    }

    private static String reverseVowels(String s){
        int i=0,j=s.length()-1;
        char[] res = new char[j+1];
        while(i<=j){
            char ci = s.charAt(i);
            char cj = s.charAt(j);
            if(!vowels.contains(ci)){
                res[i++]=ci;
            }else if(!vowels.contains(cj)){
                res[j--]=cj;
            }else{
                res[i++]=cj;
                res[j--]=ci;
            }
        }
        return res.toString();
    }
}
