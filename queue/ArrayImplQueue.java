/**
* CircularArray : https://www.youtube.com/watch?v=okr-XE8yTO8
**/
public class ArrayImplQueue{

  private int front = -1;// Elements will be removed from here
  private int rear = -1; // Elements will be added here
  private int MAX_SIZE = 100;
  private int[] data = new int[MAX_SIZE];

  public boolean isEmpty(){
    if(front == -1 && rear == -1){
      return true;
    }
    return false;
  }

  private void Enqueue(int value){
    //If Queue is Full
    if((rear+1)%N ==  front){
      //Overflow
      //Handle throgh exception or increase size dynamically.
    } //If Queue is empty.
    else if(rear == -1 && front == -1){
      front = front +1;
    }
    rear = (rear +1)%N;
    data[rear] = value;
    
  }

  private void Dequeue(){
    //Queue is Empty
    if(rear == -1 && front == -1){
      //Handle excpetion
    }
    //Only one lement in Queue
    if(front == rear){
      front = -1;
      rear = -1;
    }
    front = (front +1)%N;
  }
}
