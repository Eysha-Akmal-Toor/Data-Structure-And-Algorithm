package priorityqueueusingarrays;

import java.util.Scanner;

public class PriorityQueueUsingArrays {

    public static void main(String[] args) {
        Queue queue = new Queue();
        Scanner scanner = new Scanner(System.in);
        int choice;
        System.out.println("Press 1 to Enqueue the elements in Ascending order in array: ");
        System.out.println("Press 2 to Enqueue the elements in Descending order in array: ");
        System.out.println("Enter your Choice: ");
        choice = scanner.nextInt();
        
        switch (choice) {
            case 1: {
                queue.Enqueue_in_AscendingOrder();
                break;
            }
            case 2: {
                queue.Enqueue_in_DescendingOrder();
                break;
            }
        }
    }
}
