package selectionsorting;

import java.util.Scanner;

public class SelectionSorting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size = scanner.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter the values for the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < size - 1; i++) {
            int smallest = i;
            for(int j=i+1;j<size;j++){
                if(arr[j]<arr[smallest]){
                    smallest=j;
                }
            } 
            int temp = arr[i]; //smallest
            arr[i]=arr[smallest];
            arr[smallest]=temp;
        }
        
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
