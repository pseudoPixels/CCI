package Chap2.Solutions;



public class SingleLinkedListNode {
    public int nodeData;
    public SingleLinkedListNode next;

    public SingleLinkedListNode(int data){
        nodeData = data;
        next = null;
    }

    public void appendToTail(int nodeData){
        SingleLinkedListNode newNode = new SingleLinkedListNode(nodeData);

        SingleLinkedListNode N = this;
        while(N.next != null) N = N.next;
        N.next = newNode;
    }

}