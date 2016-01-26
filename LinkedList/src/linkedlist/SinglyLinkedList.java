
package linkedlist;

public class SinglyLinkedList {
   private Node head;
   
   public SinglyLinkedList(){
       head = null;
   }
   
   public void insert(int item){
       
       Node node = new Node(item);
       Node current;
       
       if(head==null)
           head=node;
       else{
           current = head;
           while(current.next!=null)
               current = current.next;
           current.next = node;
       }
   }
   
   public Node insertRe(int item, Node node){
       if(node == null){

            return new Node(item);
       }else {
            node.next =   insertRe(item, node.next);
            return node;
       }
   }
   public void Insertrecur(int item){
       head = insertRe(item, head);
   }
   
   public int find(int item){
       Node node = head;
       if(node==null)
           System.out.println("The list is empty");
       else if(item==node.data){
           item = node.data;
           System.out.println("This item was found " + item);
           node = node.next;
       }else{
           Node P = head;
           Node Q =head.next;
             while(Q !=null && !(item == Q.data)){
                 P = Q;
                 Q = Q.next;
             }
             if(Q!=null && item==Q.data){
                 item = Q.data;
                 System.out.println("This item was found " + item);
                 Q = Q.next;
             }else{
                 System.out.println("The item you are looking for is not in the list");
             }
       }
        return item;   
   }
   
   public void delete(int item){
       if(head == null)
           System.out.println("The list empty");
       else if(item == head.data)
           head = head.next;
       else{
           Node P = head;
           Node Q = head.next;
           while(Q !=null && !(item == Q.data)){
                 P = Q;
                 Q = Q.next;
             }
           if(Q!=null && item==Q.data)
               P.next = Q.next;
           else
               System.out.println("The item is not in the list");
       }
   }
   public void print(){
       Node P = head;
       while(P!=null){
           System.out.println("" + P.data);
           P = P.next;
       }
   }
}
