# coding:utf-8
'''
@Copyright:LintCode
@Author:   shaman
@Problem:  http://www.lintcode.com/problem/fibonacci
@Language: Python
@Datetime: 16-01-30 12:44
'''

class Solution:
    # @param n: an integer
    # @return an integer f(n)
    def fibonacci(self, n):
        # write your code here
        a, b = 0, 1
        for i in range(1, n):
            a, b = b, a + b
        return a