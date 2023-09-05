public class ArrayImplStack {

  private int top = -1;
  private int MAX_SIZE = 100;
  private int[] data = new int[MAX_SIZE];
  
  public boolean isEmpty(){
    return top == -1;
  }

  public int peek(){
    if(i==-1){
      //Stack is empty
    }
    return data[i];
  }

  public void push(int data){
    if(i+1 == MAX_SIZE){
      //Overflow
      //Throw exception or
      //Dynamic array.Double the size of array.Copy the elements from old to new array.
    }
    i = i+1;
    data[i] = data;
  }

  public int pop(){
    if(i==-1){
      //Stack is empty.
    }
    int value = data[i];
    top = top-1;
    return value;
  }

}
