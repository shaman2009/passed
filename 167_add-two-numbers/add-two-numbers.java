/*
@Copyright:LintCode
@Author:   shaman
@Problem:  http://www.lintcode.com/problem/add-two-numbers
@Language: Java
@Datetime: 16-01-30 13:02
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;      
 *     }
 * }
 */
public class Solution {
    public ListNode addLists(ListNode l1, ListNode l2) {
        ListNode point = new ListNode(0);
        ListNode head = point;

        while (l1 != null || l2 != null) {
            int val = getVal(l1) + getVal(l2) + getVal(point);
            point.val = val % 10;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
            if (val > 9) {
                point.next = new ListNode(1);
            } else if (l1 != null || l2 != null) {
                point.next = new ListNode(0);
            }
            point = point.next;
        }

        return head;
    }

    private int getVal(ListNode node) {
        return node == null ? 0 : node.val;
    }
}