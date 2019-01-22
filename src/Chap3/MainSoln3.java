package Chap3;

public class MainSoln3 {

    public static void main(String[] args){
        MyStack myStack = new MyStack();

        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);

        myStack.push(n1);
        myStack.push(n2);
        myStack.push(n3);


        myStack.pop();
        Node pulledNode = myStack.pop();

        System.out.println("Hello " + pulledNode.nodeData);
    }

}
