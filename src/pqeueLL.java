public class pqeueLL {
    Node head;
    public pqeueLL(){
        head=null;
    }

    public static peek(Node head)
    {
        return (head).data;
    }

    static Node pop(Node head)
    {
        Node temp = head;
        (head) = (head).next;
        return head;
    }

    static Node push(Node head, Product data, int priority)
    {
        Node start = (head);

        // Create new Node
        Node temp = newNode(data, priority);
        if ((head).priority > priority) {

            // Insert New Node before head
            temp.next = head;
            (head) = temp;
        }
        else {

            while (start.next != null &&
                    start.next.priority < priority) {
                start = start.next;
            }

            temp.next = start.next;
            start.next = temp;
        }
        return head;
    }

    static int isEmpty(Node head)
    {
        return ((head) == null)?1:0;
    }
}
