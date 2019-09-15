package com.zyl.algo_dev.linkedList;

/**
 * 链表反转
 * 可使用三个指针或者头插法
 */
public class algo02 {
    public static void main(String[] args) {

    }

    private static ListNode reverseList(ListNode head){
        ListNode newHead = new ListNode(-1);
        while(head != null){
            ListNode next = head.next;
            head.next = newHead.next;
            newHead.next = head;
            head = next;
        }
        return newHead.next;
    }
}
