package doublecircularlinkedlist;

import java.util.Scanner;

public class DoubleCircularLinkedList {

    public static void main(String[] args) {
        List list = new List();
        list.Create();
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 for Insertion at Start, 2 for Insertion at Particular Position and 3 for Insertion at End: ");
        int value = scanner.nextInt(); 
        if (value == 1) {
            list.InsertionAtStart();
        } else if (value == 2) {
            list.InsertionAtParticularPosition();
        } else if (value == 3) {
            list.InsertionAtEnd();
        }
        
//        System.out.println("Enter 1 for Deletion at Start, 2 for Deletion at Particular Position and 3 for Deletion at End: ");
//        int num = scanner.nextInt();
//        if (num == 1) {
//            list.DeletionAtStart();
//        } else if (num == 2) {
//            list.DeletionAtParticularPosition();
//        } else if (num == 3) {
//            list.DeletionAtEnd();
//        }

        list.AscendingOrderSorting();
        list.DescendingOrderSorting();
//        list.Searching();
        list.Display();
    }
    
}
