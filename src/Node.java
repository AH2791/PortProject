public class Node {
    Node parent;
    Node left;
    Node right;
    int height;
    Node next;
    Product p;
    public Node(Product data){
        this.p=data;
        this.parent=null;
        this.left=null;
        this.right=null;
        this.height=0;
    }
}
