/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode n1 = head;
        ListNode n2 = head;
        while(n2!=null && n2.next!= null) {
            n1 = n1.next;
            n2 = n2.next.next;
            if(n1 == n2) return true;
        }
        return false;
    }
}