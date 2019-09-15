package com.zyl.swordOfOffer.q3_9;

import java.util.ArrayList;

/**
 * 从尾到头打印链表
 * 可使用头插法反转链表也可以使用stack
 */
public class q06 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
    // 头插法构建逆序链表
    ListNode head = new ListNode(-1);
    while (listNode != null) {
        ListNode memo = listNode.next;
        listNode.next = head.next;
        head.next = listNode;
        listNode = memo;
    }
    // 构建 ArrayList
    ArrayList<Integer> ret = new ArrayList<>();
    head = head.next;
    while (head != null) {
        ret.add(head.val);
        head = head.next;
    }
    return ret;
    }
}
