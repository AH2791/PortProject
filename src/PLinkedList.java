public class PLinkedList {

    PNode first;
    int length;
    private int currentNb;
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
    public PNode searchByProduct(String n){
        PNode current = this.first;
        for (int i = 0; current!=null ; current=current.next) {
            if(current.data.ProductName.equalsIgnoreCase(n)){
                return current ;
            }
        }
        return null;
    }

public PNode searchByReceiver(String n){
    PNode current = this.first;
    for (int i = 0; current!=null ; current=current.next) {
        if(current.data.Receiver.equalsIgnoreCase(n)){
            return current ;
        }
    }
    return null;
    }
}

