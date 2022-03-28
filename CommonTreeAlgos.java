class CommonTreeAlgos {
  
  public static void PreOrder(Node node){ //depth first search
    if(node == null){
      return;
    }
    System.out.println(node.data);

    PreOrder(node.left);
    PreOrder(node.right);
  }

  public static void InOrder(Node node){ //depth first search
    if(node = null){
      return;
    }
    InOrder(node.left);
    System.out.println(node.data);
    InOrder(node.right);
  }

  public static void PostOrder(Node node){ //depth first search
    if(node == null){
      return;
    }
    PostOrder(node.left);
    PostOrder(node.right);
    System.out.println(node.data);
  }

  public static void levelOrder(Node node){
    if(node == null){
      return;
    }

    LinkedList<Node> queue = new LinkedList();

    while(!queue.isEmpty()){
      Node currentNode = queue.pull();
      System.out.println(currentNode.data);

      if(currentNode.left != null){
        queue.add(currentNode.left);
      }
      if(currentNode.right != null){
        queue.add(currentNode.right);
      }
    }
  }
}