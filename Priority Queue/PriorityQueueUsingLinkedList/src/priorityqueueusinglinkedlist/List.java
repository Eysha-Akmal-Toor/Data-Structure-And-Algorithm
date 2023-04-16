package priorityqueueusinglinkedlist;

import java.util.Scanner;

public class List extends Queue {

    Queue front = null;
    Queue rear = null;
    Scanner scanner = new Scanner(System.in);

    public void Enqueue_in_AscendingOrder() {
        System.out.println("Enter the Number of Nodes: ");
        int n = scanner.nextInt();
        System.out.println("Enter the Elements of Nodes: ");
        for (int i = 1; i <= n; i++) {
            Queue temp = new Queue();
            int item = scanner.nextInt();
            temp.data = item;
            temp.next = null;
            if (front == null && rear == null) {
                front = temp;
                rear = front;
            } else {
                rear.next = temp;
                rear = temp;
                Queue m;
                for (m = front; m != rear; m = m.next) {
                    for (Queue current = front; current != rear; current = current.next) {
                        int d = current.data;
                        int l = current.next.data;
                        if (d > l) {
                            int change = d;
                            d = l;
                            l = change;
                            current.data = d;
                            current.next.data = l;
                        }
                    }
                }
            }
        }
    }

    public void Enqueue_in_DescendingOrder() {
        System.out.println("Enter the Number of Nodes: ");
        int n = scanner.nextInt();
        System.out.println("Enter the Elements of Nodes: ");
        for (int i = 1; i <= n; i++) {
            Queue temp = new Queue();
            int item = scanner.nextInt();
            temp.data = item;
            temp.next = null;
            if (front == null && rear == null) {
                front = temp;
                rear = front;
            } else {
                rear.next = temp;
                rear = temp;
                Queue m;
                for (m = front; m != rear; m = m.next) {
                    for (Queue current = front; current != rear; current = current.next) {
                        int d = current.data;
                        int l = current.next.data;
                        if (d < l) {
                            int change = d;
                            d = l;
                            l = change;
                            current.data = d;
                            current.next.data = l;
                        }
                    }
                }
            }
        }
    }

    void Display() {
        Queue temp;
        System.out.println("The values of Nodes are: ");
        if (front == null) {
            System.out.println("Empty!!!");
        } else {
            temp = front;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
}
