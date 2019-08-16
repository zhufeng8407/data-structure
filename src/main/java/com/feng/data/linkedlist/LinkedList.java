package com.feng.data.linkedlist;

public class LinkedList<E> {

    private Node head;

    private int size;

    public void addFirst(E e) {
        Node node = new Node(e);
        node.next = head.next;
        head.next = node;

//        head.next = new Node(e, head.next);
        size++;
    }

    private class Node {

        private E e;

        private Node next;

        public Node(E e, Node node) {
            this.e = e;
            next = node;
        }

        public Node(E e) {
            this(e, null);
        }

        public Node() {
            this(null, null);
        }
    }
}
