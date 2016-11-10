/*
@Copyright:LintCode
@Author:   shaman
@Problem:  http://www.lintcode.com/problem/median
@Language: Java
@Datetime: 16-04-10 15:38
*/

public class Solution {
    /**
     * @param nums: A list of integers.
     * @return: An integer denotes the middle number of the array.
     */
    public int median(int[] nums) {
        Arrays.sort(nums);
        if (nums.length % 2 == 0) {
            return nums[nums.length / 2 - 1];
        }
        return nums[nums.length / 2];
    }
}
