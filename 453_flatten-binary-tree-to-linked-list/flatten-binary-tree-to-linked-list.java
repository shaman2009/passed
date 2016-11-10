/*
@Copyright:LintCode
@Author:   shaman
@Problem:  http://www.lintcode.com/problem/flatten-binary-tree-to-linked-list
@Language: Java
@Datetime: 16-03-05 12:50
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
    public void flatten(TreeNode root) {
        // write your code here
        if (root == null) {
            return;
        }
        buildLinkedList(root);
    }

    private TreeNode buildLinkedList(TreeNode node) {
        TreeNode leftNode = node.left;
        TreeNode rightNode = node.right;
        TreeNode lastTreeNode = node;

        if (leftNode != null) {
            node.right = leftNode;
            node.left = null;
            lastTreeNode = buildLinkedList(leftNode);
        }
        if (rightNode != null) {
            lastTreeNode.right = rightNode;
            lastTreeNode = buildLinkedList(rightNode);
        }
        return lastTreeNode;
    }
}