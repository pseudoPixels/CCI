package Chap2;

public class __Practice_MainTest {

    static class Node{
        Node next = null;
        int nodeData;

        public Node(int data){
            this.nodeData = data;
        }


        public void appendToTail(int data){
            Node newNodeToAdd = new Node(data);

            Node currentNode = this;

            while (currentNode.next != null)currentNode = currentNode.next;

            currentNode.next = newNodeToAdd;

        }


        public Node deleteLinkedNode(int data){
            Node head = this;

            //The target delete is the current head
            if(head.nodeData == data){
                return head.next;
            }


            //the target delete is somewhere after the head
            Node tmp = head;
            while (tmp.next != null){
                if(tmp.next.nodeData == data){
                    tmp.next = tmp.next.next;
                    return head;
                }

                tmp = tmp.next;
            }

            return null;
        }

        public void printAllLinked(){
            Node head = this;
            if(head == null)return;

            while (head != null){
                  System.out.println(head.nodeData);
                  head = head.next;
            }
        }



    }

    public static void main(String[] args) {
        Node myLinkedList = new Node(10);

        myLinkedList.appendToTail(15);

        myLinkedList.appendToTail(25);

        myLinkedList = myLinkedList.deleteLinkedNode(10);


        myLinkedList.printAllLinked();


        //System.out.println(myLinkedList.next.nodeData);
    }
}
