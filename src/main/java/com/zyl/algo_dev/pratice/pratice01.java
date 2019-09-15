package com.zyl.algo_dev.pratice;

public class pratice01 {

    public static void main(String[] args) {
        int[] nums = {1,-2,5,3,9,11,26,-9,2,1};
        heapsort(nums,nums.length);
        for(int num:nums){
            System.out.print(num+" ");
        }
    }

    public static void heapsort(int[] nums,int length){
        //build maxheap
        for(int i=length/2-1;i>=0;i--){
            adjustheap(nums,i,length);
        }
        //adjust maxheap
        for(int i=length-1;i>0;i--){
            swap(nums,0,i);
            adjustheap(nums,0,i);
        }
    }

    public static void adjustheap(int[] nums,int k,int length){
        int left = k*2+1;
        int right = k*2+2;
        int largest = k;
        if(left<length&&nums[left]>nums[largest]){
            largest = left;
        }
        if(right<length&&nums[right]>nums[largest]){
            largest = right;
        }
        if(largest!=k){
            swap(nums,k,largest);
            adjustheap(nums,largest,length);
        }
    }

    public static void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
