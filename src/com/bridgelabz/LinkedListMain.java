package com.bridgelabz;
// Main method for testing the linked list
public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList list = new LinkedList(); // Create a new empty list
        // Inserting elements
        list.insertAtStart(70);
        list.insertAtStart(30);
        list.insertAtStart(56);

        // Printing the original list
        System.out.print("Original List: ");
        list.printList();
        // Searching for node with key value 30
        Node nodeWith30 = null;
        Node current = list.head;
        while (current != null) {
            if (current.data == 30) {
                nodeWith30 = current;
                break;
            }
            current = current.next;
        }

        // Inserting 40 after 30
        if (nodeWith30 != null) {
            list.insertAfter(nodeWith30, 40);
        }

        // Printing the modified list
        System.out.print("Modified List: ");
        list.printList();

        // Deleting node with key value 40
        Node nodeWith40 = null;
        current = list.head;
        while (current != null) {
            if (current.data == 40) {
                nodeWith40 = current;
                break;
            }
            current = current.next;
        }

        if (nodeWith40 != null) {
            list.delete(nodeWith40);
        }

        // Printing the final list
        System.out.print("Final List: ");
        list.printList();

        // Showing the size of the list
        System.out.println("Size of List: " + list.size());
    }
}