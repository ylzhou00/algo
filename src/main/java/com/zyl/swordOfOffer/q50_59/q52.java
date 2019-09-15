package com.zyl.swordOfOffer.q50_59;

/**
 * 两个链表的第一个公共结点
 */
public class q52
{
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        while(pHead1!=pHead2){
            pHead1 = pHead1==null ? pHead2:pHead1.next;
            pHead2 = pHead2==null ? pHead1:pHead2.next;
        }
        return pHead1;
    }

}
