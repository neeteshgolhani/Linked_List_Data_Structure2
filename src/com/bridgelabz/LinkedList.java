package com.bridgelabz;

public class LinkedList {
    Node head; // head of the list

    // Linked list Node.
    static class Node {
        int data;
        Node next;

        // Constructor to create a new node
        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Method to insert a new node at the beginning of the linked list
    public void push(int new_data) {
        Node new_node = new Node(new_data);

        new_node.next = head;

        head = new_node;
    }

    // Method to print the linked list
    public void printList() {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
    }
}
