package com.bridgelabz;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList llist = new LinkedList();

        llist.push(70);
        llist.push(30);
        llist.push(56);

        System.out.println("Linked list:");
        llist.printList();
    }
}
