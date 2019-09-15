package com.zyl.swordOfOffer.q50_59;

/**
 * 反转单词顺序序列
 * 需要先对每个单词反转，再反转整个字符串
 */
public class q58 {
    public String ReverseSentence(String str) {
        int n = str.length();
        char[] arr = str.toCharArray();
        int i=0,j=0;
        // 此处有需要注意对细节
        while(j<n){
            if(j==n||arr[j]==' '){
                reverse(arr,i,j-1);
                i = j+1;
            }
            j++;
        }
        reverse(arr,0,n-1);
        return new String(arr);
    }

    private static void reverse(char[] c, int i, int j) {
        while(i<j){
            swap(c,i++,j--);
        }
    }

    private static void swap(char[] c,int i,int j) {
        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;
    }

}
