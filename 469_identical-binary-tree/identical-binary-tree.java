/*
@Copyright:LintCode
@Author:   shaman
@Problem:  http://www.lintcode.com/problem/identical-binary-tree
@Language: Java
@Datetime: 16-03-12 10:37
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
     public boolean isIdentical(TreeNode a, TreeNode b) {
        return helper(a, b);
    }

    private boolean helper(TreeNode a, TreeNode b) {
        if (a == null && b == null) {
            return true;
        }
        if ((a == null && b != null) || (a != null && b == null) ) {
            return false;
        }
        if (a.val != b.val) {
            return false;
        }
        
        return helper(a.left, b.left) && helper(a.right, b.right);
    }
}