/*
@Copyright:LintCode
@Author:   shaman
@Problem:  http://www.lintcode.com/problem/a-b-problem
@Language: Java
@Datetime: 16-01-25 15:15
*/

class Solution {
    /*
     * param a: The first integer
     * param b: The second integer
     * return: The sum of a and b
     */
    public int aplusb(int a, int b) {
        int c = a & b, r = a ^ b;
        return c == 0 ? r : aplusb(r, c << 1);    }
};