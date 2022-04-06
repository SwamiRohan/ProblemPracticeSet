package com.practiceset.CollectionsAPI;

import java.util.LinkedList;
import java.util.List;

// Ques - Implementation of linked list
public class LinkedListTwo {
    static Node head;

    // Structure of Linked List
    // List having one data item of type integer and second variable is for Node that current node will point to
    // Like Node1 -> Node2 -> Node3
    static class Node {
        int data;
        Node next;

        public Node( int data, Node n){
            this.data = data;
            this.next = n;
        }
    }

    public void nodeAdd(int data){

    }
    public static void main(String[] args) {
        LinkedList listNumber = new LinkedList();

        Node first;
        Node second ;
        Node third ;
        third = new Node(3,null);
        second = new Node(2,third);
        first = new Node(1,second);

        for(var n : listNumber){
            System.out.print(n + " ");
        }
    }
}

