
public class Node {
    
    int data;
    Node left, right;
    
    Node(int item){
        this.data = item;
        left = null;
        right = null;
    }
    
    public boolean insert(int data){
        if(data == this.data)
            return false;
        else if(data < this.data){
            if(left == null){
                left = new Node(data);
                return true;
            }
            else
                return left.insert(data);
        } else  if(data > this.data){
            if(right == null){
                right = new Node(data);
                return true;
            }else 
                return right.insert(data);
        }
        return false;
    }
    
    public boolean find(int data){
        if(data == this.data)
            return true;
        else if(data < this.data){
            if(left == null)
                return false;
            else
                return left.find(data);
        }else if(data > this.data){
            if(right == null)
                return false;
            else
                return right.find(data);
        }
        return false;
    }
    
    public int Min(){
        if(left == null)
            return data;
        else
            return left.Min();
    }
    
    public boolean delete(int data, Node node){
        if(data < this.data){
            if(left != null)
                return left.delete(data, this);
            else
                return false;
        }else if(data > this.data){
            if(right != null)
                return right.delete(data, this);
            else
                return false;
        } else{
            if(left != null && right != null){
                this.data = right.Min();
                right.delete(this.data, this);
            }
            else if(node.left == this)
                node.left = (left != null)? left :right;
            else if(node.right == this)
                node.right = (left != null)? left : right;
        }
        return true;
    }
    
    public void print(Node node){
        if(node == null)
            return;
        print(node.left);
        System.out.println(node.data);
        print(node.right);
    }
}
