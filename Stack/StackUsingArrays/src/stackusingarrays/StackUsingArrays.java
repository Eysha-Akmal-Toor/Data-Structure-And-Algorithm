package stackusingarrays;

public class StackUsingArrays {

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.isEmpty();
        stack.isFull();
//        System.out.println("The pushed values are: ");
        stack.Push(50);
        stack.Push(100);
        stack.Push(150);
//        System.out.println("The Peek value is: ");
//        stack.Peek();
        stack.Pop();
        stack.Display();
    }
}