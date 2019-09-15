package com.zyl.swordOfOffer.q20_29;

/**
 * 链表中倒数第 K 个结点
 * 注意临界条件的判断
 */
public class q22 {

    public ListNode FindKthToTail(ListNode head, int k) {
        if (head == null)
            return null;
        ListNode temp = head;
        while(temp!=null&&k-- > 0){
            temp = temp.next;
        }
        if(k>0){
            return null;
        }
        ListNode res = head;
        while(temp!=null){
            res = res.next;
            temp = temp.next;
        }
        return res;
    }

}
