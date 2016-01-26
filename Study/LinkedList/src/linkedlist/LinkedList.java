
package linkedlist;

/**
 *
 * @author Francis
 */
public class LinkedList {

    public class Node{
        int data;
        Node next;
        
        Node(){
            data = 0;
            next = null;
        }
        
        Node(int item){
            data = item;
            next = null;
        }
    }
    
    private Node head;
    
    LinkedList(){
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
        
        LinkedList lt = new LinkedList();
        
        lt.insert(34);
        lt.insert(12);
        lt.insert(7);
        lt.insert(29);
        lt.insert(28);
        lt.insert(4);
        lt.insert(6);
        
        lt.print();
        System.out.println();
        lt.delete(7);
        lt.print();
        System.out.println();
        lt.delete(4);
        lt.print();
        
        System.out.println();
        System.out.println(lt.find(29));
                
    }
    
}
