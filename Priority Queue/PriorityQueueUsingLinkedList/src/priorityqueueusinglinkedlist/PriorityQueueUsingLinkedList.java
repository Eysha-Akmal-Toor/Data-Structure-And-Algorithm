package priorityqueueusinglinkedlist;

import java.util.Scanner;

public class PriorityQueueUsingLinkedList {

    public static void main(String[] args) {
        List list = new List();
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("Press 1 to Enqueue the elements in Ascending order: ");
        System.out.println("Press 2 to Enqueue the elements in Descending order: ");
        System.out.println("Enter your Choice: ");
        choice = scanner.nextInt();
        
        switch (choice) {
            case 1: {
                list.Enqueue_in_AscendingOrder();
                list.Display();
                break;
            }
            case 2: {
                list.Enqueue_in_DescendingOrder();
                list.Display();
                break;
            }
        }
    }
}
