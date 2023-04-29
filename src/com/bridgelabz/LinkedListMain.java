package com.bridgelabz;

import org.w3c.dom.*;
// Main method for testing the linked list
public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList list = new LinkedList(); // Create a new empty list
        list.head = new Node(56); // Set the head to a new node with value 56
        Node node2 = new Node(70); // Create a new node with value 70
        list.insertAfter(list.head, 30); // Insert a new node with value 30 after the head
        list.insertAfter(list.head.next, 70); // Insert the node with value 70 after the node with value 30
        list.printList(); // Print the values of all nodes in the list
    }
}