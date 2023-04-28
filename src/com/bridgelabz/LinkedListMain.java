package com.bridgelabz;

import org.w3c.dom.*;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        // Create node with data 70
        llist.push(70);

        // Add node with data 30 before node with data 70
        llist.push(30);

        // Add node with data 56 before node with data 30
        llist.push(56);

        System.out.println("Linked list:");
        llist.printList();

    }
}