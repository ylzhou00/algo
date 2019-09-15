package com.zyl.algo_dev.linkedList;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 归并有序链表
 */
public class algo03 {
    public static void main(String[] args) {

    }

    // 归并两个有序链表
    private static ListNode mergeTwoLists(ListNode l1,ListNode l2){
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode res = new ListNode(-1);
        ListNode cur = res;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                cur.next = l1;
                l1 = l1.next;
                cur = cur.next;
            }else{
                cur.next = l2;
                l2 = l2.next;
                cur = cur.next;
            }
        }
        while(l1 != null) cur.next = l1;
        while(l2 != null) cur.next = l2;
        return res.next;
    }


    // 归并k个有序链表
    private static ListNode mergeKLists(ListNode[] lists){
        // 创建一个优先级队列,使用小顶堆
        PriorityQueue<ListNode> heap = new PriorityQueue<>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val-o2.val;
            }
        });

        // 将链表数组放入heap中
        for(ListNode list : lists){
            if(list!=null)
            heap.offer(list);
        }

        //创建一个新链表用来接收
        ListNode head = new ListNode(-1);
        ListNode cur = head;
        while(!heap.isEmpty()){
            ListNode node = heap.poll();
            cur.next = node;
            if(node.next!=null){
                heap.add(node.next);
            }
            cur = cur.next;
        }

        return head.next;
    }
}
