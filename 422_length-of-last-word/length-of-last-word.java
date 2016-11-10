/*
@Copyright:LintCode
@Author:   shaman
@Problem:  http://www.lintcode.com/problem/length-of-last-word
@Language: Java
@Datetime: 16-03-19 14:48
*/

public class Solution {
    /**
     * @param s A string
     * @return the length of last word
     */
    public int lengthOfLastWord(final String s) {
        String[] split = s.split(" ");
        if (split.length == 0) {
            return 0;
        } else {
            return split[split.length - 1].length();
        }
    }
}