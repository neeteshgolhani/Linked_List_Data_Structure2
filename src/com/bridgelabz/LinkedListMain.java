package com.bridgelabz;
// Main method for testing the linked list
public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList.SortedLinkedList<Integer> list = new LinkedList.SortedLinkedList<>();
        list.add(56);
        list.add(30);
        list.add(40);
        list.add(70);
        list.printList(); // Output: 30 40 56 70
    }
    }