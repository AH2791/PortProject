public class Node {
    Node parent;
    Node left;
    Node right;
    int height;
    int priority;
    Node next;
    container data;
    public Node(container data,int priority ){
        this.data=data;
        this.priority=priority;
        this.parent=null;
        this.left=null;
        this.right=null;
        this.height=0;
    }

    public Node(container data){
        this.data=data;
    }
}
