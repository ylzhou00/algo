package com.zyl.algo_dev.others;

/**
 *
 */
public class DeleteSeven {
    public static void main(String[] args) {
        Boolean[] arr = new Boolean[101];
        for(int i=0;i<101;i++){
            arr[i] = true;
        }
    }

    public static int findNum(Boolean[] arr){
        int count = 100;
        //当f为true表示从左往右，false表示从右往左遍历数组
        Boolean f = true;
        while(count>0){
            int temp = 0;
            if(f){
                int j = 1;
                for(int i=1;i<=100;){
                    if(j%7==0){
                        arr[i]=false;
                        i++;
                        j++;
                        count--;
                        break;
                    }
                    if(arr[i]){
                        i++;
                        j++;
                    }else{
                        i++;
                    }
                }
                f = false;
                temp = j;
            }else if(f==false){
                int j = 1;

            }
        }

        return 0;
    }
}
