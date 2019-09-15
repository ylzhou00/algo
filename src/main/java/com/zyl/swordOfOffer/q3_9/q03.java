package com.zyl.swordOfOffer.q3_9;

/**
 * 数组中重复的数字
 */
public class q03 {
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        int temp = 0;
        for(int i=0;i<length;i++){
            temp = numbers[i];
            if(numbers[temp]==temp&&temp!=i){
                duplication[0]=temp;
                i=length;
            }else if(numbers[temp]!=temp){
                //其实进行的是两个数的交换
                numbers[i]=numbers[temp];
                numbers[temp]=temp;
            }
        }
        return duplication[0]!=-1;
    }
}
