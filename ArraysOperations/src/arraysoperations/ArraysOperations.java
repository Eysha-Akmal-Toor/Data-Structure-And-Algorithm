package arraysoperations;

import java.util.Scanner;

public class ArraysOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        arr[0] = 50;
        arr[1] = 30;
        arr[2] = 10;
        arr[3] = 5;
        arr[4] = 40;

        TraversalOperation.TraversalOperation(arr, 5);
        int size = 5, position = 2, element = 45;

        InsertionOperation.InsertionOperation(arr, size, position, element);
        size++;
        TraversalOperation.TraversalOperation(arr, size);
        

        DeletionOperation.DeletionOperation(arr, size, position, element);
        size--;
        TraversalOperation.TraversalOperation(arr, size);

        UpdationOperation.UpdateOperation(arr, size, position, element);
        TraversalOperation.TraversalOperation(arr, size);
        
        SortOperation.SortOperation_in_AscendingOrder(arr, size);
        TraversalOperation.TraversalOperation(arr, size);
        
        SortOperation.SortOperation_in_DescendingOrder(arr, size);
        TraversalOperation.TraversalOperation(arr, size);
        
        System.out.println("Enter the number you want to search: ");
        int num = scanner.nextInt();
        SearchOperation.SearchOperation(arr, size, position, num);
    }
    
}
