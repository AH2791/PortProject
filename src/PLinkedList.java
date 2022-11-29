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
    public PNode searchByProduct( String name) {
        PNode temp = first;
        while (temp.next != null) {
            if (name.equalsIgnoreCase(temp.data.ProductName)) {
                return temp;
            }
            temp = temp.next;
        }
        System.out.println("not found");
        return null;
    }

    public PNode searchByReceiver( String receiver) {
        PNode temp = first;
        while (temp.next != null) {
            if (receiver.equalsIgnoreCase(temp.data.Receiver)) {
                return temp;
            }
            temp = temp.next;
        }
        System.out.println("not found!");
        return null;
    }
}

