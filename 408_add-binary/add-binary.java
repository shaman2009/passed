/*
@Copyright:LintCode
@Author:   shaman
@Problem:  http://www.lintcode.com/problem/add-binary
@Language: Java
@Datetime: 16-01-26 13:34
*/

public class Solution {
    /**
     * @param a a number
     * @param b a number
     * @return the result
     */
    public String addBinary(String a, String b) {
        return Integer.toBinaryString(Integer.parseInt(a, 2) + Integer.parseInt(b, 2));
    }
}