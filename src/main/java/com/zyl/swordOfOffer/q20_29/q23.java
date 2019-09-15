package com.zyl.swordOfOffer.q20_29;

/**
 * 链表中环的入口节点
 */
public class q23 {

    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if(pHead==null||pHead==null) return null;
        ListNode fast=pHead,slow=pHead;
        do{
            fast = fast.next.next;
            slow= slow.next;
        }while(fast!=slow);
        fast = pHead;
        while(fast!=slow){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

}
