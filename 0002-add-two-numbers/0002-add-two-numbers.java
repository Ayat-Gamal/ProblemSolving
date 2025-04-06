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
        /**
        traverse ech list and sum with care of carry and put each new value of summation in the dummyList and return the next of this dummy
         */


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyNode = new ListNode(-1);
        ListNode current = dummyNode;
        ListNode temp1 =l1;
        ListNode temp2 =l2;
        int carry = 0;

        while(temp1 != null || temp2 != null){
            int sum = carry;
            if(temp1!= null) sum += temp1.val;
            if(temp2!= null) sum += temp2.val;

            ListNode newNode = new ListNode(sum % 10);
            carry  = sum /10;    

            current.next = newNode;
            current = current.next;

            if(temp1!= null) temp1= temp1.next;
            if(temp2!= null) temp2= temp2.next;
        }

        if(carry >0){
            ListNode newNode = new ListNode(carry);
            current.next = newNode;

        }
return dummyNode.next;
    }
}