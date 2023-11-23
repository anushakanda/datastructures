/**
* https://www.youtube.com/watch?v=eD3tmO66aBA
* Max Depth of tree = 1+ MaxDepth(leftNode,rightNode)
**/
public class DepthOrHeightOfTree{
  public int maxDepth(Node root){
    if(root == null){
      return 0;
    }
    int leftHeight = maxDepth(root.left);
    int rightHeight = maxDepth(root.right);

    return 1+ Math.max(leftHeight,rightHeight);
  }
}
