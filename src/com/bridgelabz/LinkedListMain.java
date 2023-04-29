package com.bridgelabz;

import org.w3c.dom.*;
// Main method for testing the linked list
public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList list = new LinkedList(); // Create a new empty list
        list.insertAtEnd(56);
        list.insertAtEnd(30);
        list.insertAtEnd(70);
        list.printList(); // Should print "56 30 70"
        list.popLast();
        list.printList(); // Should print "56 30"
        list.popLast();
        list.printList(); // Should print "56"
        list.popLast();
        list.printList(); // Should print an empty line
        list.popLast(); // Should print "List is empty."
    }
}