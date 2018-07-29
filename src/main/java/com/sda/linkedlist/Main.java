package com.sda.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(2);
        for (int i = 0; i < 100; i++) {
            linkedList.addTail(i);
        }
      // linkedList.printList();
        linkedList.printIndex(5);
        /*try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
    }
}
