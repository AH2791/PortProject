public class LinkedList {
    Node head;

    public boolean isEmpty(){
        return head==null;
    }
    public void insertAtBack(container data){
        Node n=new Node(data);
        if(isEmpty()){
            head=n;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=n;
        }
    }
    public void insertAtFront(container data,int proirity){
        Node n=new Node(data,proirity);
        if(isEmpty()){
            head=n;
            return;
        }
        n.next=head;
        head=n;
    }
    public void priorityEnqueue(container a, int priority){
        Node n=new Node(a,priority);
        if(isEmpty()){
            insertAtFront(a,priority);
        }
        else if(head.priority>priority){
            n.next=head;
            head=n;
        }
        else{
            Node temp=head;
            while(temp.next!=null && temp.next.priority<priority){
                temp=temp.next;
            }
            n.next=temp.next;
            temp.next=n;
        }
    }
    public void removeElement(int a){


    }
    public Node deleteFromFront(){
        Node n=head;
        head=head.next;
        return n;
    }
    public void display(){
        Node n=head;
        while(n!=null){
            System.out.print(n.data+" ");
            n=n.next;
        }
    }

}
