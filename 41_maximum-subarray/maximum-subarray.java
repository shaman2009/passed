/*
@Copyright:LintCode
@Author:   shaman
@Problem:  http://www.lintcode.com/problem/maximum-subarray
@Language: Java
@Datetime: 16-03-20 03:56
*/

public class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int tmp = 0;
        for (int num : nums) {
            tmp = Math.max(num, num + tmp);
            max = Math.max(tmp, max);
        }
        return max;
    }
}