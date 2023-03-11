public class Stack {
    private int maxSize;
    private double[] stackArray;
    private int top;


    public Stack(int size){ 
        maxSize=size;
        stackArray=new double[maxSize];
        top=-1;
    }

    public void push(int n){
        stackArray[++top]=n;
    }
    public double pop(){
        return stackArray[top--];
    }
    public double peek(){
        return stackArray[top];
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public boolean isFull(){
        return top==maxSize-1;
    }

    public int leftElements(){
        return top+1;
    }

    
    


}
