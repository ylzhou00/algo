package com.zyl.swordOfOffer.q20_29;

/**
 * 调整数组顺序使奇数位于偶数前面
 */
public class q21 {
    public static void main(String[] args) {
        int[] nums = {1,3,5,2,4,6,7};
        reOrderArray(nums);
        for(int num:nums){
            System.out.print(num+" ");
        }
    }

    public static void reOrderArray(int[] nums) {
        int len = nums.length;
        for(int i=0;i<len;i++){
            for(int j=0;j<len-i-1;j++){
                if(!isEven(nums[j+1])&&isEven(nums[j])){
                //if(nums[j+1]<nums[j]){
                    swap(nums,j,j+1);
                }
            }
        }
    }

    private static boolean isEven(int x) {
        return x % 2 == 0;
    }

    private static void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

}
