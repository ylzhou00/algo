package com.zyl.swordOfOffer.q30_39;

/**
 * 数组中出现次数超过一半的数字
 */
public class q39 {

    public int moreThanHalfNum(int[] nums) {
        int majority = nums[0];
        int cnt = 1;
        for(int i=1;i<nums.length;i++){
            cnt = majority==nums[i] ? cnt++:cnt--;
            if(cnt == 0){
                majority = nums[i];
                cnt = 1;
            }
        }
        int count =0;
        for(int val:nums){
            if(val == majority){
                count++;
            }
        }
        if(nums.length/2<count){
            return majority;
        }else{
            return 0;
        }
    }

}
