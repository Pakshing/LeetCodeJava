package BinaryTree;

import java.util.*;

public class BranchSum {
    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public static List<Integer> branchSums(BinaryTree root) {
        // Write your code here.
        // O(n) time | O(n) space where n is the # of nodes of the tree
        ArrayList<Integer> res = new ArrayList<>();

        calBranchSum(root,0,res);


        return res;
    }



    public static void calBranchSum(BinaryTree node, int runningSum, ArrayList<Integer> res ){
        if(node == null) return;

        runningSum += node.value;
        if(node.left == null && node.right == null){
            res.add(runningSum);
        }

        calBranchSum(node.left, runningSum, res);
        calBranchSum(node.right, runningSum, res);


    }
}
