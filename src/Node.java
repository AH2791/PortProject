public class Node {
    int key;
    Node parent;
    Node left;
    Node right;
    int height;
    Node next;
    public Node(int data){
        this.key=data;
        this.parent=null;
        this.left=null;
        this.right=null;
        this.height=0;
    }
}