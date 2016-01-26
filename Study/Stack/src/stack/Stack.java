
package stack;

/**
 *
 * @author Francis
 */
public class Stack {

    private int top;
    private int[] items;
    private int max;
    
    public Stack(){
        top = -1;
        max = 500;
        items = new int[max];
    }
    
    public Stack(int max){
        top=-1;
        this.max=max;
        items = new int[max];
    }
    
    public boolean isEmpty(){
        return top==-1;
    }
    public boolean isFull(){
        return top==max-1;
    }
    public void push(int item){
        if(isFull())
            return;
        top++;
        items[top]=item;
    }
    public void pop(){
        if(isEmpty())
            return;
        top--;
    }
    
    public int top(){
        if(isEmpty())
            return -1;
        return items[top];
    }
    
    public void print(){
        for(int i=0; i<top+1; i++)
            System.out.println(items[i]);
    }
            
    public static void main(String[] args) {
        Stack s = new Stack(9);
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
