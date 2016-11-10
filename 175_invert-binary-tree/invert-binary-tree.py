# coding:utf-8
'''
@Copyright:LintCode
@Author:   shaman
@Problem:  http://www.lintcode.com/problem/invert-binary-tree
@Language: Python
@Datetime: 16-03-05 09:55
'''

"""
Definition of TreeNode:
class TreeNode:
    def __init__(self, val):
        self.val = val
        self.left, self.right = None, None
"""
class Solution:
    # @param root: a TreeNode, the root of the binary tree
    # @return: nothing
    def invertBinaryTree(self, root):
            if root is None:
                return None
            if root.left:
                self.invertBinaryTree(root.left)
            if root.right:
                self.invertBinaryTree(root.right)
            root.left, root.right = root.right, root.left
            return root