package com.zyl.algo_dev.sort;

/**
 * 冒泡排序练习
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {3,1,6,6,2,2,8,1,2,1,6,2};
        bubbleSort(array);
        for(int elem : array){
            System.out.print(elem);
        }

    }
    private static void bubbleSort(int [] array){
        int length = array.length;
        for(int i=0;i<length;i++){
            for(int j=0;j<length-i-1;j++){
                if(array[j+1]<array[j]){
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

}
