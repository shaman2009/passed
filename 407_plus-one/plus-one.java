/*
@Copyright:LintCode
@Author:   shaman
@Problem:  http://www.lintcode.com/problem/plus-one
@Language: Java
@Datetime: 16-04-04 16:57
*/

public class Solution {
    public int[] plusOne(int[] digits) {
        return plusOne(digits, digits.length - 1);
    }

    private int[] plusOne(int[] digits, int index) {
        int digit = digits[index] + 1;
        if (digit < 10) {
            digits[index] = digit;
            return digits;
        }
        digits[index] = 0;
        if (index == 0) {
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = 1;
            System.arraycopy(digits, 0, newDigits, 1, digits.length);
            return newDigits;
        }
        return plusOne(digits, index - 1);
    }
}