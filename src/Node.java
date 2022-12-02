public class Node {
    Node parent;
    Node left;
    Node right;
    int height;
    int priority;
    Node next;
    Product data;
    public Node(Product data,int priority ){
        this.data=data;
        this.priority=priority;
        this.parent=null;
        this.left=null;
        this.right=null;
        this.height=0;
    }
}
