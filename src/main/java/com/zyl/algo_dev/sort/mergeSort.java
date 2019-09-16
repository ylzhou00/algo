package com.zyl.algo_dev.sort;

/**
 * 归并排序
 */
public class mergeSort {
    public static void main(String[] args) {
        int[] a = { 49, 38, 65, 97, 76, 13, -4, 27, 50 };
        mergeSort(a, 0, a.length-1);
        System.out.println("排好序的数组：");
        for (int e : a)
            System.out.print(e+" ");
    }
    private static void mergeSort(int[] nums,int l,int r){
        if(l<r){
            int mid = (l+r)/2;
            mergeSort(nums,l,mid);
            mergeSort(nums,mid+1,r);
            merge(nums,l,mid,r);
        }
    }

    private static void merge(int[] nums,int left,int mid,int right){
        // 创建临时数组保存数组变化
        //int[] temp = new int[nums.length];
        int[] temp = new int[right-left+1];
        int p1=left,p2=mid+1,i=0;
        while(p1<=mid && p2<=right){
            if(nums[p1]<=nums[p2]){
                temp[i++]=nums[p1++];
            }else{
                temp[i++]=nums[p2++];
            }
        }
        while(p1<=mid) temp[i++]=nums[p1++];
        while(p2<=right) temp[i++]=nums[p2++];
        // 复制临时数组值到nums中
        for(int j=0;j<temp.length;j++){
            nums[j+left]=temp[j];
        }
    }
}
