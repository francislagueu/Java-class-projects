
public class LinkedList {
    private Node head;
    
    public int getSize(){
        int count = 0;
        if(head==null)
            return count;
        else{
            Node temp = head;
            do{
                temp = temp.getNext();
                count++;
            }while(temp!=head);
        }
        return count;
    }
    
    public void traverse(){
        if(head==null){
            System.out.println("List is empty!");
        }else{
            Node temp = head;
            do{
                System.out.println(temp.getData());
                temp = temp.getNext();
            }while(temp!=head);
        }
    }
    
    public void insertBegin(int data){
        Node node = new Node(data);
        if(head==null){
            node.setNext(node);
            node.setPrev(node);
            head=node;
        }else{
            Node temp = head.getPrev();
            temp.setNext(node);
            node.setPrev(temp);
            node.setNext(head);
            head.setPrev(node);
            head = node;
        }
    }
    
    public void insertEnd(int data){
        Node node = new Node(data);
        if(head==null){
            node.setNext(node);
            node.setPrev(node);
            head = node;
        }else{
            Node temp = head.getPrev();
            temp.setNext(node);
            node.setNext(head);
            head.setPrev(node);
            node.setPrev(temp);
        }
    }
    
    public void insertPosition(int data, int position){
        if(position < 0||position==0)
            insertBegin(data);
        else if(position>getSize()||position==getSize())
            insertEnd(data);
        else{
            Node temp = head;
            Node node = new Node(data);
            for(int i=0; i<position; i++)
                temp = temp.getNext();
            node.setNext(temp.getNext());
            temp.getNext().setPrev(node);
            temp.setNext(node);
            node.setPrev(temp);
        }
            
    }
    
    private void delete(Node node){
        if(node.getPrev()==node||node.getNext()==node)
            head=null;
        else{
            Node temp = node.getPrev();
            temp.setNext(node.getNext());
            node.getNext().setPrev(temp);
        }
        node=null;
    }
    
    public void deleteBegin(){
        if(head==null)
            return;
        else{
            Node temp = head.getNext();
            head.getPrev().setNext(temp);
            temp.setPrev(head.getNext());
            head = temp;
        }
    }
    
    public void deleteEnd(){
        if(head==null)
            return;
        else{
            Node temp = head.getPrev();
            temp.getPrev().setNext(head);
            head.setPrev(temp.getNext());
            temp= null;
        }
    }
    
    public int deletePosition(int position){
        int data;
        if(position==0){
            data = head.getData();
            deleteBegin();
        }else if(position == getSize()-1){
            data = head.getPrev().getData();
            deleteEnd();
        }else{
            Node temp = head;
            for(int i=0; i< position; i++)
                temp = temp.getNext();
            data = temp.getData();
            Node node = temp.getNext();
            node.setPrev(temp.getNext());
            temp.getNext().setNext(node);
            temp= null;
        }
        return data;
    }
}
