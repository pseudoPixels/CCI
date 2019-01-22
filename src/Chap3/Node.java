package Chap3;

public class Node {
    int nodeData;
    Node next;

    public Node(int data){
        nodeData = data;
        next = null;
    }

    public void appendToTail(Node nodeToAppend){
        this.next = nodeToAppend;
    }

}

