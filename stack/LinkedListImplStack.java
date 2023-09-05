public class LinkedListImplStack {
  private static class Node{
    int data;
    Node next;
    Node(int data){
      this.data = data;
      this.next = null;
    }
  }

  private Node top;

  public boolean isEmpty(){
    return top == null
  }

  public int peek(){
    if(top == null){
      //stack is empty.
    }
    return top.data
  }

  public void push(int data){
    Node newNode = new Node(data);
    newNode.next = top;
    top = newNode;
  }

  public int pop(){
    if(top == null){
      // Stack is empty
    }
    top = top.next;
    return top.data;
  }
  
}
