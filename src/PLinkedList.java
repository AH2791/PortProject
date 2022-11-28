public class PLinkedList {

    PNode first;
    int length;
    public PLinkedList() {

    }

    public boolean isEmpty(){
        return this.first == null;
    }

    public void insertAtFront(Product data){
        if(isEmpty()){
            this.first = new PNode(data);
            length++;
            return;
        }
        PNode PNode = new PNode(data);
        PNode.next = this.first;
        this.first = PNode;
        length++;
    }

    public void deleteFromFront(){
        if(isEmpty()){
            System.out.println("PLinkedList is empty!");
            return;
        }
        this.first = this.first.next;
        length--;
    }

}

