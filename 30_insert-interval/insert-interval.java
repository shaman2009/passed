/*
@Copyright:LintCode
@Author:   shaman
@Problem:  http://www.lintcode.com/problem/insert-interval
@Language: Java
@Datetime: 16-03-13 04:59
*/

/**
 * Definition of Interval:
 * public classs Interval {
 *     int start, end;
 *     Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 */
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

class Solution {
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        if (newInterval == null) {
            return intervals;
        }

        ArrayList<Interval> results = new ArrayList<>();
        int insertPos = 0;

        for (Interval interval : intervals) {
            if (interval.end < newInterval.start) {
                results.add(interval);
                insertPos++;
            } else if (interval.start > newInterval.end) {
                results.add(interval);
            } else {
                newInterval.start = Math.min(interval.start, newInterval.start);
                newInterval.end = Math.max(interval.end, newInterval.end);
            }
        }

        results.add(insertPos, newInterval);

        return results;
    }
}