/*
27 / 27 test cases passed.
Status: Accepted
Runtime: 10 ms
*/

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class ReverseLinkedList   {
public:
    ListNode* h=NULL;
    
    ListNode* reverseList(ListNode* head) {
        h= head;

        reverseList2(h);
        return h;
    }
    void reverseList2(ListNode* p)
    {
        if(p==NULL || p->next==NULL)
        {
            
            h=p;
            return;
        }
        reverseList2(p->next);
        ListNode* q;
        q=p->next;
        q->next=p;
        p->next=NULL;
    }
};