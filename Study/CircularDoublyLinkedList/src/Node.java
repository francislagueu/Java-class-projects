
public class Node {
    private int data;
    private Node next;
    private Node prev;
    
    Node(){
        next = null;
        prev = null;
        data = 0;
    }
    
    Node(int item){
        data = item;
        prev = null;
        next = null;
    }
    
    Node(int item, Node next, Node prev){
        this.data = item;
        this.next = next;
        this.prev = prev;
    }
    
    int getData(){
        return data;
    }
    
    public void setData(int item){
        this.data = item;
    }
    
    public void setNext(Node next){
        this.next = next;
    }
    
    public Node getNext(){
        return next;
    }
    
    public Node getPrev(){
        return prev;
    }
    
    public void setPrev(Node prev){
        this.prev = prev;
    }
}
