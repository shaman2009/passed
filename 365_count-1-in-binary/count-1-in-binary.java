/*
@Copyright:LintCode
@Author:   shaman
@Problem:  http://www.lintcode.com/problem/count-1-in-binary
@Language: Java
@Datetime: 16-02-28 12:23
*/

public class Solution {
    /**
     * @param num: an integer
     * @return: an integer, the number of ones in num
     */
    public int countOnes(int num) {
        // write your code here
        int count = 0;
        String binaryString = Integer.toBinaryString(num);
        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }
}