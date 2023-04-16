package doublylinkedlist;

public class DoublyLinkedList {

    public static void main(String[] args) {
        List list = new List();
        list.Create();
//        list.InsertionAtStart();
//        list.InsertionAtEnd();
//        list.InsertionAtParticularPosition();
//        list.DeletionAtStart();
        list.DeletionAtEnd();
//        list.DeletionAtParticularPosition();
//        list.Searching();
        list.Display();
    }   
}