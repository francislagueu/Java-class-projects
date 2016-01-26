
public class BinarySearchTree{

   private Node root;
  
   public BinarySearchTree(){
       root = null;
   }
   
   public void insert(int data){
       root = insert(data, root);
   }
   
   private Node insert(int data, Node node){
       if(node == null)
           node = new Node(data);
       else if(data < node.data)
           node.left = insert(data, node.left);
       else if(data > node.data)
           node.right = insert(data, node.right);
       else 
           return null;
       return node;
   }
   
   public void delete(int data){
       root = delete(data, root);
   }
   
   private Node delete(int data, Node node){
       if(node == null)
           return null;
       if(data < node.data)
           node.left = delete(data, node.left);
       else if(data > node.data)
           node.right = delete(data, node.right);
       else if(node.left != null && node.right !=null){
           node.data = findMin(node.right).data;
           node.right = deleteMin(node.right);
       }
       else
           node = (node.left !=null) ? node.left : node.right;
       return node;
   }

   private Node deleteMin(Node node){
       if(node == null)
           return null;
       else if(node.left != null){
           node.left = deleteMin(node.left);
           return node;
       }
       else
           return node.right;
   }
   
   private Node findMin(Node node){
       if(node != null)
           while(node.left != null)
               node = node.left;
       return node;
   }
   
   private Node findMax(Node node){
       if(node != null)
           while(node.right !=null)
               node = node.right;
       return node;
   }
   
   public Node find(int data, Node node){
       while(node!=null){
           if(data < node.data)
               node = node.left;
           else if(data > node.data)
               return node.right;
           else
               return node;
       }
       return null;
   }
   
   public int heightOfTree(Node node){
       if(node == null ||(node.left == null && node.right == null) )
           return 0;
       else{
           int leftChild = heightOfTree(node.left);
           int rightChild = heightOfTree(node.right);
           return 1 + Math.max(leftChild, rightChild);
       }
   }
   
   public int countNode(Node node){
       if(node == null)
           return 0;
       else
           return 1 + countNode(node.left) + countNode(node.right);
   }
   
   public void preOrderPrint(Node node){
       if(node == null)
           return;
       else{
           System.out.println("Node" + node.getData());
           preOrderPrint(node.left);
           preOrderPrint(node.right);
       }
   }
   
    public void postOrderPrint(Node node){
       if(node == null)
           return;
       else{
           preOrderPrint(node.left);
           preOrderPrint(node.right);
           System.out.println("Node" + node.getData());
       }
   }
    
     public void inOrderPrint(Node node){
       if(node == null)
           return;
       else{
           preOrderPrint(node.left);
           System.out.println("Node" + node.getData());
           preOrderPrint(node.right);
       }
   }
}
