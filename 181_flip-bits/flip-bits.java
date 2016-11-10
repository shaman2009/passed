/*
@Copyright:LintCode
@Author:   shaman
@Problem:  http://www.lintcode.com/problem/flip-bits
@Language: Java
@Datetime: 16-03-05 13:23
*/

class Solution {
    public static int bitSwapRequired(int a, int b) {
        int orVal = a ^ b;
        int count = 0;
        while (orVal != 0) {
            if ((orVal & 1) == 1) {
                count++;
            }
            orVal >>>= 1;
        }
        return count;
    }
}
