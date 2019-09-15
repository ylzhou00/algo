package com.zyl.swordOfOffer.q20_29;

/**
 * 反转链表
 */
public class q24 {

    public ListNode ReverseList(ListNode head) {
        ListNode newList = new ListNode(-1);
        while(head!=null){
            ListNode temp = head.next;
            head.next = newList.next;
            newList.next = head;
            head = temp;
        }
        return newList.next;
    }
}
