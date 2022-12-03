public class CArray {
    Node first;
    public CArray(){
        first=null;
    }
    public boolean isEmpty(){
        return (first==null);
    }
    public void enqueue(container a){
        if(isEmpty()){
            first = new Node(a);
            return;
        }
        Node b = first;
        while(b.next!=null){
            b=b.next;
        }
        b.next = new Node(a);
    }
    public Node dequeue(){
        if(isEmpty()){
            return null;
        }
        Node a = Node.clone(first);
        first=a.next;
        return a;
    }
    public void display(){
        if(isEmpty()){
            return;
        }
        CArray temp = new CArray();
        while(!isEmpty()){
            Node t = dequeue();
            temp.enqueue(t.data);
            t.display();
        }
        while(!temp.isEmpty()){
            enqueue(temp.dequeue().data);
        }
    }


}
