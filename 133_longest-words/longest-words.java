/*
@Copyright:LintCode
@Author:   shaman
@Problem:  http://www.lintcode.com/problem/longest-words
@Language: Java
@Datetime: 16-03-19 14:41
*/

class Solution {
    ArrayList<String> longestWords(final String[] dictionary) {
        int max = 0;
        ArrayList<String> result = new ArrayList<>();

        for (String s : dictionary) {
            if (s.length() > max) {
                max = s.length();
                result = new ArrayList<>();
            }
            if (s.length() == max)
                result.add(s);
        }
        return result;
    }
};