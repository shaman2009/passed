/*
@Copyright:LintCode
@Author:   shaman
@Problem:  http://www.lintcode.com/problem/remove-linked-list-elements
@Language: Java
@Datetime: 16-01-24 14:35
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode helper = new ListNode(0);
        helper.next = head;
        ListNode point = helper;
        while(point.next != null) {
            if (point.next.val == val) {
                point.next = point.next.next;
            } else {
                point = point.next;
            }
        }
        return helper.next;
    }
}