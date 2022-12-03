public class Queue {
    LinkedList queue;
    public Queue(LinkedList queue){
        this.queue=queue;
    }
    public Queue(){
        this.queue=new LinkedList();
    }
    public void Enqueue(container data,int priority){
        queue.priorityEnqueue(data,priority);
    }
    public Node Dequeue(){
        Node a= queue.deleteFromFront();
        return a;
    }
    public void removeElement(container a){
        Queue removed=new Queue();
        while(!queue.isEmpty()){
            Node temp=Dequeue();
            if(a==temp.data){
                continue;
            }
            else {
                removed.Enqueue(temp.data, temp.priority);
            }
        }
        this.queue.head=removed.queue.head;
    }
    public String PriorityElement(){
        Queue temp = new Queue();
        Node min =queue.head;
        Node n = queue.head;
        while(!queue.isEmpty()){
            Node current = Dequeue();
            temp.Enqueue(current.data, current.priority);
            if(current.data.ProductName.compareToIgnoreCase(min.data.ProductName)< 0 ){
                min = current;
            }
        }
        while(!temp.queue.isEmpty()){
            Node current = temp.Dequeue();
            Enqueue(current.data, current.priority);
        }
        return min.data.ProductName;
    }

    public void display(){
        queue.display();
    }
}
