package com.bridgelabz;
/*This implementation uses a generic type T that extends Comparable<T> to ensure
that elements added to the list can be compared to maintain the order.
The add method first checks if the new element should be inserted at the beginning of the list,
by comparing it with the head element. If not, it traverses the list until it
finds the appropriate position to insert the new element, based on its value.
The printList method simply traverses the list and prints the data in each node.
 */
public class LinkedList {
    Node head; // Reference to the head of the list
    Node tail; // Reference to the tail of the list

    // Constructor for creating a new empty list
    public LinkedList() {
        this.head = null; // Initially, the list is empty
    }

    public static class SortedLinkedList<T extends Comparable<T>> {
        private Node<T> head;
        public SortedLinkedList() {
            this.head = null; // Initialize head to null
        }

        public void add(T data) {
            Node<T> newNode = new Node<>(data); // Create a new node with the given data
            if (this.head == null || data.compareTo(this.head.data) < 0) { // Check if the list is empty or if the new node is less than the head
                newNode.next = this.head; // Set the new node's next to the head
                this.head = newNode; // Set the head to the new node
                return; // Return early
            }
            Node<T> current = this.head; // Start at the head of the list
            while (current.next != null && data.compareTo(current.next.data) > 0) { // Traverse the list until we find a node that is greater than or equal to the new node
                current = current.next; // Move to the next node
            }
            newNode.next = current.next; // Set the new node's next to the current node's next
            current.next = newNode; // Set the current node's next to the new node
        }

        public void printList() {
            Node<T> current = this.head; // Start at the head of the list
            while (current != null) { // Traverse the list until we reach the end
                System.out.print(current.data + " "); // Print the current node's data
                current = current.next; // Move to the next node
            }
            System.out.println(); // Print a newline character to end the line
        }

        private static class Node<T extends Comparable<T>> {
            private T data; // The data stored in this node
            private Node<T> next; // The next node in the list

            public Node(T data) {
                this.data = data; // Set the data of this node to the given data
                this.next = null; // Set the next node to null
            }
        }
    }
}

