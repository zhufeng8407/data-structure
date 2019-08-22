package com.feng.data.leetcode;

// 反转从位置 m 到 n 的链表。请使用一趟扫描完成反转。
public class LeetCode92 {

    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;

        ListNode temp = dummyHead;
        int index = 0;
        ListNode subTail = null;
        ListNode subHead = null;
        while(temp != null) {
            if (index == m) {
            }
        }

        //TODO

        return null;
    }


    private class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
