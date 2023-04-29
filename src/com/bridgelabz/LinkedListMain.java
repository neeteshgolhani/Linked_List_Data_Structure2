package com.bridgelabz;

import org.w3c.dom.*;
// Main method for testing the linked list
public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList list = new LinkedList(); // Create a new empty list
        list.append(56); // Append the value 56 to the list
        list.append(30); // Append the value 30 to the list
        list.append(70); // Append the value 70 to the list
        list.printList(); // Print the values of all nodes in the list
    }
}