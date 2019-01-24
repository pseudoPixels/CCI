package Chap2.Solutions.MySolutions;

import Chap2.Solutions.SingleLinkedListNode;

public class Q2 {

    public static SingleLinkedListNode nthToLast(SingleLinkedListNode head, int n){
        if(head == null || n<0)return null;

        SingleLinkedListNode nthNode = head;
        //skip the head forward by n steps
        //i.e., creates a gap of n between the head and the nthNode
        while (head != null){
            if(n == 0)break;

            if(n>0){
              n--;
              head = head.next;
          }
        }

        //Move the head to the last valid
        //move the nthNode ref as well to point nthNode from the last
        while (head.next != null){
            head = head.next;
            nthNode = nthNode.next;
        }

        return nthNode;
    }


    public static void main(String[] args){
        SingleLinkedListNode head = new SingleLinkedListNode(10);
        head.appendToTail(20);
        head.appendToTail(30);
        head.appendToTail(40);
        head.appendToTail(50);

        System.out.println(nthToLast(head,4).nodeData);
    }
}
