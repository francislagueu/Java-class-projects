
package list;

/**
 *
 * @author Francis
 */
public class Node {
    //create a node to hold the information to insert in the list
    String word;
    Node next;
    //constructor node
    Node(String item){
        this.word = item;
        this.next = null;
    }
    
}
