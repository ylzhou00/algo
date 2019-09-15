package com.zyl.algo_dev.linkedList;

/**
 * 找出链表的交点
 */
public class algo01 {
    public static void main(String[] args) {

    }

    private static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode l1 = headA, l2 = headB;
        while(l1!=l2){
            l1 = (l1 == null) ? l2:l1.next;
            l2 = (l2 == null) ? l1:l2.next;
        }
        return l1;
    }
}
