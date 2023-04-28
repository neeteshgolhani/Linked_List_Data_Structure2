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

    // Driver code
    public static void main(String[] args) {
        LinkedList llist = new LinkedList();

        // Create node with data 56
        llist.push(56);

        // Add node with data 30 after node with data 56
        llist.head.next = new Node(30);

        // Add node with data 70 after node with data 30
        llist.head.next.next = new Node(70);

        System.out.println("Linked list:");
        llist.printList();
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
