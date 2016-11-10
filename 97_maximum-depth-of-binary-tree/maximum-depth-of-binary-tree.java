/*
@Copyright:LintCode
@Author:   shaman
@Problem:  http://www.lintcode.com/problem/maximum-depth-of-binary-tree
@Language: Java
@Datetime: 16-04-10 15:26
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
    public int maxDepth(TreeNode root) {
        return helper(root, 1);
    }

    private int helper(TreeNode node, int count) {
        if (node == null) return 0;
        if (node.left != null || node.right != null) {
            count++;
            int result = Math.max(helper(node.left, count), helper(node.right, count));
            return result;
        }
        return count;
    }
}