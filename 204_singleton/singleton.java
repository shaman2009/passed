/*
@Copyright:LintCode
@Author:   shaman
@Problem:  http://www.lintcode.com/problem/singleton
@Language: Java
@Datetime: 15-10-07 14:04
*/

public class Solution {
    /**
     * @return: The same instance of this class every time
     */

    private static Solution solution;

    public static Solution getInstance() {
        if (solution == null) {
            solution = new Solution();
        }
        return solution;
    }
}