package com.bridgelabz;
/*The code defines two classes, Node and LinkedList. Node represents a single node in the linked list,
 and LinkedList represents the linked list itself. Here's a breakdown of each part of the code:
Node class:
int data;: This is the data stored in the node.
Node next;: This is a reference to the next node in the list.
public Node(int data): This is the constructor for creating a new node with the given data.
It sets the node's data to the given value and sets the next pointer to null.
LinkedList class:
Node head;: This is a reference to the head of the list.
public LinkedList(): This is the constructor for creating a new empty list. It sets the head pointer to null.
public void insertAtStart(int data): This method inserts a new node with the given data at the beginning of
the list. It creates a new node with the given data, sets its next pointer to the current head of the list,
and sets the head of the list to the new node.
public void printList(): This method prints the values of all nodes in the list.
It starts at the head of the list, traverses the list until the end while printing the data in each node,
and prints a newline at the end.
public static void main(String[] args): This is the main method for testing the linked list.
It creates a new empty list, inserts three nodes with data values 56, 30, and 70 at the
beginning of the list, and prints the values of all nodes in the list.*/
public class Node {
    int data; // Data stored in the node
    Node next; // Reference to the next node in the list

    // Constructor for creating a new node with given data
    public Node(int data) {
        this.data = data;
        this.next = null; // Initially, there is no next node
    }
}
