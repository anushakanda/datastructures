/**
* https://www.youtube.com/watch?v=zaBhtODEL0w
**/
public class Graph{
  private HashMap<Integer, Node> nodeLookUp = new HashMap<>();

  public sttaic class Node(){
    private int id;
    LinkedList<Node> adjacent = new LinkedList<>();
    private Node(int id){
      this.id = id;
      }
  }

  private Node getNode(int id){
    return nodeLookUp.get(id)
  }

  private void addEdge(int sourceId,int destinationId){
    Node source = getNode(soureId);
    Node destination = getNode(destinationId);

    source.adjacent.add(destination);
  }

public boolean hasPathDFS(int source,int destination){
  Node s = getNode(source);
  Node d = getNode(destination);
  HashSet<Integer> visitedMap = new HashSet<>();
}

private boolean hasPathDFS(Node source,Node destination,HashSet<Integer> visitedMap){
  if(visitedMap.contains(source.id)){
    return false;
  }
  visitedMap.add(source.id);

  if(source.id = destination.id){
    return true;
  }else{
    for(Node node: source.adjacent){
       if(hasPathDFS(node,destination,visitedMap)){
         return true;
       }
    }
  }
  return false;
}

public boolean hasPathBFS(int source, int destination){
  Node s = getNode(source);
  Node d = getNode(destination);
  HashSet<Integer> visitedMap = new HashSet<>();}
}

private boolean hasPathBFS(Node source, Node destination, HashSet<Integer> visitedMap){
     // To maintain Insertion Order.
     LinkedList<Nodes> nextToVisit = new LinkedList<>();
     nextToVisit.add(source);

    while(!nextToVisit.isEmpty()){
      Node node = nextToVisit.remove();
      if(visitedMap.contains(node.id)){
        continue;
       }

      visitedMap.add(node.id);
      
      if(node.id = destination.id){
        return true;
      }
      
      for(Node child: node.adjacent){
          nextToVisit.add(child);
    }  
   }
  return false;
}
  
}
