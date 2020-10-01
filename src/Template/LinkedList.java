package Template;

import Questions.DeleteSpecific;

public class LinkedList {
    static class Node {
        int data;
        Node next;
    }

    static Node head = null;
    //Create Your Method
    public static void MyMethod(){
        //Your Method
    }
    
    // changing the method name from push to add
    static void add(int new_data) {
        Node new_node = new Node();
        new_node.data = new_data;
        new_node.next = head;
        head = new_node;
    }

    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        add(1);
        add(2);
        add(3);
        add(4);
        add(3);
        add(2);
        add(1);
        // add(5);
        System.out.println("Given linked list ");
        printList(head);
        MyMethod();

    }
}



