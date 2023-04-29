package com.bridgelabz;
/*The LinkedList class has a new instance variable, tail, which stores a reference to
the last node in the list.
The insertAtEnd method is modified to update the tail pointer to the new node
if the list was previously empty,
or to append the new node to the end of the list and update the tail pointer otherwise.
The popLast method deletes the last element in the list by traversing the list to find
the second-to-last node, setting its next pointer to null, and updating the tail
pointer to point to the second-to-last node. If the list is empty or has only one element,
it updates the head and tail pointers to null.
The printList method is the same as before, and prints the values of all nodes in the list.
The main method creates a new empty list, inserts nodes with values 56, 30, and 70
at the end of the list, and then calls popLast multiple times to delete the last node
* */
public class LinkedList {
    Node head; // Reference to the head of the list
    Node tail; // Reference to the tail of the list
    // Constructor for creating a new empty list
    public LinkedList() {
        this.head = null; // Initially, the list is empty
        this.tail = null;
    }
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (this.head == null) { // If the list is empty, make the new node the head and tail
            this.head = newNode;
            this.tail = newNode;
        } else { // Otherwise, append the new node to the end of the list and update the tail pointer
            this.tail.next = newNode;
            this.tail = newNode;
        }
    }

    public void popLast() {
        if (this.head == null) { // If the list is empty, there's nothing to delete
            System.out.println("List is empty.");
            return;
        } else if (this.head == this.tail) { // If there's only one element in the list, delete it and update the head and tail pointers to null
            this.head = null;
            this.tail = null;
            return;
        }
        Node current = this.head;
        while (current.next != this.tail) { // Traverse the list until we reach the second-to-last node
            current = current.next;
        }
        current.next = null; // Delete the last node by setting the next pointer of the second-to-last node to null
        this.tail = current; // Update the tail pointer to the second-to-last node
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


