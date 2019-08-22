package com.feng.data.leetcode;

public class LeetCode206 {

    public ListNode reverseList(ListNode head) {

        if (head.next == null || head == null) {
            return head;
        }

        ListNode node = reverseList(head.next);

        ListNode nowHead = node;

        while(nowHead.next != null) {
            nowHead = nowHead.next;
        }

        nowHead.next = head;

        head.next = null;

        return node;

    }


    private class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
