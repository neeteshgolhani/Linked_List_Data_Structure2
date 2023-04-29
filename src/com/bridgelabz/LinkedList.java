package com.bridgelabz;
/*The LinkedList class has a new method, append, which appends a new node with the given
 data to the end of the list. If the list is empty,
it sets the head to the new node. Otherwise, it traverses the list until it reaches the last node,
 and sets the next pointer of the last node to the new node.
The printList method is the same as before, and prints the values of all nodes in the list.
The main method creates a new empty list, and appends three nodes with data values
 56, 30, and 70 to the end of the list in sequence. Finally, it prints the values of all
  nodes in the list, which should be 56, 30, and 70.
* */
public class LinkedList {
    Node head; // Reference to the head of the list

    // Constructor for creating a new empty list
    public LinkedList() {
        this.head = null; // Initially, the list is empty
    }

    // Method for appending a new node with given data to the end of the list
    public void append(int data) {
        Node newNode = new Node(data); // Create a new node with the given data
        if (this.head == null) { // If the list is empty, set the head to the new node
            this.head = newNode;
            return;
        }
        Node current = this.head; // Start at the head of the list
        while (current.next != null) { // Traverse the list until the end
            current = current.next; // Move to the next node
        }
        current.next = newNode; // Set the next pointer of the last node to the new node
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
