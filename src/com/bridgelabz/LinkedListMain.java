package com.bridgelabz;

import org.w3c.dom.*;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList llist = new LinkedList();

        // Create node with data 56
        llist.push(56);

        // Add node with data 30 after node with data 56
        llist.head.next = new LinkedList.Node(30);

        // Add node with data 70 after node with data 30
        llist.head.next.next = new LinkedList.Node(70);

        System.out.println("Linked list:");
        llist.printList();
    }
}