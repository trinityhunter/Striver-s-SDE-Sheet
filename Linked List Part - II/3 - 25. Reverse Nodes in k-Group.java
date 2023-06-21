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

    public static ListNode getReverse(ListNode head){

        ListNode prev = null;

        ListNode curr = head;

        while(curr!=null){
            ListNode og = curr.next;
            curr.next = prev;
            prev = curr;
            curr = og;
        }

        return prev;

    }

    public ListNode reverseKGroup(ListNode head, int k) {
        
        ListNode temp = head;

        ListNode ret = new ListNode(0);

        ListNode ans = ret;

        while(temp!=null){
            ListNode slow = temp;
            ListNode fast = temp;

            int diff = k;

            while(fast!=null && diff>1){
                fast = fast.next;
                diff--;
            }

            if(fast == null){
                ret.next = slow;
                break;
            }

            temp = fast.next;

            fast.next = null;

            ret.next = getReverse(slow);
            
            while(ret.next!=null){
                ret = ret.next;
            }
        }

        return ans.next;

    }

}
