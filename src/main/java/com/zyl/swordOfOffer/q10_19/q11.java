package com.zyl.swordOfOffer.q10_19;

/**
 * 旋转数组的最小数字
 * 题目描述:把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 注意:特殊的情况：nums[l] == nums[m] == nums[h]
 */
public class q11 {

    public int minNumberInRotateArray(int[] nums) {
        if (nums.length == 0)
            return 0;
        int l = 0, h = nums.length - 1;
        while(l<h) {
            int mid = l + (h - l) / 2;
            if (nums[mid] == nums[l] && nums[mid] == nums[h]) {
                return findMinNumber(nums,l,h);
            } else if (nums[mid] <= nums[h]) {
                h = mid;
            } else {
                l = mid + 1;
            }
        }
        return nums[l];
    }

    public static int findMinNumber(int[] nums,int l,int h){
        int res = Integer.MAX_VALUE;
        for(int i=l;i<=h;i++){
            res = Math.min(res,nums[i]);
        }
        return res;
    }
}
