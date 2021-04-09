package Test;

import java.io.IOException;
import java.sql.SQLException;

public class SortedLinkedList {
    private static Node head;

    public static void add(Integer n) {
        Node node = new Node(n);

        if (head == null || head.data >= node.data) {
            node.link = head;
            head = node;
            return;
        }
        Node curr = head, prev = head;//4-6-
        while (curr != null && curr.data < node.data){
            prev = curr;
            curr = curr.link;
        } 
        Node temp = prev.link;
        prev.link = node;
        node.link = temp;

    }

    public static void display(){

        Node curr = head;
        while(curr != null){
            System.out.println(curr.data);
            curr = curr.link;
        }
    }

    public static void main(String[] args) {
        add(5);
        add(4);
        add(2);
        add(3);
        add(6);
        add(6);
        add(7);
        display();
    }
}

class Node {
    Integer data;
    Node link;

    Node(Integer data) {
        this.data = data;
        link = null;
    }
}