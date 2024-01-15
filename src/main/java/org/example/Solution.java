package org.example;

class Solution {
    int min = Integer.MAX_VALUE;
    int prev = Integer.MAX_VALUE;

    public int getMinimumDifference(TreeNode root) {
        if (root == null) return 0;
        inOrder(root);
        return min;
    }

    public void inOrder(TreeNode root) {
        if (root.left != null) inOrder(root.left);
        min = Math.abs(Math.min(min, root.val - prev));
        prev = root.val;
        if (root.right != null) inOrder(root.right);
    }
}