class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int counter = 0;
        ListNode ret = new ListNode(0);
        ListNode head = ret;
        int add = 0;
        
        while(l1 !=null || l2 != null){
            add=counter;
            
            if(l1 !=null){
                add += l1.val;
                l1 = l1.next;
            }
            
            if(l2 !=null){
                add += l2.val;
                l2 = l2.next;
            } 
   
            if(add >=10){
                ret.next = new ListNode(add%10);
                ret = ret.next;
                counter = 1;
            }
            else{
                ret.next = new ListNode(add);
                ret = ret.next;
                counter = 0;
            }
        }
        
        if(counter ==1){
            ret.next = new ListNode(1);
            ret = ret.next;
        }
        
        return head.next;
    }
}