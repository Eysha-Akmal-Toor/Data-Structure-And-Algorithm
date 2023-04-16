package queueusingarrays;

public class QueueUsingArrays {

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.isEmpty();
        queue.isFull();
        queue.Enqueue(50);
        queue.Enqueue(100);
        queue.Enqueue(150);
        queue.Enqueue(250);
        queue.Enqueue(350); 
        queue.Dequeue();
        queue.Dequeue();
        queue.Display();
    }
}