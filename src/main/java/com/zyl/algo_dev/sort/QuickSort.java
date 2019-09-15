package com.zyl.algo_dev.sort;

/**
 * 快速排序练习
 */
public class QuickSort {
    public static void main(String[] args) {
        int count=100;

    }

    private static void quickSort(int[] nums,int left,int right){
        if(left<right){
            int partitionNum = partition(nums,left,right);
            quickSort(nums,left,partitionNum-1);
            quickSort(nums,partitionNum+1,right);
        }
    }

    private static int partition(int[] nums,int left,int right){
        int low = left;
        int mid = nums[left];
        while(left<right){
            while(nums[right]>=mid&&left<right){
                right--;
            }
            while(nums[left]<=mid&&left<right){
                left++;
            }
            if(left<right){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
        }
        nums[low]=nums[left];
        nums[left]=mid;
        return left;
    }


}
