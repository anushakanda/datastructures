/***
* https://www.youtube.com/watch?v=Rezetez59Nk
**/

class DiameterOfTree {
public int diameterOfTree(Node root){
int diameter = 0;
heightOfTree(root,diameter);
return diameter;
}
private int heightOfTree(Node root,int diameter){
 if(root = null){
  return 0;
 }

int leftHeight = heightOfTree(root.left);
int rightHeight =heightofTree(root.right);

diameter = Math.max(diameter,leftHeight+rigthHeight)

return 1+ Math.max(leftHeight,rightHeight)
}
}
