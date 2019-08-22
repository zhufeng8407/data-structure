package com.feng.data.tree;

public class BST<E extends Comparable> {


    private class Node<E> {
        private E e;

        private Node<E> left;

        private Node<E> right;

        public Node(E e) {
            this.e = e;
            this.left = null;
            this.right = null;
        }
    }

    private Node<E> root;

    private int size;

    public BST() {
        this.root = null;
        this.size = 0;
    }

    // ���Ԫ��
    private void add(E e) {
        if (root == null) {
            root = new Node(e);
            size++;
        } else {
            add(root, e);
        }
    }

    // ˽�еݹ麯�������Ը��ڵ�Ϊroot�Ķ����������в���eԪ��
    private void add(Node node, E e) {

        if (e.compareTo(node.e) == 0)
            return;
        if (e.compareTo(node.e) < 0 && node.left == null) {
            Node newNode = new Node(e);
            node.left = newNode;
            size++;
            return;
        } else if(e.compareTo(node.e) > 0 && node.right == null) {
            Node newNode = new Node(e);
            node.right = newNode;
            size++;
            return;
        }

        if (e.compareTo(node.e) < 0 && node.left != null)
            add(node.left, e);
        else if(e.compareTo(node.e) > 0 && node.right != null)
            add(node.right, e);
    }
}
