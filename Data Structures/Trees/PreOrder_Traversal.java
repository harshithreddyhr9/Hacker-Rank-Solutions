

class Node {
    int data;
    Node left;
    Node right;
    
    public Node(int value){
    data = value;
    left=null;
    right=null;
    }
}

class BinaryTree{

    public BinaryTree(){
    root=null;
    }

void preOrder(Node root) {
    if(root == null)
        return;
    System.out.print(root.data+" ");
    preOrder(root.left);
    preOrder(root.right);

}

public static void main(String args[]){
    BinaryTree b = new BinaryTree();
    b.root= new Node(1);
    b.root.left = new Node(2);
    b.root.right = new Node(3);
    b.root.left.left = new Node(4);
    b.root.right.right = new Node(5);
    b.preOrder();
}