package com.bridgelabz;
import org.junit.Test; // import necessary packages
import static org.junit.Assert.*;
public class LinkedListTest {
    // Define a test method using the @Test annotation
    @Test
    public void testInsertAfterNode() {
        // Create a new linked list
        LinkedList list = new LinkedList();

        // Insert three nodes into the list
        list.insertAtStart(70);
        list.insertAtStart(30);
        list.insertAtStart(56);

        // Get the node with key value 30
        Node node30 = list.head.next;

        // Insert a new node with data value 40 after node30
        list.insertAfter(node30, 40);

        // Check that the final sequence is correct
        String expected = "56 30 40 70";
        String actual = getListAsString(list);
        assertEquals(expected, actual);
    }

    // Define a helper method to get the string representation of a linked list
    private String getListAsString(LinkedList list) {
        // Create a StringBuilder object to build the string representation of the list
        StringBuilder sb = new StringBuilder();
        // Set the current node to the head of the list
        Node current = list.head;
        // Loop through the list until the end is reached (i.e. current is null)
        while (current != null) {
            // Append the data of the current node to the StringBuilder
            sb.append(current.data);
            // If the current node has a next node, append a space to the StringBuilder
            if (current.next != null) {
                sb.append(" ");
            }
            // Move to the next node in the list
            current = current.next;
        }
        // Convert the StringBuilder to a String and return it
        return sb.toString();
    }
}