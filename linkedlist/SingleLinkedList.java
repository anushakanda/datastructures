class Node{
  int data;
  Node next;
  Node(int data){
  this.data = data;
  }
}

class SingleLinkedList{
  Node head;

  public void append(int data){
     if(head == null){
       head = new Node(data);
       return;
      }

    Node cuurent = head;
    while(current.next!=null){
       current = current.next;
    }
    Node newNode = new Node(data);
    current.next = newNode;
  }
  
  public void prepend(int data){
    if(head == null){
      head = new Node(data);
      return;
    }

    Node cuurent = head;
    Node newNode = new Node(data);
    newNode.next = head;
    head = newNode;
  }
  
  public void delete(int data){
    if(head == null){
      return;
    }

   if(head.data == data){
     head = head.next;
     return;
   }

    Node cuurent = head;
    while(current.next!=null){
    if(current.next.data = data){
      current.next = current.next.next;
      return;
      }
     current = current.next;
    }
  }

}
