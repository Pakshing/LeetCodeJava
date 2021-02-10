package BinaryTree;

import java.util.*;
public class NodeDepth {
    public static int nodeDepths(BinaryTree root) {
        // Write your code here.
        ArrayList<Integer> sums = new ArrayList<>();
        int res=0;

        calNodeDepth(root,-1,sums);

        for(Integer sum:sums){
            res += sum;
        }
        return res;
    }


    public static void calNodeDepth(BinaryTree node, int runningSum, ArrayList<Integer> sums){
        if(node == null) return;
        runningSum++;
        sums.add(runningSum);

        calNodeDepth(node.left, runningSum, sums);
        calNodeDepth(node.right, runningSum, sums);

    }


    static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }
}
