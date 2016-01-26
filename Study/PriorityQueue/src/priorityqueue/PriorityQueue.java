
package priorityqueue;

/**
 *
 * @author Francis
 */
public class PriorityQueue {
    
    private class Heap{
        private int data;
        private int[] items;
        
        public void ReheapUp(int root, int bottom){
            int parent;
            if(bottom>root){
                parent = (bottom-1)/2;
                if(items[parent]<items[bottom]){
                    Swap(items[parent], items[bottom]);
                    ReheapUp(root, parent);
                }
            }
        }
        
        public void ReheapDown(int root, int bottom){
            int maxChild;
            int rightChild;
            int leftChild;
            leftChild = root*2+1;
            rightChild = root*2+2;
            if(leftChild<=bottom){
                if(leftChild==bottom)
                    maxChild = leftChild;
                else{
                    if(items[leftChild] <= items[rightChild])
                        maxChild = rightChild;
                    else
                        maxChild = leftChild;
                }
                if(items[root]<items[maxChild]){
                    Swap(items[root], items[maxChild]);
                    ReheapDown(maxChild, bottom);
                }
            }
        }
        
        public void Swap(int arr, int data){
           int temp = arr;
           arr = data;
           data = temp;
        }
    }
    
    private int size;
    private Heap item;
    private int MAX;
    
    PriorityQueue(int max){
        MAX = max;
        item.items = new int[MAX];
        size = 0;
    }
    
    public boolean isEmpty(){
        return size==0;
    }
    public boolean isFull(){
        return size == MAX;
    }
    
    public void dequeue(int data){
        if(isEmpty())
            return;
        else{
            data = item.items[0];
            item.items[0] = item.items[size-1];
            size--;
            item.ReheapDown(0, size-1);
        }
    }
    
    public void enqueue(int data){
        if(isFull())
            return;
        else{
            size++;
            item.items[size-1] = data;
            item.ReheapUp(0, size-1);
        }
    }
    
    public void print(){
        for(int i = 0; i< size; i++){
            System.out.println(item.items[i]);
        }
    }
    
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue(8);
        pq.enqueue(87);
        pq.enqueue(9);
        pq.enqueue(5);
        pq.enqueue(12);
        pq.enqueue(98);
        pq.enqueue(17);
        pq.enqueue(36);
        pq.enqueue(109);
        
        pq.print();
    }
    
}
