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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        while(headA!= null){
            ListNode curr = headB;
            while(curr!=null){
                if(curr == headA){
                    return headA;
                }
                else{
                    curr = curr.next;
                }
            }
            headA = headA.next;
        }
        
        return null;
    }
}