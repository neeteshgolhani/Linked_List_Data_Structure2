package com.bridgelabz;

import org.w3c.dom.*;
// Main method for testing the linked list
public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList list = new LinkedList(); // Create a new empty list
        list.insertAtStart(70);
        list.insertAtStart(30);
        list.insertAtStart(56);
        list.printList(); // Should print "56 30 70"
        list.pop();
        list.printList(); // Should print "30 70"
        list.pop();
        list.printList(); // Should print "70"
        list.pop();
        list.printList(); // Should print an empty line
        list.pop(); // Should print "List is empty."
    }
}