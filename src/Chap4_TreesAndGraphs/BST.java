package Chap4_TreesAndGraphs;

public class BST {
    Node root;

    public BST(){

    }


    private Node addNewNodeRecursive(Node currentNode, int nodeData){
        if(currentNode == null){
            return new Node(nodeData);
        }

        if(nodeData < currentNode.nodeData){
            currentNode.leftChild = addNewNodeRecursive(currentNode.leftChild, nodeData);
        }

        else if (nodeData > currentNode.nodeData){
            currentNode.rightChild = addNewNodeRecursive(currentNode.rightChild, nodeData);
        }

        return currentNode;
    }


    public void addNode(int nodeData){
        this.root = addNewNodeRecursive(root, nodeData);
    }



    private boolean containsNodeRecursive(Node currentNode, int searchValue){
        if(currentNode == null)return false;

        if(currentNode.nodeData  == searchValue)return true;

        return containsNodeRecursive(currentNode.leftChild, searchValue) || containsNodeRecursive(currentNode.rightChild, searchValue);

    }







    public boolean containsValue(int searchValue){
        return containsNodeRecursive(root, searchValue);
    }


    public Node getRoot() {
        return root;
    }


}
