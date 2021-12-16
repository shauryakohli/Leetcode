class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        prev,curr=None,head
        while curr:
            nxt=curr.next
            curr.next=prev
            prev=curr
            curr=nxt
        return prev
        
