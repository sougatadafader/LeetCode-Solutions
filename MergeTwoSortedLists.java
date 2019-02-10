/*208 / 208 test cases passed.
Status: Accepted
Runtime:  6 ms,
Beats other java submission by 93.41% */



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
            while(l1 !=null && l2!=null){ 
                if(l1.val< l2.val){
                    result.next = new ListNode(l1.val);
                    l1 = l1.next;
                }

                else if(l2.val>= l2.val){
                	result.next = new ListNode(l2.val);
                    l2 = l2.next;
                }
                
                result = result.next;
            }
        }

        while(l1!=null)

        {
        	result.next = new ListNode(l1.val);
        	result = result.next;
            l1= l1.next;
        }

        while(l2!=null)
        {
        	result.next = new ListNode(l2.val);
        	result= result.next;
            l2= l2.next;
        }
        
        return start.next;
    }
}
