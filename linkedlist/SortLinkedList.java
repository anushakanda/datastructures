/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode insertionSortList(ListNode A) {
        //First copy the contents of LinkedList to an arrayList.
        ArrayList<Integer> values = new ArrayList<>();
        ListNode current = A;
        while(current != null){
            values.add(current.val);
            current = current.next;
        }

       //sorts the arraylist
        Collections.sort(values);

      // BUild the newly sorted linkedlist
        ListNode currNode = new ListNode(values.get(0));
        ListNode head = currNode;
        for(int index= 1;index<values.size();index++){
            ListNode nextNode = new ListNode(values.get(index));
            currNode.next = nextNode;
            if(index == 1){
                head = currNode;
            }
            currNode = nextNode;
          }
          
        return head;
    }
}
