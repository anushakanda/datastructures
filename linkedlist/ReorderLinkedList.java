/** Given a singly linked list
  *  L: L0 → L1 → … → Ln-1 → Ln,
  * reorder it to: L0 → Ln → L1 → Ln-1 → L2 → Ln-2 → …
  * You must do this in-place without altering the nodes’ values.
  * For example,Given {1,2,3,4}, reorder it to {1,4,2,3}.
/**
**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode reorderList(ListNode A) {
        
        if(A.next == null){
            return A;
        }
        
        //First copy the contents of LinkedList to an arrayList.
        ArrayList<Integer> oldList = new ArrayList<>();
        ListNode current = A;
        while(current != null){
            oldList.add(current.val);
            current = current.next;
        }
        
        //Reorder the list
        ArrayList<Integer> list = new ArrayList<>();
        for(int index = 0;index< oldList.size()/2;index++){
            list.add(oldList.get(index));
            list.add(oldList.get(oldList.size()-1-index));
        }
        if(oldList.size()%2!=0){
            list.add(oldList.get((oldList.size()/2)));
        }
        
        // BUild the newly sorted linkedlist
        ListNode currNode = new ListNode(list.get(0));
        ListNode head = currNode;
        for(int index= 1;index<list.size();index++){
            ListNode nextNode = new ListNode(list.get(index));
            currNode.next = nextNode;
            if(index == 1){
                head = currNode;
            }
            currNode = nextNode;
          }
          
        return head;
    }
}
