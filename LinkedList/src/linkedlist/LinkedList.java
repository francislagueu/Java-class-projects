
package linkedlist;

public class LinkedList {

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.print();
        list.delete(5);
        list.insert(52);
        list.insert(2);
        list.insert(5);
        list.insert(20);
        list.insert(96);
        list.insert(100);
        
        list.print();
        list.find(96);
        list.find(52);
        list.find(300);
        list.delete(20);
        list.print();
        list.delete(100);
        list.print();
        
        list.Insertrecur(45);
        list.Insertrecur(25);
        list.Insertrecur(34);
        list.print();
    }
    
}
