/*
@Copyright:LintCode
@Author:   shaman
@Problem:  http://www.lintcode.com/problem/insertion-sort-list
@Language: Java
@Datetime: 16-03-27 14:48
*/

/**
 * Definition for ListNode.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int val) {
 *         this.val = val;
 *         this.next = null;
 *     }
 * }
 */ 
public class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(-1);
        while (head != null) {
            ListNode cur = dummy;
            while (cur.next != null && cur.next.val < head.val)
                cur = cur.next;
            ListNode tmp = head.next;
            head.next = cur.next;
            cur.next = head;
            head = tmp;
        }
        return dummy.next;
    }
}