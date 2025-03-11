/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    /**
     * mergee sort
     * 1- findMiddle
     * 2 - merge
     * 3- sortmerge (sortList)
     */

    public ListNode sortList(ListNode head) {
        //must start with this
        if (head == null || head.next == null)
            return head;


        ListNode mid = findMid(head);
        ListNode leftList = head;
        ListNode rightList = mid.next;

        mid.next = null; // to divide big list into two lists


        leftList = sortList(leftList);
        rightList = sortList(rightList);

        return merge(leftList, rightList);
    }

    public ListNode findMid(ListNode head) {
        ListNode fast = head.next;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode merge(ListNode listOne, ListNode listTwo) {
        ListNode dummyNode = new ListNode();
        ListNode currentNode = dummyNode;

        while (listOne != null && listTwo != null) {

            if (listOne.val < listTwo.val) {
                currentNode.next = listOne;
                listOne = listOne.next;
            } else {
                currentNode.next = listTwo;
                listTwo = listTwo.next;
            }
            currentNode = currentNode.next;
        }
        if (listOne != null) {
            currentNode.next = listOne;
        }
        if (listTwo != null) {
            currentNode.next = listTwo;
        }

        return dummyNode.next; // as the first node = null

    }
}