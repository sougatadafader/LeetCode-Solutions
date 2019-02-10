/*208 / 208 test cases passed.
Status: Accepted
Runtime:  7 ms,
Beats other java submission by 72.78% */



/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode next1 = l1;
        ListNode next2 = l2;
        ListNode start = new ListNode(0);
        ListNode result =start;
        
        if((l1!=null) && (l2!=null)){
            while(next1 !=null && next2!=null){ 
                if(next1.val< next2.val){
                    result.next = new ListNode(next1.val);
                    next1 = next1.next;
                }

                else if(next2.val>= next2.val){
                	result.next = new ListNode(next2.val);
                    next2 = next2.next;
                }
                
                result = result.next;
            }
        }

        while(next1!=null)

        {
        	result.next = new ListNode(next1.val);
        	result = result.next;
            next1= next1.next;
        }

        while(next2!=null)
        {
        	result.next = new ListNode(next2.val);
        	result= result.next;
            next2= next2.next;
        }
        
        return start.next;
    }
}
