/*
@Copyright:LintCode
@Author:   shaman
@Problem:  http://www.lintcode.com/problem/cosine-similarity
@Language: Java
@Datetime: 16-02-28 10:18
*/

class Solution {
    /**
     * @param A: An integer array.
     * @param B: An integer array.
     * @return: Cosine similarity.
     */
    public double cosineSimilarity(int[] A, int[] B) {
        long dividend = 0L;
        long divisorA = 0L;
        long divisorB = 0L;
        for (int i = 0, len = A.length; i < len; i++) {
            dividend += (A[i] * B[i]);
            divisorA += (A[i] * A[i]);
            divisorB += (B[i] * B[i]);
        }
        long divisor = divisorA * divisorB;
        if (divisor == 0) {
            return 2.0;
        }
        return ((double) dividend) / (Math.sqrt(divisor));
    }
}
