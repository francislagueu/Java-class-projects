
package queue;

/**
 *
 * @author Francis
 */
public class Queue {

    private int front;
    private int rear;
    private int MAX;
    private int[] items;
    private int count;
    
    Queue(){
        MAX = 500;
        front = MAX-1;
        rear = MAX-1;
        items = new int[MAX];
        count = 0;
    }
    Queue(int max){
        MAX = max+1;
        front = MAX-1;
        rear = MAX-1;
        items = new int[MAX];
        count = 0;
    }
    
    public boolean isEmpty(){
        return count==0;
    }
    public boolean isFull(){
        return (rear+1)%MAX==front;
    }
    
    public void enqueue(int item){
        if(isFull())
            return;
        else{
            rear = (rear+1)%MAX;
            items[rear]=item;
            count++;
        }
    }
    
    public int dequeue(){
//        //int item=0;
//        if(isEmpty())
//            System.out.print("Empty queue");
//        else{
//            int item = items[front];
//            front = (front+1)%MAX;
//            //item = items[rear];
//            --count;
//        
//      return item;
//        }
//        return 0;
        if(!isEmpty()){
            count--;
            int item = items[front];
            if(front==rear){
                front =-1;
                rear =-1;
            }
            else
                front++;
            return item;
        }
//        if(!isEmpty()){
//            int item = items[front];
//            front=(front+1)%MAX;
//            --count;
//            return item;
//        }
        else{
            System.out.print("empty queue");
            return 0;
        }
    }
    public void print(){
        for(int i=0;i<count;i++)
            System.out.print(items[i]+" ");
    }
    public static void main(String[] args) {
        Queue q = new Queue(8);
        
        q.enqueue(8);
        q.enqueue(45);
        q.enqueue(12);
        q.enqueue(7);
        q.enqueue(10);
        q.enqueue(9);
        q.enqueue(4);
        q.enqueue(5);
        
        q.print();
        
        System.out.println();
        q.dequeue();
        q.print();
    }
    
}
