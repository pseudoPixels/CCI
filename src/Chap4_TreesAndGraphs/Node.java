package Chap4_TreesAndGraphs;





public class Node {
    public Node leftChild;
    public Node rightChild;
    public int nodeData;

    public Node(int nodeData){
        this.nodeData = nodeData;

        this.leftChild = null;
        this.rightChild = null;
    }

    public void setLeftChild(Node N){
        this.leftChild = N;
    }

    public void setRightChild(Node N){
        this.rightChild = N;
    }

}



