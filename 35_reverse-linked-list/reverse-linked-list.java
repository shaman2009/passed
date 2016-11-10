/*
@Copyright:LintCode
@Author:   shaman
@Problem:  http://www.lintcode.com/problem/reverse-linked-list
@Language: Java
@Datetime: 16-02-06 06:40
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
    /**
     * @param head: The head of linked list.
     * @return: The new head of reversed linked list.
     */
    public ListNode reverse(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode dummy = new ListNode(-1);
        ListNode pCur = head.next;
        dummy.next = head;
        while (pCur != null) {
            head.next = pCur.next;
            pCur.next = dummy.next;
            dummy.next = pCur;
            pCur = head.next;
        }
        return dummy.next;
    }
}

