package Chap2.Solutions.MySolutions;

import Chap2.Solutions.SingleLinkedListNode;

public class Q4 {


    private static SingleLinkedListNode addRecursive(SingleLinkedListNode head1, SingleLinkedListNode head2, int carry){
        if(head1==null && head2==null && carry ==0)return null;



        int listOneData = 0;
        int listTwoData = 0;

        if(head1 != null) listOneData = head1.nodeData;
        if(head2 != null)listTwoData  = head2.nodeData;


        int sum = listOneData + listTwoData + carry;

        SingleLinkedListNode resultLinkedListHead = new SingleLinkedListNode((sum)%10);

        resultLinkedListHead.next = addRecursive(head1 != null ? head1.next:null, head2 != null ? head2.next:null, (int)(sum/10) );


        return resultLinkedListHead;
    }





    public static SingleLinkedListNode addTwoLinkedList(SingleLinkedListNode head1, SingleLinkedListNode head2){

        return addRecursive(head1, head2, 0);
    }


    public static void printNodes(SingleLinkedListNode head){
        while (head != null){
            System.out.println(head.nodeData);
            head = head.next;
        }
    }



    public static void main(String[] args){

        SingleLinkedListNode head = new SingleLinkedListNode(1);
        SingleLinkedListNode head2 = new SingleLinkedListNode(2);
        SingleLinkedListNode head3 = new SingleLinkedListNode(3);
        SingleLinkedListNode head4 = new SingleLinkedListNode(4);
        SingleLinkedListNode head5 = new SingleLinkedListNode(5);
        SingleLinkedListNode head6 = new SingleLinkedListNode(6);

        head.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head5;
        head5.next = head6;


        SingleLinkedListNode l = new SingleLinkedListNode(1);
//        SingleLinkedListNode l2 = new SingleLinkedListNode(2);
//        SingleLinkedListNode l3 = new SingleLinkedListNode(3);
//        SingleLinkedListNode l4 = new SingleLinkedListNode(4);
//        SingleLinkedListNode l5 = new SingleLinkedListNode(5);
//        SingleLinkedListNode l6 = new SingleLinkedListNode(6);
//
//        l.next = l2;
//        l2.next = l3;
//        l3.next = l4;
//        l4.next = l5;
//        l5.next = l6;


        SingleLinkedListNode sumList = addTwoLinkedList(head, l);

        printNodes(sumList);

    }
}
