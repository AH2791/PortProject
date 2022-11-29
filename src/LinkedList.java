public class LinkedList {
    static Node head;
    static int size;


    public LinkedList(){
        head=null;
        size=0;
    }

    static public void pushFront(int number){
        System.out.println("Inserting node at front : " + number);
        Node node = new Node(number);
        if(head==null){
            head=node;
            size++;
            return;
        }

        node.next=head;
        head=node;
        size++;
    }

    static public void pushBack(int number){
        System.out.println("Inserting node at back  : " + number);
        Node node = new Node(number);
        if(head==null){
            head=node;
            size++;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;
        size++;
    }

    static public void popFront(){
        System.out.println("PopFront Operation.");
        if(head==null){
            return;
        }

        head=head.next;
        size--;
    }

    static public void popBack(){
        System.out.println("PopBack Operation.");
        if(head==null){
            return;
        }

        if(head.next==null){
            head=null;
            size--;
            return;
        }

        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        size--;
    }

    static public void pop(int position){
        System.out.println("Poping element at pos : " + position);
        if(head==null){
            return;
        }
        if(position==0){
            head=head.next;
            size--;
            return;
        }

        Node temp=head;
        int x=0;
        while(temp.next!=null && x<position-1){
            temp=temp.next;
            x++;
        }



        if(temp.next==null){
            return;
        }

        temp.next=temp.next.next;
        size--;
    }

    static public void display(){
        System.out.print("LinkedList : ");
        if(head==null){
            System.out.println(" ");
            return;
        }

        Node temp=head;
        while(temp!=null){
            System.out.print(temp.key +  " ");
            temp=temp.next;
        }
        System.out.println();
    }
}
