/*
@Copyright:LintCode
@Author:   shaman
@Problem:  http://www.lintcode.com/problem/fibonacci
@Language: Java
@Datetime: 16-01-28 15:18
*/

public class Solution {
    public int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return n - 1;
        }

        return fibHelper(0, 1, n);
    }

    private int fibHelper(int i, int j, int n) {
        if ( n == 2) {
            return j;
        }
        return fibHelper(j, i + j, n - 1);
    }
}