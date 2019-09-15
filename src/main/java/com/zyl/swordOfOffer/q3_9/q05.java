package com.zyl.swordOfOffer.q3_9;

/**
 * 替换空格
 */
public class q05 {

    public static void main(String[] args) {
        String s = replaceSpace("A B");
        System.out.println(s);
    }
    public static String replaceSpace(String str) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                sb.append(str.charAt(i));
            }else{
                sb.append("%20");
            }
        }
        return sb.toString();
    }
}
