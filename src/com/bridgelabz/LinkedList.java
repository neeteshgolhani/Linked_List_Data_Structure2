package com.bridgelabz;
/*In this test case, we first create a new Linked List and insert the nodes
70, 30, and 56. We then search for the node with key value 30 and insert a
new node with data value 40 after it. Finally, we check that the final
sequence of the Linked List is as expected.
 */
public class LinkedList {
    Node head; // Reference to the head of the list
    Node tail; // Reference to the tail of the list

    // Constructor for creating a new empty list
    public LinkedList() {
        this.head = null; // Initially, the list is empty
        this.tail = null;
    }

    public void insertAtStart(int data) { // method to insert a new node at the start of the list
        Node newNode = new Node(data); // create a new node with the specified data
        newNode.next = this.head; // set the next field of the new node to the current head
        this.head = newNode; // set the head field to the new node
    }

    public void insertAtEnd(int data) { // method to insert a new node at the end of the list
        Node newNode = new Node(data); // create a new node with the specified data
        if (this.head == null) { // if the list is empty
            this.head = newNode; // set the head field to the new node
            return; // exit the method
        }
        Node lastNode = this.head; // start at the head of the list
        while (lastNode.next != null) { // traverse the list until the last node is reached
            lastNode = lastNode.next; // move to the next node
        }
        lastNode.next = newNode; // set the next field of the last node to the new node
    }

    public void insertAfter(Node prevNode, int data) { // method to insert a new node after a given node
        if (prevNode == null) { // if the given node is null
            return; // exit the method
        }
        Node newNode = new Node(data); // create a new node with the specified data
        newNode.next = prevNode.next; // set the next field of the new node to the next field of the given node
        prevNode.next = newNode; // set the next field of the given node to the new node
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
        // This line will be commented out in the modified code.
        // return null;
        return current;
    }
    public void printList() {
        Node current = this.head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

