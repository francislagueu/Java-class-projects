
package list;

/**
 *
 * @author Francis
 */
public class List {

    //node which is the head of the list
   public Node head;
   //list constructor
   List(){
       head = null;
   }
   
   public void insert(Node newNode){
       if(head == null){//if the list is empty set the new node to be the head
                        // of the list
           head = new Node(newNode.word);
           head.next = null;
       }
       else if(newNode == head)//if the new node match the node at the head of  
           return;              //the list return
       else{//create a new node and push at the head of the list
           Node node = new Node(newNode.word);
           node.next = head;
           head = node;
       }
   }
  
   public void delete(String word){
       if(head == null)//if the list is empty return
           return;
       else if(word.equals(head.word)){
           Node node = head;//if the node to delete match the node at head of 
           head = head.next;//of the list,create a new node set it equal to the
           node = null;     //head and set the head equal to the next node
       }else{//else we traverse through the list to find the matching node 
           Node P = head;   //to delete
           Node Q = head.next;
           while(Q!=null&&!(word.equals(Q.word))){
               P = Q;
               Q = Q.next;
           }
           if(Q!=null&&word.equals(Q.word)){//delete the node that match the 
               P.next = Q.next;             //word
           }else{
               return;
           }
       }
   }
   
   public Node find(String word){
       if(head==null)//if the list is empty return null
           return null;
       else if(word.equals(head.word)){//if the word match the word in the head
           word = head.word;            //of the list print it on the screen
           head = head.next;
           System.out.println(word);
           return head;
       }else{//else traverse through the list to find the matching node and 
            Node P = head;  //print it on the screen
           Node Q = head.next;
           while(Q!=null&&!(word.equals(Q.word))){
               P = Q;
               Q = Q.next;
           }
           if(Q!=null&&word.equals(Q.word)){
               word = Q.word;
               Q = Q.next;
               System.out.println(word);
               return Q;
           }
           else{
               System.out.println("The word "+ word+" is not in the list");
               return null;
           }
       }
   }
   public void print(){//print the entire list on the screen
       Node P = head ;
       while(P!=null){
           System.out.println(""+P.word);
           P = P.next;
       }
   }
    public static void main(String[] args) {
        // TODO code application logic here
        List list = new List();
        
//        list.insert("Francis");
//        list.insert("Raoul");
//        list.insert("Vickye");
//        list.insert("Guy");
//        list.insert("Rosine");
//        list.insert("Camille");
//        list.insert("Eleonore");
//        list.insert("William");
//        list.insert("Ryan");
//        list.insert("Kellian")
        Node A = new Node("Alain");
        Node B = new Node("Berthe");
        Node C = new Node("Camille");
        Node D = new Node("Daniel");
        Node E = new Node("Eleonore");
        Node F = new Node("Francis");
        Node G = new Node("Gael");
        Node H = new Node("Henry");
        Node I = new Node("Irvin");
        Node J = new Node("Joel");
        Node K = new Node("Kevin");
        Node L = new Node("Laurel");
        Node M = new Node("Marie");
        Node N = new Node("Nathan");
        Node O = new Node("Omer");
        Node P = new Node("Pauline");
        Node Q = new Node("Quentin");
        Node R = new Node("Rosine");
        Node S = new Node("Solange");
        Node T = new Node("Thierry");
        Node U = new Node("Ulrich");
        Node V = new Node("Veron");
        Node W = new Node("William");
        Node X = new Node("Xavier");
        Node Y = new Node("Yann");
        Node Z = new Node("Zagor");
        
//        list.insert(A);
//        list.insert(B);
//        list.insert(C);
//        list.insert(D);
//        list.insert(E);
//        list.insert(F);
//        list.insert(G);
//        list.insert(H);
//        list.insert(I);
//        list.insert(J);
//        list.insert(K);
//        list.insert(L);
//        list.insert(M);
//        list.insert(N);
//        list.insert(O);
//        list.insert(P);
//        list.insert(Q);
//        list.insert(R);
//        list.insert(S);
//        list.insert(T);
//        list.insert(U);
//        list.insert(V);
//        list.insert(W);
//        list.insert(X);
//        list.insert(Y);
//        list.insert(Z);
//      
//        list.print();
//        
        Hash hash = new Hash(15);
        
//        hash.insert("Paul");
//        hash.insert("Francis");
//        hash.insert("Raoul");
//        hash.insert("Vickye");
//        hash.insert("Guy");
//        hash.insert("Rosine");
//        hash.insert("Camille");
//        hash.insert("Eleonore");
//        hash.insert("William");
//        hash.insert("Ryan");
//        hash.insert("Gael");
//        hash.insert("Henry");
//        hash.insert("Irene");
//        hash.insert("Mala");
//        hash.insert("Vilma");
//        hash.insert("Wilna");
//        hash.insert("Adrian");
//        hash.insert("Severin");
//        hash.insert("Denis");
//        hash.insert("Carlos");
//        hash.insert("Daniel");
//        hash.insert("Elvis");
        
        hash.insert(A);
        hash.insert(B);
        hash.insert(C);
        hash.insert(D);
        hash.insert(E);
        hash.insert(F);
        hash.insert(G);
        hash.insert(H);
        hash.insert(I);
        hash.insert(J);
        hash.insert(K);
        hash.insert(L);
        hash.insert(M);
        hash.insert(N);
        hash.insert(O);
        hash.insert(P);
        hash.insert(Q);
        hash.insert(R);
        hash.insert(S);
        hash.insert(T);
        hash.insert(U);
        hash.insert(V);
        hash.insert(W);
        hash.insert(X);
        hash.insert(Y);
        hash.insert(Z);
      
        hash.print();
        
//        hash.find("Francis");
//        hash.find("Veron");
//        hash.find("Robert");
//        hash.find("Pauline");
        
        hash.delete(A);
        hash.print();
        
        
    }
    
}
