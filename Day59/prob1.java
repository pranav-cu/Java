package com.chitkara.Day59;

import org.w3c.dom.Node;

class SingleLinkedList{
    private Node head;
    private int size;

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;this.next=null;
            size++;
        }
        public void addFirst(int data){
            Node node= new Node(data);
            if(head==null){
                head=node;
                return;
            }

            Node current=head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=node;
        }
        public void display(){

        }
    }
}

public class prob1 {
}
