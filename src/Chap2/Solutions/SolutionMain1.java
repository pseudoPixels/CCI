package Chap2.Solutions;


import java.util.Hashtable;

public class SolutionMain1 {

    public static void deleteDuplicates(LinkedListNode head){
        Hashtable hashtable = new Hashtable();

        LinkedListNode prevNode = null;

        while (head != null){
            if(hashtable.containsKey(head.data)){
                prevNode.setNext(head.next);
            }else{
                hashtable.put(head.data, true);
                prevNode = head;
            }

            head = head.next;
        }

    }


    public static void deleteDuplicates_NoAdditionalBuffer(LinkedListNode head){

        if(head.next == null)return;

        LinkedListNode startNode = head;

        head = head.next;

        while(head != null){
            LinkedListNode duplicateCheckPointer = startNode;
            while (duplicateCheckPointer != head){
                if(duplicateCheckPointer.data == head.data){

                    head.prev.next = head.next;
                    if(head.next !=null)head.next.prev = head.prev;
                    break;
                }

                duplicateCheckPointer = duplicateCheckPointer.next;
            }
            head = head.next;

        }



    }



    public static void main(String[]  args){
        LinkedListNode n1 = new LinkedListNode(10, null, null);
        LinkedListNode n2 = new LinkedListNode(10, null, null);
        LinkedListNode n3 = new LinkedListNode(10, null, null);
        LinkedListNode n4 = new LinkedListNode(10, null, null);

        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);

        n2.setPrevious(n1);
        n3.setPrevious(n2);
        n4.setPrevious(n3);

        deleteDuplicates_NoAdditionalBuffer(n1);

        System.out.println(n1.printForward());



    }


}
