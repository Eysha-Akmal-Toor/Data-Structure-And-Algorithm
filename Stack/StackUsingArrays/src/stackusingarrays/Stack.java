package stackusingarrays;

public class Stack {
    int top=-1;
    int size=10;
    int a[]= new int[size];
 
    boolean isEmpty(){
        if(top==-1){
            return true;
        }
        else{
            return false;
        }
    }
    
    boolean isFull(){
        if(top==size-1){
            return true;
        }
        else{
            return false;
        }
    }
    
    void Push(int item){
        if(isFull()){
            System.out.println("Stack Overflow!");
        }
        else{
            a[++top]=item;
        }
    }
    
    void Pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow!");
        }
        else{
            top = top-1;   
        }
    }
    
    void Peek(){
        System.out.println(a[top]);
    }
    
    void Display(){
        for(int i=top;i>=0;i--){
            System.out.println(a[i]);
        }
    }
}
