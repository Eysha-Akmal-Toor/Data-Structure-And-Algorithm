package mergesorting;

import java.util.Scanner;

public class MergeSorting {

    static void merge(int arr[], int lb, int mid, int ub, int size) {
        int i = lb;
        int j = mid + 1;
        int k = lb;
        int temp[] = new int[size];
        while (i <= mid && j <= ub) {
            if (arr[i] <= arr[j]) { 
                temp[k] = arr[i];
                i++;
                k++;
            } else{
                temp[k] = arr[j];
                j++;
                k++;
            }
        }
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }
        while (j <= ub) {
            temp[k] = arr[j];
            j++;
            k++;
        }
        for (int z = lb; z <= ub; z++) {
            arr[z] = temp[z];
        }
    }

    static void mergesorting(int arr[], int lb, int ub, int size) {
        if (lb < ub) {
            int mid = (lb + ub) / 2;
            mergesorting(arr, lb, mid, size);
            mergesorting(arr, mid + 1, ub, size);
            merge(arr, lb, mid, ub, size);
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the size for array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int myarr[] = new int[size];
        System.out.println("Enter the values of the array: ");
        for (int i = 0; i < size; i++) {
            myarr[i] = sc.nextInt();
        }
        System.out.println("Before sorting: ");
        for (int i = 0; i < size; i++) {
            System.out.print(myarr[i] + " ");
        }
        System.out.println();
        System.out.println("After sorting: ");
        MergeSorting.mergesorting(myarr, 0, size - 1, size);
        for (int i = 0; i < size; i++) {
            System.out.print(myarr[i] + " ");
        }
    }
}
