package com.bridgelabz;
/*The delete method takes a node to delete as input and removes that node from the list.
If the input node is null or the list is empty, the method does nothing.
If the input node is the head of the list, it is removed and the head is updated.
Otherwise, the method traverses the list to find the node before the input node,
Sand updates its next pointer to skip the input node.

The size method simply counts the number of nodes in the list by traversing the
list and incrementing a counter variable.

The JUnit test case creates a linked list with four nodes, searches for the node with key value 40,
deletes it,
and checks that the list size is now 3 and the node has been removed from the list.
 */
public class LinkedList {
    Node head; // Reference to the head of the list
    Node tail; // Reference to the tail of the list

    // Constructor for creating a new empty list
    public LinkedList() {
        this.head = null; // Initially, the list is empty
    }

    public void insertAtStart(int data) { // method to insert a new node at the start of the list
        Node newNode = new Node(data); // create a new node with the specified data
        newNode.next = this.head; // set the next field of the new node to the current head
        this.head = newNode; // set the head field to the new node
    }
    public Node search(int key) {
        Node current = this.head; // set the current node to the head of the list
        while (current != null) { // iterate through the list until the end is reached
            if (current.data == key) { // check if the current node contains the desired key
                return current; // return the node containing the key
            }
            current = current.next; // move to the next node
        }
        // If the key was not found, return null.
        return current;
    }
    // Print the contents of the linked list
    public void printList() {
        // Start at the head of the linked list
        Node current = this.head;
        // Traverse the list and print each node's data
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        // Print a newline character to separate from other output
        System.out.println();
    }

    // Delete a given node from the linked list
    public void delete(Node nodeToDelete) {
        // If the node to delete or the head of the list is null, return
        if (nodeToDelete == null || this.head == null) {
            return;
        }
        // If the node to delete is the head of the list, update the head
        if (nodeToDelete == this.head) {
            this.head = nodeToDelete.next;
            nodeToDelete.next = null;
            return;
        }
        // Otherwise, find the node before the one to delete
        Node current = this.head;
        while (current.next != null && current.next != nodeToDelete) {
            current = current.next;
        }
        // If the node to delete is not found, return
        if (current.next == null) {
            return;
        }
        // Otherwise, update the previous node's next pointer to skip over the node to delete
        current.next = nodeToDelete.next;
        nodeToDelete.next = null;
    }

    // Insert a new node with the given data after the given previous node
    public void insertAfter(Node prevNode, int data) {
        // If the previous node is null, print an error message and return
        if (prevNode == null) {
            System.out.println("Previous node cannot be null.");
            return;
        }
        // Otherwise, create the new node with the given data and insert it after the previous node
        Node newNode = new Node(data);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }
    public int size() {
        // initialize count to 0 and set current to the head of the linked list
        int count = 0;
        Node current = this.head;
        // iterate through the linked list, incrementing count for each node we visit
        while (current != null) {
            count++;
            current = current.next;
        }
        // return the final count
        return count;
    }
}
