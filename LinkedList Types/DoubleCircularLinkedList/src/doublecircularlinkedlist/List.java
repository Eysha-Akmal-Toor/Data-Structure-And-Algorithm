package doublecircularlinkedlist;

import java.util.Scanner;

public class List {

    Node head, tail;
    Node back, current;
    Scanner scanner = new Scanner(System.in);
    
    void Create() {
        Node temp = new Node();
        temp.data = 50;
        temp.previous = null;
        temp.next = null;
        head = temp;

        Node temp2 = new Node();
        temp2.data = 30;
        head.next = temp2;
        temp2.previous = head;
        temp2.next = null;
        tail = temp2;

        Node temp3 = new Node();
        temp3.data = 80;
        tail.next = temp3;
        temp3.previous = tail;
        temp3.next = head;
        tail = temp3;
        head.previous = tail;
    }

    public void InsertionAtStart() {
        Node temp = new Node();
        temp.data = 10;
        temp.next = head;
        head.previous = temp;
        head = temp;
        head.previous = tail;
        tail.next = head;
    }

    public void InsertionAtEnd() {
        Node temp = new Node();
        temp.data = 50;
        tail.next = temp;
        temp.previous = tail;
        tail = temp;
        tail.next = head;
        head.previous = tail;
    }

    public void InsertionAtParticularPosition() {
        int count = 1, position;
        back = null;
        current = head;
        Node temp = new Node();
        temp.data = 60;
        temp.next = null;
        temp.previous = null;
        System.out.println("Enter the position where you want to insert the node: ");
        position = scanner.nextInt();
        while(count!=position){
            back=current;
            current=current.next;
            count++;
        }
        if(count==position){
            back.next=temp;
            temp.previous=back;
            current.previous=temp;
            temp.next=current;
        }
    }
    
    public void DeletionAtStart(){
        head=head.next;
        head.previous=tail;
        tail.next=head;
    }
    
    public void DeletionAtEnd(){
        back = null;
        current = head;
        while (current != tail) {
            back = current;
            current = current.next;
        }
        if (current == tail) {
            back.next = head;
            tail = back;
            head.previous=tail;
        }
    }
    
    public void DeletionAtParticularPosition(){
        int count = 1, position;
        back = null;
        current = head;
        System.out.println("Enter the position where you want to delete the node: ");
        position = scanner.nextInt();
        while (count != position) {
            back = current;
            current = current.next;
            count++;
        }
        if (count == position) {
            Node temp = current.next;
            back.next = temp;
            temp.previous=back;
        }
    }
    
    void AscendingOrderSorting(){
        back = head;
        current = null;
        int c;
        if(head==null){
            System.out.println("List is Empty. ");
        }
        else{
            while(back.next!=head){
            current=back.next;
            while(current!=head){
                if(back.data>current.data){
                    c=back.data;
                    back.data=current.data;
                    current.data=c;
                }
                current=current.next;
            }
           back=back.next;
           }
        }
    }
    
    void DescendingOrderSorting(){
        back=head;
        current=null;
        int c;
        if(head==null){
            System.out.println("list is empty.");
        }
        else{
            while(back.next!=head){
                current=back.next;
                while(current!=head){
                    if(back.data<current.data){
                        c=back.data;
                        back.data=current.data;
                        current.data=c;
                    }
                    current=current.next;
                }
                back=back.next;
            }
        }
    }
    
    public void Searching() {
        Node temp=head;
        int pos = 1;
        System.out.println("Enter the value: ");
        int value = scanner.nextInt();
        while (temp != tail) {
            if (temp.data == value) {
                System.out.println("Element found at " +pos);
            }
            pos++;
            temp = temp.next;
        }
        if(temp.data == value){
            System.out.println("Element found at " +pos);
        }
    }
    
    void Display() {
        if (head == null) {
            System.out.println("Node doesn't exist!");
        } else {
            Node temp = head;
            while (temp != tail) {
                System.out.println(temp.data);
                temp = temp.next;
            }
            System.out.println(temp.data);
        }
    }
}
