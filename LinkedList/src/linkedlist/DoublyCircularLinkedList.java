
package linkedlist;


public class DoublyCircularLinkedList {
    private Dnode head;
    private Dnode tail;
    
    public DoublyCircularLinkedList(){
        head = null;
        tail = null;
    }
    public class Dnode extends Node{
        Node prev;
        
        public Dnode(int item){
            super(item);
            prev = null;
        }
}
    public void insert(int item){
        Dnode node = new Dnode(item);
        if(head == null)
            tail = node;
        
    }
    
//    public void delete(int item){
//        if()
//    }
}
