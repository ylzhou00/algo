package com.zyl.swordOfOffer.q40_49;

/**
 * 最小的k个数
 * 使用快速排序选择算法
 */
public class q40 {
    public static void main(String[] args) {
        int[] a = { 49, 38, 65, 97, 76, 13, -4, 27, 50 };
        int[] array = {3,1,6,6,2,2,8,1,2,1,6,2};
        findKNumbers(array,8);

    }

    public static void findKNumbers(int[] nums,int k){
        if (k > nums.length || k <= 0){
            System.out.println("输入错误");
            return ;
        }
        findKthSmallest(nums, k - 1);
        /* findKthSmallest 会改变数组，使得前 k 个数都是最小的 k 个数 */
        for (int i = 0; i < k; i++)
            System.out.println(nums[i]+" ");
    }

    public static void findKthSmallest(int[] nums,int k){
        int left = 0, right = nums.length - 1;
        while(left<right){
            int mid = partition(nums,left,right);
            System.out.println("mid is " + mid);
            if(mid == k){
                break;
            }else if(mid > k){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
    }

    public static int partition(int[] nums,int left,int right){
        int low = left;
        int temp = nums[left];
        while(left<right){
            while(nums[right]>=temp&&left<right) right--;
            while(nums[left]<=temp&&left<right) left++;
            if(left<right){
                int t = nums[left];
                nums[left] = nums[right];
                nums[right] = t;
            }
        }
        nums[low] = nums[left];
        nums[left] = temp;
        return right;
    }
}
