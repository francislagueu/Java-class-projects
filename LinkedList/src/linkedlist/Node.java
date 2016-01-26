
package linkedlist;

public class Node {
    int data;
    Node next;
    
    public Node(){
        data = 0;
        next = null;
    }
    
    public Node(int item){
        data = item;
        next = null;
    }
    
    public Node(int item, Node node){
        data = item;
        next = node;
    }
}
