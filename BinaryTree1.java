package SD5;

class Node1 {
    int data;
    Node1 left;
    Node1 right;
    public Node1(int data){
        this.data = data;
    }
}
public class BinaryTree1 {
    public Node1 root;
    public BinaryTree1(){
        root = null;
    }
    public void addRoot(int data){
        root = new Node1(data);
    }

    public void inOrder(Node1 node1) {
        if (node1 != null) {
            inOrder(node1.left);
            System.out.print(node1.data + " ");
            inOrder(node1.right);
        }
    }

    public void preOrder(Node1 node1) {
        if (node1 != null) {
            System.out.print(node1.data + " ");
            preOrder(node1.left);
            preOrder(node1.right);
        }
    }

    public void postOrder(Node1 node1) {
        if (node1 != null) {
            postOrder(node1.left);
            postOrder(node1.right);
            System.out.print(node1.data + " ");
        }
    }

    public static void main(String[] args) {
        BinaryTree1 tree = new BinaryTree1();

        tree.addRoot(20);
        tree.root.left = new Node1(2);
        tree.root.right = new Node1(25);
        tree.root.left.left = new Node1(37);
        tree.root.left.right = new Node1(12);
        tree.root.right.right = new Node1(16);

        System.out.println("\nPre Order : ");
        tree.preOrder(tree.root);
        System.out.println("\nIn Order : ");
        tree.inOrder(tree.root);
        System.out.println("\nPost Order : ");
        tree.postOrder(tree.root);
    }
}
