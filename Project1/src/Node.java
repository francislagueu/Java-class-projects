
/**
 *
 * @author Francis
 */
public class Node {
    protected Node left, right, parent;
    protected int data;
    
    public Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
        this.parent = null;
    }
    public Node(int ndata, Node lt, Node rt){
        data=ndata;
        left = lt;
        right = rt;
    }
    public int getData(){
        return data;
    }
    public void setData(int ndata){
        data = ndata;
    }
    
}
