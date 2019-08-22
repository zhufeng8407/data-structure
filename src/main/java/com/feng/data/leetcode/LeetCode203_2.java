package com.feng.data.leetcode;

public class LeetCode203_2 {

    public ListNode removeElements(ListNode head, int val) {


        if (head == null) {
            return null;
        }

        ListNode node = removeElements(head.next, val);

        if (head.val == val) {
            return node;
        } else {
            head.next = node;
            return head;
        }

    }


    private class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
