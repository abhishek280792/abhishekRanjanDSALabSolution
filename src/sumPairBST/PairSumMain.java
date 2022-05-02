package sumPairBST;

public class PairSumMain {
    public static void main(String args[]){
        PairSumFinder pairSumFinder = new PairSumFinder();
        PairSumFinder.Node rootNode = null;
        rootNode = pairSumFinder.insertNewNode(rootNode,40);
        rootNode = pairSumFinder.insertNewNode(rootNode,20);
        rootNode = pairSumFinder.insertNewNode(rootNode,60);
        rootNode = pairSumFinder.insertNewNode(rootNode,10);
        rootNode = pairSumFinder.insertNewNode(rootNode,30);
        rootNode = pairSumFinder.insertNewNode(rootNode,50);
        rootNode = pairSumFinder.insertNewNode(rootNode,70);
        int inputSum = 130;
        pairSumFinder.findPairWithGivenSum(rootNode,inputSum);
    }
}
