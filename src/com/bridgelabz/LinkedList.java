package com.bridgelabz;
/*The LinkedList class has a new method, pop, which deletes the first element in the list
and updates the head pointer to the next node. If the list is empty, it prints an error message
and does nothing.
The printList method is the same as before, and prints the values of all nodes in the list.
The main method creates a new empty list, inserts nodes with values
56, 30, and 70 at the start of the list, and then calls pop multiple times
to delete the first node in the list and update the head pointer. Finally,
it prints the values of all nodes in the list, which should be an empty line after the final call to pop,
and an error message if pop is called again after the list is empty.
* */
public class LinkedList {
    Node head; // Reference to the head of the list

    // Constructor for creating a new empty list
    public LinkedList() {
        this.head = null; // Initially, the list is empty
    }

    // Method for inserting a new node with given data after a given node
    public void insertAtStart(int data) {

        Node newNode = new Node(data); // Create a new node with the given data
        newNode.next = this.head; // Set the next pointer of the new node to the next node of the previous node
        this.head = newNode; // Set the next pointer of the previous node to the new node
    }

    public void pop() {
        if (this.head == null) { // If the list is empty, there's nothing to delete
            System.out.println("List is empty.");
            return;
        }
        this.head = this.head.next; // Update the head pointer to the next node
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


