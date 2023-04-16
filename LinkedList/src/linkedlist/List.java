package linkedlist;

import java.util.Scanner;

public class List{

    int k;
    Node head, tail;
    Scanner scanner = new Scanner(System.in);

    public void Create() {
        System.out.println("Enter the number of nodes you want to create: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            Node temp = new Node();
            System.out.println("Enter the data you want to insert in the node " + i);
            k = scanner.nextInt();

            temp.data = k;
            temp.next = null;

            //To check the head of node
            
            if (head == null) {   //If the node has not been created already
                head = temp;
                tail = head;
            } else {
                tail.next = temp;
                tail = temp;
            }
        }
    }

    public void Display() {
        if (head == null) {
            System.out.println("Node doesn't exist ");
        } 
        else {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
}