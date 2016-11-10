/*
@Copyright:LintCode
@Author:   shaman
@Problem:  http://www.lintcode.com/problem/merge-two-sorted-arrays
@Language: Java
@Datetime: 16-04-02 15:58
*/

class Solution {
    public int[] mergeSortedArray(int[] A, int[] B) {
        int[] result = new int[A.length + B.length];
        for (int i = 0; i < A.length; i++) {
            result[i] = A[i];
        }
        for (int i = 0; i < B.length; i++) {
            result[i + A.length] = B[i];
        }

        Arrays.sort(result);
        return result;
    }
}