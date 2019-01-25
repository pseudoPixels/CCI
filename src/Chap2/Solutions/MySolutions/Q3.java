package Chap2.Solutions.MySolutions;
import Chap2.Solutions.SingleLinkedListNode;

public class Q3 {

    public static boolean deleteSpecificNode(SingleLinkedListNode head, SingleLinkedListNode targetNode) {

        if (head != null && targetNode != null) {

            while (head != null) {
                if (head.next == targetNode) break;
                head = head.next;
            }

            head.next = targetNode.next;

            return true;
        }

        return false;

    }

    public static boolean deleteSpecificNode(SingleLinkedListNode targetNode) {
        if(targetNode == null)return false;

        targetNode.nodeData = targetNode.next.nodeData;
        targetNode.next = targetNode.next.next;

        return true;
    }


    public static void printNodes(SingleLinkedListNode head){
        while (head != null){
            System.out.println(head.nodeData);
            head = head.next;
        }
    }



    public static void main(String[] args){

        SingleLinkedListNode head = new SingleLinkedListNode(10);
        SingleLinkedListNode head2 = new SingleLinkedListNode(20);
        SingleLinkedListNode head3 = new SingleLinkedListNode(30);
        SingleLinkedListNode head4 = new SingleLinkedListNode(40);
        SingleLinkedListNode head5 = new SingleLinkedListNode(50);
        SingleLinkedListNode head6 = new SingleLinkedListNode(60);

        head.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head5;
        head5.next = head6;

        deleteSpecificNode(head5);

        printNodes(head);


    }



}
