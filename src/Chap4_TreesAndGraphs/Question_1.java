package Chap4_TreesAndGraphs;

import CareerCupLibrary.AssortedMethods;
import CareerCupLibrary.TreeNode;



public class Question_1 {

    public static void main(String[] args) {

        BST bst = new BST();
        bst.addNode(1);
        bst.addNode(10);
        bst.addNode(3);
        bst.addNode(15);
        bst.addNode(20);
        bst.addNode(30);

        for(int i=0;i<=50;i++){
            if(bst.containsValue(i))System.out.println(i);
        }





    }

}
