
package stacklink;

/**
 *
 * @author Francis
 */
public class StackLink {
    private Node head;
    
    StackLink(){
        head = null;
    }
    public class Node{
        int data;
        Node next;
        
        Node(){
            data = 0;
            next = null;
        }
        
        Node(int item){
            data =item;
            next = null;
        }
    }
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public void push(int item){
        Node node = new Node(item);
        if(isEmpty())
            head = node;
        else{
            node.next = head;
            head = node;
        } 
    }
    
    public void pop(){
        if(isEmpty())
            return;
        else{
            head = head.next;
        }
    }
    
    public int top(){
        if(isEmpty())
            return -1;
        else
            return head.data;
    }
    
    public void print(){
        Node curr = head;
        while(curr!=null){
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
    public static void main(String[] args) {
          StackLink s = new StackLink();
         int num;
        s.push(5);
        s.push(3);
        s.push(8);
        s.push(2);
        s.push(10);
        s.push(24);
        s.push(76);
        s.push(9);
        num = s.top();
        System.out.println(num);
        System.out.println();
        s.print();
        System.out.println();
        s.pop();
        s.print();
        num = s.top();
        System.out.println();
        System.out.println(num);
        System.out.println();
        s.pop();
        s.print();
        num = s.top();
       System.out.println();
        System.out.println(num);
    }
    
}
