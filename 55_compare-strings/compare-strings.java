/*
@Copyright:LintCode
@Author:   shaman
@Problem:  http://www.lintcode.com/problem/compare-strings
@Language: Java
@Datetime: 16-02-28 08:20
*/

public class Solution {
    /**
     * @param A : A string includes Upper Case letters
     * @param B : A string includes Upper Case letter
     * @return :  if string A contains all of the characters in B return true else return false
     */
    public boolean compareStrings(String A, String B) {
        for (int i = 0; i < B.length(); i++) {
            if (A.indexOf(B.charAt(i)) == -1) {
                return false;
            }
            A = new StringBuilder(A).deleteCharAt(A.indexOf(B.charAt(i))).toString();
        }
        return true;
    }
}