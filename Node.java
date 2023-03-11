/**
 * Node
 */
public class Node<T>{

    private T data;
    private Node<T> next;

    public Node(T data){
        setData(data);
        setnext(null);
    }
    public void setData(T data)
    {
        this.data=data;
    }

    public void setnext(Node<T> next){
        this.next=next;
    }
    
    public T getData() {
        return data;
    }
    public Node<T> getNext(){return next;}

    public String toString(){ 
        if (data==null)  throw new NullPointerException("There is no data.");
        else
            {return "Node: "+data.toString();}
        
    }
}