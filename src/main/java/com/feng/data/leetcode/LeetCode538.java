package com.feng.data.leetcode;

public class LeetCode538 {

    public TreeNode convertBST(TreeNode root) {
        if (root == null) {
            return root;
        }

        root.val += convertBSTResult(root, root.val);

        convertBSTResult(root.left, root.left.val);

        convertBSTResult(root.right, root.right.val);

        return root;

    }

    private Integer convertBSTResult(TreeNode node, int val) {

        if (node == null)
            return 0;

        if(node.right == null)
            return val;

        val += convertBSTResult(node.right, node.val);

        return val;
    }


    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
