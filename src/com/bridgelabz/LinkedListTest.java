package com.bridgelabz;
import org.junit.Test; // import necessary packages
import static org.junit.Assert.*;
public class LinkedListTest {
    @Test // indicates that this is a JUnit test method
    public void testSearch() {
        LinkedList list = new LinkedList(); // create a new LinkedList
        list.insertAtStart(56); // insert 56 at the start of the list
        list.insertAtEnd(70); // insert 70 at the end of the list
        list.insertAfter(list.head.next, 30); // insert 30 after the node with value 56
        Node node = list.search(30); // search for the node with value 30
        assertNotNull(node); // check that the node is not null
        assertEquals(30, node.data); // check that the node has value 30
        assertNull(list.search(100)); // check that a non-existent element returns null
    }
}
