/*
@Copyright:LintCode
@Author:   shaman
@Problem:  http://www.lintcode.com/problem/find-minimum-in-rotated-sorted-array
@Language: Java
@Datetime: 15-10-08 09:57
*/

public class Solution {
    /**
     * @param num: a rotated sorted array
     * @return: the minimum number in the array
     */
    public int findMin(int[] num) {
        int tmp = num[0];
        for (int i = 0; i < num.length; i++) {
            if (tmp >= num[i]) {
                tmp = num[i];
            }
        }
        return tmp;
    }
}
