
package redblacktree;

/**
 *
 * @author Francis
 */
public class RedBlackTree<Key extends Comparable<Key>, Object> {
    
    private static final boolean RED = true;
    private static final boolean BLACK = false;
    
    private Node root;//root of the tree
    
    private class Node {
        private Key key; //this is a key
        private Object data; //this is the associated data of the tree
        private Node left, right;//links to the left and right of the subtrees
        private boolean color;//color of the parent link
        private int count;//count subtrees
        public Node(Key key, Object data, boolean color, int count) {
            this.key = key;
            this.data = data;
            this.color = color;
            this.count = count;
        }
    }
    
    public RedBlackTree(){
        
    }
    //return true if the node is red otherwise return false;
    private boolean isRed(Node node){
        if(node == null)
            return false;
        return node.color == RED;
    }
    //return the number of node in the subtree
    private int size(Node node){
        if(node == null)
            return 0;
        return node.count;
    }
    //return true if the tree is empty
    public boolean isEmpty(){
        return root == null;
    }
    
    //this method return the item associated with the given key
    public Object get(Key key){
        return get(root, key);
    }
   //return the item associated with the given key in the subtree rooted at the 
    //node return null if not found
    private Object get(Node node, Key key) {
        
        while(node != null){
            int result = key.compareTo(node.key);
            if(result < 0)
                node = node.left;
            else if(result>0)
                node = node.right;
            else
                return node.data;
        }
        return null;
    }
    
    //return true if the tree contain the key 
    public boolean find(Key key){
        return get(key)!= null;
    }
    //insert the key-item pair into the tree, overwrite the old item with the 
    //new item if thte key is already in the tree. if the item is null, this 
    //delete the key from the tree
    public void insert(Key key, Object data){
        root = insert(root, key, data);
        root.color = BLACK;
    }
    
     private Node insert(Node node, Key key, Object data) {
     
        if(node == null)
            return new Node(key, data, RED, 1);
        int result = key.compareTo(node.key);
        if(result < 0)
            node.left = insert(node.left, key, data);
        else if (result > 0)
            node.right = insert(node.right, key, data);
        else
            node.data = data;
        //rearrange the color in the tree
        if(isRed(node.right) && !isRed(node.left))
            node = rotateLeft(node);
        if(isRed(node.left) && isRed(node.left.left))
            node = rotateRight(node);
        if(isRed(node.left) && isRed(node.right))
            switchColors(node);
        node.count = size(node.left) + size(node.right) +1;
        return node;   
     }

     //make the right link rotate to the left
     private Node rotateLeft(Node node) {
        Node curr = node.right;
        node.right = curr.left;
        curr.left = node;
        curr.color = curr.left.color;
        curr.left.color = RED;
        curr.count = node.count;
        node.count = size(node.left) + size(node.right) +1;
        return curr;
    }

     //make the left link rotate to the right
    private Node rotateRight(Node node) {
        
        Node curr = node.left;
        node.left = curr.right;
        curr.right = node;
        curr.color = curr.right.color;
        curr.right.color = RED;
        curr.count = node.count;
        node.count = size(node.left) + size(node.right) + 1;
        return curr;
   }

    //switch the color of the node and its two children
    private void switchColors(Node node) {
      node.color = ! node.color;
      node.left.color = !node.left.color;
      node.right.color = ! node.right.color;
   }
    
    public static void main(String[] args) {
        
    }

   
    
}
