/**
* Reverse a linked list. Do it in-place and in one-pass.
*For example:
*
*Given 1->2->3->4->5->NULL,
*
* return 5->4->3->2->1->NULL.
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode A) {
        ListNode prev = null;
        ListNode curr = A;
        ListNode next = null;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        return prev;   
    }
}

//Following are the steps to be followed to reverse a LinkedList. Create 3 instances: current, next, previous. Loop the following till current is NOT null:

//Save the next Node of the current element in the next pointer.
//Set the next of the current Node to the previous. This is the MVP line.
//Shift previous to current.
//Shift the current element to next.
public class ReverseSingleLinkedList{
    public Node reverse(Node head){\
        if(head == null || head.next == null) return;

        Node prev = null;
        Node current = head;
        Node next = null;
        while(current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
