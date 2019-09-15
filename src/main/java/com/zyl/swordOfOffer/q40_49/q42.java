package com.zyl.swordOfOffer.q40_49;

/**
 * 连续子数组的最大和
 */
public class q42 {

    public int FindGreatestSumOfSubArray(int[] nums) {
        int greatest = Integer.MIN_VALUE;
        int sum = nums[0];
        for(int i=1;i<nums.length;i++){
            sum = Math.max(sum+nums[i],nums[i]);
            greatest = Math.max(greatest,sum);
        }
        return greatest;
    }
}
