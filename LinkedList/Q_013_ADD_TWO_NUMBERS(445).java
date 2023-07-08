/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> a = new Stack<Integer>();
        Stack<Integer> b = new Stack<Integer>();
        // ListNode temp1 = li.
        while(l1 != null) {
            a.push(l1.val);
            l1 = l1.next;
        }
        while(l2 != null) {
            b.push(l2.val);
            l2 = l2.next;
        }
        int tot = 0,carry = 0;
        ListNode res = new ListNode();
        while(!a.isEmpty() || !b.isEmpty()) {
            if(!a.empty()) tot += a.pop();
            if(!b.empty()) tot += b.pop();
            res.val = tot%10;
            carry = tot/10;
            ListNode head = new ListNode(carry);
            head.next = res;
            res = head;
            tot = carry;
        }
        return carry == 0 ? res.next : res;
        
    }
    
}