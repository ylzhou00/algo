package com.zyl.swordOfOffer.q30_39;

/**
 * 约瑟夫环问题
 */
public class t {

    public static void main(String[] args) {
        int res = LastRemaining_Solution(100,7);
        System.out.println(res);
    }

    public static int LastRemaining_Solution(int n, int m) {
        if (n == 0)     /* 特殊输入的处理 */
            return -1;
        if (n == 1)     /* 递归返回条件 */
            return 0;
        return (LastRemaining_Solution(n - 1, m) + m) % n;
    }
}
