package com.feng.data.leetcode;

// ��ת��λ�� m �� n ��������ʹ��һ��ɨ����ɷ�ת��
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
