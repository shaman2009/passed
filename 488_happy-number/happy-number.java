/*
@Copyright:LintCode
@Author:   shaman
@Problem:  http://www.lintcode.com/problem/happy-number
@Language: Java
@Datetime: 16-03-06 10:09
*/

public class Solution {
    public boolean isHappy(int n) {
        return helper(n, new ArrayList<Integer>());
    }

    private boolean helper(int n, List<Integer> numbers) {
        if (n == 1)
            return true;
        else if (numbers.contains(n))
            return false;
        else {
            numbers.add(n);
            return helper(calculate(n), numbers);
        }
    }

    private int calculate(int n) {
        int num = 0;
        while (n >= 10) {
            num += (n % 10) * (n % 10);
            n = n / 10;
        }
        num += n * n;
        return num;
    }
}