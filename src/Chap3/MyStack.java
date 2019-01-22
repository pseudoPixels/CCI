package Chap3;

public class MyStack {
    Node top;

    public MyStack(){

    }
    public void push(Node nodeToPush){
        nodeToPush.next = top;//add the new node to the top of the stack.
        top = nodeToPush;//update the top
    }

    public  Node pop(){
        if(top == null) return null;
        Node tmp = top;
        Node newTop = top.next;
        top = newTop;

        return tmp;
    }

}
