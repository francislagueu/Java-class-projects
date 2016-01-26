



public class RedBlackTree extends BinarySearchTree {

    class RedBlackNode extends Node{
        int color;
        public RedBlackNode(int data) {
            super(data);
            color = 1;
        }
        public RedBlackNode(int ndata, RedBlackNode lt, RedBlackNode rt){
//            left = lt;
//            right = rt;
//            data = ndata;
            super(ndata, lt, rt);
            color = 1;
        }
    }
    
    private RedBlackNode current;
    private RedBlackNode parent;
    private RedBlackNode grand;
    private RedBlackNode great;
    private RedBlackNode header;
    private static RedBlackNode nullNode ;
    static final int BLACK = 1;
    static final int RED = 0;
    static{
        nullNode = null;
       // nullNode.left = null;
        //nullNode.right = null;
    }
    public RedBlackTree(int data){
        header = new RedBlackNode(data);
        header.left = nullNode;
        header.right = nullNode;
    }
    
    @Override
    public void insert(int item){
        current = parent = grand = header;
        nullNode.data = item;
        while(current.data !=item){
            great =grand;
            grand = parent;
            parent = current;
         current = item < current.data ? (RedBlackNode)current.left : (RedBlackNode)current.right;
         if(((RedBlackNode)current.left).color == RED && ((RedBlackNode)current.right).color == RED)
             changeOrientation(item);
        }
        if(current !=nullNode)
            return;
        current = new RedBlackNode(item, nullNode, nullNode);
        if(item < parent.data)
            parent.left = current;
        else
            parent.right = current;
        changeOrientation(item);
    }
    
     private void changeOrientation(int item) {
         current.color = RED;
        ((RedBlackNode)current.left).color = BLACK;
        ((RedBlackNode)current.right).color = BLACK;
        if(parent.color == RED){
            grand.color = RED;
            if(item < grand.data != item < parent.data)
                parent = (RedBlackNode) rotate(item, grand);
            current = (RedBlackNode) rotate(item, great);
            current.color = BLACK;
            
        }
    }
     private Node rotate(int item, RedBlackNode parent) {
         if(item < parent.data)
             return  parent.left = item < parent.left.data ? rotateLeft(parent.left) : rotateRight(parent.left);
         else
             return parent.right = item < parent.left.data ? rotateLeft(parent.right) : rotateRight(parent.right);
     }
     
     private Node rotateLeft(Node lt) {
       RedBlackNode  node = (RedBlackNode) lt.left;
       lt.left = node.right;
       node.right = lt;
       return node;
     }

    private Node rotateRight(Node rt) {
       RedBlackNode  node = (RedBlackNode) rt.right;
       rt.right = node.left;
       node.left = rt;
       return node;
    }
    public int countNode(){
        return countNode(header.right);
    }
    public Node find(int data){
        return find(data, header.right);
    }
    public boolean isEmpty(){
        return header.right == nullNode;
    }
    
    public void empty(){
        header.right = nullNode;
    }
    
    public void inOrderPrint(){
        inOrderPrint(header.right);
    }
    public void inOrderPrint(RedBlackNode node){
        if(node != null){
            inOrderPrint(node.left);
            char b = 'B';
            if(node.color == 0)
                b = 'R';
            System.out.print(node.data + ""+ b + " ");
            inOrderPrint(node.right);
        }
    }
}
