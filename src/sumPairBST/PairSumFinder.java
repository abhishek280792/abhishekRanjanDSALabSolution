package sumPairBST;

import java.util.HashSet;

public class PairSumFinder {

    static class Node{
        int nodeData;
        Node left,right;
    }

    static Node newNode(int nodeData){
        Node tempNode = new Node();
        tempNode.nodeData=nodeData;
        tempNode.left=null;
        tempNode.right=null;
        return tempNode;
    }

    public Node insertNewNode(Node root,int key){
        if(root==null){
            return newNode(key);
        }
        if(key<root.nodeData){
            root.left=insertNewNode(root.left,key);
        }else{
            root.right=insertNewNode(root.right,key);
        }
        return root;
    }

    public boolean findPair(Node root, int sum, HashSet<Integer>set){
        if(root==null){
            return false;
        }
        if(findPair(root.left,sum,set)){
            return true;
        }
        if(set.contains(sum-root.nodeData)){
            System.out.println("\n Pair is found : ("+(sum-root.nodeData)+","+root.nodeData+")");
            return true;
        }
        else{
            set.add(root.nodeData);
        }
        return findPair(root.right, sum, set);
    }

    public void findPairWithGivenSum(Node root,int sum){
        HashSet<Integer> objHashset = new HashSet<>();
        if(!findPair(root,sum,objHashset)){
            System.out.println("\n Pair does not exist");
        }
    }

}
