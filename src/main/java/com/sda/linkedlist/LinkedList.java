package com.sda.linkedlist;

public class LinkedList {

    private static Node head;
    private static int size;

    public LinkedList(Object data) {
        head = new Node(data);
    }

    public void add(Object data) {
        Node copy = head;
        head = new Node(data);
        head.next = copy;
        size++;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    void printIndex(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp=temp.next;
        }
        System.out.println(temp);
    }


    public void addTail(Object data) {
        Node copy = head;
        while (copy.next != null) {
            copy = copy.next;
        }
        copy.next = new Node(data);
        size++;
    }

    class Node {
        private Object data;
        private Node next;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }

        @Override
        public String toString() {
            return ""+data;
        }
    }

}
