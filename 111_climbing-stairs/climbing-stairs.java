/*
@Copyright:LintCode
@Author:   shaman
@Problem:  http://www.lintcode.com/problem/climbing-stairs
@Language: Java
@Datetime: 16-02-28 06:01
*/

public class Solution {
    public int climbStairs(int n) {
        int a = 1;
        int b = 1;
        for (int i = 1; i < n; i++) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        return b;
    }
}