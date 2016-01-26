
public class BinarySearchTree {
    public Node root;
    
  BinarySearchTree(){
      root = null;
  }
  
  public boolean insert(int data){
      if(root == null){
          root = new Node(data);
          return true;
      }else
          return root.insert(data);
  }
  
  public boolean find(int data){
      if(root == null)
          return false;
      else
          return root.find(data);
  }
  
  public int findMin(){
      if(root==null)
          return 0;
      Node temp = root;
      while(temp.left!=null)
          temp = temp.left;
      return temp.data;
  }
  
   public int findMax(){
      if(root==null)
          return 0;
      Node temp = root;
      while(temp.right!=null)
          temp = temp.right;
      return temp.data;
  }
  
  public boolean delete(int data){
      if(root == null)
          return false;
      else{
          if(root.data == data){
              Node node = new Node(0);
              node.left = root;
              boolean res = root.delete(data, node);
              root = node.left;
              return res;
          }
          else
              return root.delete(data, null);
      }
  }
  
  public void print(){
      root.print(root);
  }
}
