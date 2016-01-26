
package queuelink;

/**
 *
 * @author Francis
 */
public class QueueLink {

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
     
     private Node front;
     private Node rear;
     
     QueueLink(){
         front = null;
         rear = null;
     }
     
     public boolean isEmpty(){
         return front==null;
     }
     
     public void enqueue(int item){
         Node node = new Node(item);
         if(rear==null)
             front = node;
         else
             rear.next = node;
         rear = node;
     }
     public void dequeue(){
         if(isEmpty())
             return;
         else{
             front = front.next;
             if(front==null)
                 rear = null;
         }
     }
     public void print(){
         Node curr = front;
         while(curr!=null){
             System.out.println(curr.data);
             curr = curr.next;
         }
         
     }
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
         QueueLink q = new QueueLink();
        
        q.enqueue(8);
        q.enqueue(45);
        q.enqueue(12);
        q.enqueue(7);
        q.enqueue(10);
        q.enqueue(9);
        q.enqueue(4);
        q.enqueue(5);
        
        q.print();
        q.dequeue();
        q.print();
        long end = System.currentTimeMillis();
        long total = end-start;
        System.out.println();
        System.out.println("current time to run this program is "+total+" second");
    }
    
}
