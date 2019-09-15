package com.zyl.algo_dev.bigData;
import java.util.*;

/**
 * TopN问题的处理
 */
public class TopN {
    public static void main(String[] args) {
        Random random = new Random(System.currentTimeMillis());

        int[] numbers = new int[10000000];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10000000);
        }


        long start = System.currentTimeMillis();
        ArrayList<Integer> res1 = GetLeastNumbers_Solution1(numbers,10);
        for(int elem : res1){
            System.out.print(elem+" ");
        }
        long time = System.currentTimeMillis() - start;
        System.out.println();
        System.out.println("方法一耗时:"+time);


        start = System.currentTimeMillis();
        ArrayList<Integer> res2 = GetLeastNumbers_Solution2(numbers,10);
        for(int elem : res2){
            System.out.print(elem+" ");
        }
        time = System.currentTimeMillis() - start;
        System.out.println();
        System.out.println("方法二耗时:"+time);

    }

    public static ArrayList<Integer> GetLeastNumbers_Solution1(int [] input, int k) {
        if(k>input.length||k<=0) return new ArrayList<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((o1,o2)->o2-o1);
        for(int num:input){
            maxHeap.add(num);
            if(maxHeap.size()>k){
                maxHeap.poll();
            }
        }
        return new ArrayList<>(maxHeap);
    }

    public static ArrayList<Integer> GetLeastNumbers_Solution2(int [] input, int k) {
        if(k>input.length||k<=0) return new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((o1,o2)->o1-o2);
        for(int num:input){
            minHeap.offer(num);
        }
        while(k-- > 0){
            res.add(minHeap.poll());
        }
        return res;
    }

}
