package com.bridgelabz;

public class LinkedList {
    Node head; // Reference to the head of the list

    // Constructor for creating a new empty list
    public LinkedList() {
        this.head = null; // Initially, the list is empty
    }

    // Method for inserting a new node with given data at the end of the list
    public void insert(int data) {
        Node newNode = new Node(data); // Create a new node with given data
        if (this.head == null) { // If the list is empty
            this.head = newNode; // Set the head to the new node
        } else { // Otherwise
            Node current = this.head; // Start at the head of the list
            while (current.next != null) { // Traverse the list until the end
                current = current.next;
            }
            current.next = newNode; // Add the new node to the end of the list
        }
    }

    // Method for printing the values of all nodes in the list
    public void printList() {
        Node current = this.head; // Start at the head of the list
        while (current != null) { // Traverse the list until the end
            System.out.print(current.data + " "); // Print the data in the current node
            current = current.next; // Move to the next node
        }
        System.out.println(); // Print a newline at the end
    }
}

