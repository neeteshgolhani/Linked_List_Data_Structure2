package com.bridgelabz;
/*The LinkedList class has a new method, insertAfter, which inserts a new node with
the given data after the given node. If the given node is null, it prints an error
message and does nothing. Otherwise, it creates a new node with the given data, sets its next
pointer to the next node of the given node,
and sets the next pointer of the given node to the new node.
The printList method is the same as before, and prints the values of all nodes in the list.
The main method creates a new empty list, sets the head to a new node with value 56,
creates a new node with value 70, and inserts a new node with value 30 after the head,
and inserts the node with value 70 after the node with value 30. Finally,
it prints the values of all nodes in the list, which should be 56, 30, and 70.
* */
public class LinkedList {
    Node head; // Reference to the head of the list

    // Constructor for creating a new empty list
    public LinkedList() {
        this.head = null; // Initially, the list is empty
    }

    // Method for inserting a new node with given data after a given node
    public void insertAfter(Node prevNode, int data) {
        if (prevNode == null) { // If the given node is null, can't insert after it
            System.out.println("Previous node cannot be null.");
            return;
        }
        Node newNode = new Node(data); // Create a new node with the given data
        newNode.next = prevNode.next; // Set the next pointer of the new node to the next node of the previous node
        prevNode.next = newNode; // Set the next pointer of the previous node to the new node
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


