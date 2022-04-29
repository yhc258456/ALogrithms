package com.rachel.alogrithm.leetcode.easy.tree.binarytree;


import java.util.ArrayList;
import java.util.List;

/**
 * @author rachel
 */
public class BinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        TreeNode left = new TreeNode(8);
        TreeNode right = new TreeNode(12);
        root.left = left;
        root.right = right;
        left.left = new TreeNode(7);
        left.right = new TreeNode(9);
        right.left = new TreeNode(11);
        right.right = new TreeNode(13);
        List<Integer> integers = new BinaryTree().inorderTraversal(root);
        System.out.println(integers);
    }

    /**
     * 中序遍历二叉数
     *
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorder(root, res);
        return res;
    }

    public void inorder(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        inorder(root.left, res);
        res.add(root.val);
        inorder(root.right, res);
    }

}
