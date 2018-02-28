/*
2. Add Two Numbers
Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);  
        ListNode p=l1,q=l2,curr=dummyHead;  
        int carry=0;//进位  
        while(p!=null || q!=null){  
            int x=(p!=null)?p.val:0;  
            int y=(q!=null)?q.val:0;  
            int sum=x+y+carry;  
            carry=sum/10;  
            curr.next=new ListNode(sum%10);  
            curr=curr.next;  
            if(p!=null) p=p.next;  
            if(q!=null) q=q.next;  
        }  
        if(carry>0){  
            curr.next=new ListNode(carry);  
        }  
          
        return dummyHead.next;  
    }
}