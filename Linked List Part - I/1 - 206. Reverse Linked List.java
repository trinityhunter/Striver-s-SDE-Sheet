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

    public static ListNode helper(ListNode head){

        if(head == null || head.next == null){
            return head;
        }

        ListNode temp = helper(head.next);

        head.next.next = head;

        head.next = null;

        return temp;

    }

    public ListNode reverseList(ListNode head) {

        // ***** Iterative Pointer ***** - 

        // ListNode prev = null;

        // ListNode curr = head;

        // while(curr!=null){

        //     ListNode og = curr.next;

        //     curr.next = prev;

        //     prev = curr;

        //     curr = og;

        // }

        // return prev;

        // ***** Recursive Pointer ***** - 

        return helper(head);

    }

}
