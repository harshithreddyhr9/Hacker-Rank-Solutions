import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static class LinkedListNode {
        public int data;
        public LinkedListNode next;

        public LinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class LinkedList {
        public LinkedListNode head;
        public LinkedListNode tail;

        public LinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            LinkedListNode node = new LinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }


void Print(Node head) {
  
  Node current = head;
        while (n != null)
        {
            System.out.println(current.data+" "); // Print the data
            current = current.next; // traverse the current node until it reaches the last node 
        }
}

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        LinkedList llist = new LinkedList();

        int llistCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < llistCount; i++) {
            int llistItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            llist.insertNode(llistItem);
        }

        printLinkedList(llist.head);

        scanner.close();
    }
}
