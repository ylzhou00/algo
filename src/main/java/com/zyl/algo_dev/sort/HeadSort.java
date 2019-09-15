package com.zyl.algo_dev.sort;

import java.util.Arrays;

/**
 * 堆排序
 */
public class HeadSort {
    public static void main(String[] args) {
        int []arr = {9,8,7,6,5,4,3,2,1,22,5,4,2,3,77,8,5,34,3,24,4,5,63,534,234,67,64};
        heapSort(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public static void heapSort(int[] arr,int length){
        // 创建大顶堆
        for(int i=length/2-1;i>=0;i--) {
            heapify(arr,i,length);
        }
        // 调整大顶堆
        for(int i=length-1;i>0;i--){
            swap(arr,0,i);
            heapify(arr,0,i);
        }
    }

    // 调整大顶堆交换节点的方法 核心步骤
    public static void heapify(int[] arr,int i,int length) {
        int left = 2*i+1;
        int right = 2*i+2;
        int largest = i;

        if (left < length && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < length && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {
            swap(arr, i, largest);
            heapify(arr, largest, length);
        }
    }

    public static void swap(int[] arr,int a,int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
