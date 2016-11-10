/*
@Copyright:LintCode
@Author:   shaman
@Problem:  http://www.lintcode.com/problem/binary-tree-paths
@Language: Java
@Datetime: 16-02-27 13:32
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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        String list = "";
        if (root != null)
            list = list + root.val;
        helper(root, result, list);
        return result;
    }

    private void helper(TreeNode root, List<String> result, String lst) {
        if (root == null)
            return;
        if (root.left == null && root.right == null) {
            result.add(lst);
            return;
        }
        if (root.left != null)
            helper(root.left, result, lst + "->" + root.left.val);
        if (root.right != null)
            helper(root.right, result, lst + "->" + root.right.val);
    }
}
