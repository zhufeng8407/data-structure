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

    // 添加元素
    private void add(E e) {
        if (root == null) {
            root = new Node(e);
            size++;
        } else {
            add(root, e);
        }
    }

    // 私有递归函数，向以根节点为root的二分搜索树中插入e元素
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
        else
            add(node.right, e);
    }

    public boolean contains(E e) {
        return contains(root, e);
    }

    private boolean contains(Node node, E e) {

        if (node == null)
            return false;

        if (e.compareTo(node.e) == 0)
            return true;
        else if(e.compareTo(node.e) < 0)
            return contains(node.left, e);
        else //(e.compareTo(node.e) > 0)
            return contains(node.right, e);

    }


    public void preOrder() {
        myPreOrder(root);
    }

    private void myPreOrder(Node node) {
        if (node == null)
            return;

        System.out.println(node.e);

        myPreOrder(node.left);
        myPreOrder(node.right);
    }


    public E minimum() {

        if (root == null)
            return null;

        return minimum(root);
    }

    private E minimum(Node<E> node) {

        if (node.left == null)
            return node.e;

        return minimum(node.left);

    }

    public E maximum() {
        if (root == null)
            return null;
        
        return maximum(root);
    }

    private E maximum(Node<E> node) {

        if (node.right == null)
            return node.e;

        return maximum(node.right);
    }


    public void removeMinimum() {
        
    }


    public static void main(String[] args) {
        BST<Integer> node = new BST();
        int[] arr = new int[]{5,7,9,3,4};

        for(int num : arr)
            node.add(num);

        System.out.println(node.minimum());
    }
}
