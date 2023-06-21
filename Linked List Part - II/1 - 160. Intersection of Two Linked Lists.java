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

    public static int getSize(ListNode node){

        if(node == null){
            return 0;
        }

        int size = 0;

        ListNode temp = node;

        while(temp!=null){
            size++;
            temp = temp.next;
        }

        return size;

    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode tempA = headA;

        ListNode tempB = headB;

        int sizeA = getSize(headA);

        int sizeB = getSize(headB);

        if(sizeA > sizeB){
            int diff = sizeA - sizeB;

            while(diff>0){
                tempA = tempA.next;
                diff--;
            }
        }
        else{
            int diff = sizeB - sizeA;

            while(diff>0){
                tempB = tempB.next;
                diff--;
            }
        }

        while(tempA!=null && tempB!=null && tempA!=tempB){
            tempA = tempA.next;
            tempB = tempB.next;
        }
        
        if(tempA!=null && tempB!=null){
            return tempA;
        }

        return null;

    }

}
