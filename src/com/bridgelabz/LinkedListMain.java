package com.bridgelabz;

import org.w3c.dom.*;
// Main method for testing the linked list
public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList list = new LinkedList(); // Create a new empty list
            list.insertAtStart(56);
            list.insertAtEnd(70);
            list.insertAfter(list.head.next, 30);
            Node node = list.search(30);
            if (node != null) {
                System.out.println("Node with value 30 found!");
            }
        }
    }