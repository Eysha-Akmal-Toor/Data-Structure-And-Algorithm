package priorityqueueusingarrays;

import java.util.Scanner;

public class Queue {

    int front = -1;
    int rear = -1;
    int a[];
    int size;
    Scanner scanner = new Scanner(System.in);
    
    public void Enqueue_in_AscendingOrder() {
        System.out.println("Enter the Size of Array: ");
        size = scanner.nextInt();
        a = new int[size];
        System.out.println("Enter the Elements of the Array: ");
        for (int i = 0; i < size; i++) {
            int item = scanner.nextInt();
            if (front == -1 && rear == -1) {
                front = 0;
                rear = 0;
                a[rear] = item;
            } else {
                rear++;
                a[rear] = item;
                for (int m = 0; m <= rear; m++) {
                    for (int j = 0; j <= rear - 1; j++) {
                        if (a[j] > a[j + 1]) {
                            int temp = a[j + 1];
                            a[j + 1] = a[j];
                            a[j] = temp;
                        }
                    }
                }
            }
        }
        
        System.out.println("Elements after Arranging in Order: ");
        for (int i = front; i <= rear; i++) {
            System.out.println(a[i]);
        }
    }

    public void Enqueue_in_DescendingOrder() {
        System.out.println("Enter the Size of Array: ");
        size = scanner.nextInt();
        a = new int[size];
        System.out.println("Enter the Elements of the Array: ");
        for (int i = 0; i < size; i++) {
            int item = scanner.nextInt();
            if (front == -1 && rear == -1) {
                front = 0;
                rear = 0;
                a[rear] = item;
            } else {
                rear++;
                a[rear] = item;
                for (int m = 0; m <= rear; m++) {
                    for (int j = 0; j <= rear - 1; j++) {
                        if (a[j] < a[j + 1]) {
                            int temp = a[j + 1];
                            a[j + 1] = a[j];
                            a[j] = temp;
                        }
                    }
                }
            }
        }
        System.out.println("Elements after Arranging in Order: ");
        for (int i = front; i <= rear; i++) {
            System.out.println(a[i]);
        }
    }
}