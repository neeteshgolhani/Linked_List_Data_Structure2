package com.bridgelabz;

public class Node {
    int data; // Data stored in the node
    Node next; // Reference to the next node in the list

    // Constructor for creating a new node with given data
    public Node(int data) {
        this.data = data;
        this.next = null; // Initially, there is no next node
    }
}
