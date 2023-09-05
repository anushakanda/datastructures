/**
* Queue: FIFO
* https://www.youtube.com/watch?v=wjI1WNcIntg
/**
public class LinkedListImplQueue {

public sttaic class Node {
   int data;
   Node next;
  Node(int data){
    this.data = data;
    this.next = null;
  }
}
private Node head; //Remove elements from here.
private Node tail; //Add elements from here.

  public boolean isEmpty(){
    return head == null;
  }

  public int peek(){
    if(head == null){
      //Queue is Empty
    }

    return head.data;
  }
  
  public void add(int data){
    Node newNode = Node(data);
    if(tail != null){
      tail.next = newNode;
    }
    tail = newNode;
    if(head == null){
      tail = newNode;
    }
  }

  public int remove(){
    if(head == null){
      // Queue is Empty.
    }
    int value = head.data;
    head = head.next;
     if(head == null){
     tail == null;
    }
    return value;
  }
  

}
