package com.bridgelabz;

import org.w3c.dom.*;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList list = new LinkedList(); // Create a new empty list
        list.insert(56); // Insert the value 56
        list.insert(30); // Insert the value 30
        list.insert(70); // Insert the value 70
        list.printList(); // Print the values of all nodes in the list
    }
}