public class Node {
    Node parent;
    Node left;
    Node right;
    int height;
    int priority;
    Node next;
    container data;
    public Node(){
        this.parent=null;
        this.left=null;
        this.right=null;
        this.height=0;
    }
    public Node(container data){
        this.data=data;
    }
    public void display() {
        if (next == null) {
            System.out.println(data);
            return;
        }
        System.out.print(data + "--> ");
    }
    public static Node clone(Node a){
        return a;
}
