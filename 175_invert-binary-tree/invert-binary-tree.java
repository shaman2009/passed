/*
@Copyright:LintCode
@Author:   shaman
@Problem:  http://www.lintcode.com/problem/invert-binary-tree
@Language: Java
@Datetime: 16-03-27 15:02
*/

/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */
public class Solution {
    public void invertBinaryTree(final TreeNode root) {
        if (root == null) return;
        if (root.left != null) invertBinaryTree(root.left);
        if (root.right != null) invertBinaryTree(root.right);
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
    }
}