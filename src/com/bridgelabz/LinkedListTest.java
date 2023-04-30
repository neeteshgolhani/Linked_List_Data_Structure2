package com.bridgelabz;
import org.junit.Test; // import necessary packages
import static org.junit.Assert.*;
/*In this test case, we first create a linked list with the
 sequence 56->30->70. We then use the search method of the LinkedList class to find
 the node with key value 30. Once we have this node, we use the insertAfter method of
 the LinkedList class to insert a new node with value 40 after the node with key value 30.
Finally, we use the toString method of the LinkedList class to check the final sequence of the linked list
and compare it with the expected sequence using the assertEquals method of JUnit.*/
public class LinkedListTest {
    // Define a test method using the @Test annotation
    @Test
        public void testInsertAfter() {
            LinkedList list = new LinkedList();
            list.insertAtStart(70);
            list.insertAtStart(30);
            list.insertAtStart(56);

            // Search for node with key value 30
            Node node30 = list.search(30);
            assertNotNull(node30);

            // Insert 40 after node with key value 30
            list.insertAfter(node30, 40);

            // Check final sequence
            assertEquals("56->30->40->70", list.toString());
        }
    }
