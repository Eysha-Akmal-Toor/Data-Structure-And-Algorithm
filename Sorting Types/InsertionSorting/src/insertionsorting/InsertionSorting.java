package insertionsorting;

import java.util.Scanner;

public class InsertionSorting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size = scanner.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter the values for the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 1; i < size; i++) {
            int temp = arr[i];
            int j = i - 1;
 
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
        
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
