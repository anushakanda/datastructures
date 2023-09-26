/**
* https://www.youtube.com/watch?v=oSWTXtMglKE
**/
class Node {
  Node left,right;
  int data;
  Node(int data){
    this.data = data;
  }

  public void insert(int value){
    if(value <= data){
      if(left == null){
        left = new Node(value);
      }else{
        left.insert(value);
      }
    } else {
      if(right == null){
        right =  new Node(value);
      } else {
        right.insert(value);
      }
    }    
  }

  public boolean contains(int value){
    if(value == data){
      return true;
    } else if(value < data){
      if(left == null){
        return false;
      }
      return left.contains(value);
    } else{
      if(right == null){
        return false;
      }
      return right.contains(value);
    }
  }

  // This suits for Balanced Binary search Tree
  public void printInOrderTraversal(){
    if(left!=null){
      left.printInOrderTraversal();
    }
    System.out.println(data);
    if(right!=null){
      right.printInOrderTraversal();
    }
  }

  public void printPreOrderTraversal(){
    System.out.println(data);
    if(left!=null){
      left.printPreOrderTraversal();
    }
    if(right!=null){
      right.printPreOrderTraversal();
    }
  }

   public void printPostOrderTraversal(){
    if(left!=null){
      left.printPreOrderTraversal();
    }
    if(right!=null){
      right.printPreOrderTraversal();
    }
    System.out.println(data);
  }
}
