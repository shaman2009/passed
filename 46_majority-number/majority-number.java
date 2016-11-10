/*
@Copyright:LintCode
@Author:   shaman
@Problem:  http://www.lintcode.com/problem/majority-number
@Language: Java
@Datetime: 16-03-27 16:08
*/

public class Solution {
    public int majorityNumber(final ArrayList<Integer> nums) {
        Object[] objects = nums.toArray();
        Arrays.sort(objects);
        if (objects.length == 1) {
            return (int) objects[0];
        }
        Arrays.sort(objects);
        return (int) objects[objects.length / 2];
    }
}