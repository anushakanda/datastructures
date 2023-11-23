/**
* Balanced Binary Tree is the one for which every nodes height(left)-height(right)<=1;
* 
**/
public class BalancedBinaryTree {
 public boolean isBalancedTree(Node root){
   return dFS(root)!=-1;
 }

public int dFS(Node root){
  if(root == null){
    return 0;
  }

  int leftHeight = dFS(root.left);
  if(leftHeight == =-1) return -1;
  int rightHeight = dFS(root.right);
  if(rightHeight == =-1) return -1;

  if(Math.abs(leftHeight-rightHeight)>1){
    return -1;
  }

  return 1+ Math.max(leftHeight,rightHeight);
}
}
