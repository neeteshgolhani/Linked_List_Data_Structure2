package com.bridgelabz;
// Main method for testing the linked list
public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList list = new LinkedList(); // Create a new empty list
        list.insertAtStart(70);
        list.insertAtStart(30);
        list.insertAtStart(56);
        list.printList();
        Node node = list.search(30);
        if (node != null) {
            System.out.println("Node with value 30 found!");
        }
        // Search for node with key value 30
        Node node30 = list.head.next;
        // Insert 40 after node with key value 30
        list.insertAfter(node30, 40);
        list.printList();
    }
}
