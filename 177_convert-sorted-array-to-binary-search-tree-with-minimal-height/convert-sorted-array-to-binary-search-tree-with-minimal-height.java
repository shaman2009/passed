/*
@Copyright:LintCode
@Author:   shaman
@Problem:  http://www.lintcode.com/problem/convert-sorted-array-to-binary-search-tree-with-minimal-height
@Language: Java
@Datetime: 16-02-28 08:39
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
    /**
     * @param A: an integer array
     * @return: a tree node
     */
    public TreeNode sortedArrayToBST(int[] A) {
        return helper(A, 0, A.length - 1);
    }

    public TreeNode helper(int[] A, int low, int high) {
        if (low > high) {
            return null;
        }
        TreeNode root = new TreeNode(A[(low + high) / 2]);
        root.left = helper(A, low, (low + high) / 2 - 1);
        root.right = helper(A, (low + high) / 2 + 1, high);
        return root;
    }
}
