package BinaryTree;


class Node{
    public int key;
    public Node left;
    public Node right;

    public Node(int key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree{
    public Node root;

    public BinaryTree() {
        this.root = null;
    }

    public void postOrder(Node node){
        if(node == null) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.key);
    }
}
public class playground {




    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("\nPostorder traversal of binary tree is ");
        tree.postOrder(tree.root);
    }

}
