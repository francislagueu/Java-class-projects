
package doublylinkedlist;

/**
 *
 * @author Francis
 */
public class DoublyLinkedList {

   public class Node{
        int data;
        Node next, prev;
        
        Node(){
            data = 0;
            next= prev = null;
        }
        
        Node(int item){
            data = item;
            next = prev = null;
        }
    }
    private Node head;
    
    DoublyLinkedList(){
        head = null;
    }
    
    public void insert(int item){
        Node node = new Node(item);
        if(head==null)
            head = node;
        else{
            Node curr = head;
            while(curr.next!=null)
                curr = curr.next;
            curr.next = node;
        }
    }
    
    public void delete(int item){
        if(head==null)
            return;
        else if(item==head.data)
            head = head.next;
        else{
            Node curr = head;
            while(curr.next!=null&&item!=curr.next.data)
                curr = curr.next;
            if(item==curr.next.data)
                curr.next = curr.next.next;
        }
    }
    
    public int find(int item){
        Node curr = head;
        while(curr!=null&&item!=curr.data)
            curr = curr.next;
        if(item==curr.data)
            return curr.data;
        else
            return -1;
       
    }
    
    public void print(){
        Node curr = head;
        while(curr!=null){
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
