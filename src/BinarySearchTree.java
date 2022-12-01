import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree {
    int size;
    Node root;
    Product product;

    public BinarySearchTree() {
        product = new Product();
        this.size = 0;
        this.root = null;
    }

    public Node Search(Product p) {
        return SearchHelper(root, p);
    }

    private Node SearchHelper(Node root, Product p) {
        Node n = new Node(p);
        if (root == null) {
            return null;
        } else if (n.p.Receiver.compareToIgnoreCase(root.p.Receiver) < 0) {
            return SearchHelper(root.left, p);
        } else if (n.p.Receiver.compareToIgnoreCase(root.p.Receiver) > 0) {
            return SearchHelper(root.right, p);
        } else {
            return null;
        }
    }

    public void insert(Product p){
        System.out.println("Inserting data : " + p);
        Node n = new Node(p);
        Node parent = Search(p);
        if(parent == null){
            root = n;
            return;
        }
        n.parent = parent;
        n.height = n.parent.height + 1;
        size++;

        if (n.p.Receiver.compareToIgnoreCase(root.p.Receiver) < 0){
            parent.right = n;
        }
        else {
            parent.left = n;
        }
    }


    public Node findNext(Product data) {
        Node temp = Search(data);
        if (temp.p != data) {
            System.out.println(data + " not present in the tree.");
            return null;
        }
        Node right = temp.right;
        Node parent = temp.parent;
        if (right != null) {
            while (right.left != null) {
                right = right.left;
            }
            return right;
        }
        while (parent != null) {
            if (parent.key > temp.key) {
                return parent;
            }
            parent = parent.parent;
        }
        return temp;
    }

    public void delete(int data) {
        System.out.println("Remove  : " + data);
        Node temp = Search(data);
        if (temp.key != data) {
            System.out.println(data + " is not present in the tree.");
            return;
        }
        if (temp.right == null) {
            if (temp.parent == null) {
                root = temp.left;
                if (root != null) {
                    root.parent = null;
                }
                temp = null;
                return;
            }
            if (temp.left != null) {
                temp.left.parent = temp.parent;
            }
            if (temp.parent.right == temp) {
                temp.parent.right = temp.left;
                temp = null;
                return;
            } else {
                temp.parent.left = temp.left;
                temp = null;
                return;
            }
        }
        Node nextTemp = findNext(temp.key);
        if (nextTemp.right != null) {
            nextTemp.right.parent = nextTemp.parent;
        }
        if (nextTemp.parent == null) {
            root = nextTemp.right;
        }
        if (nextTemp.parent != null && nextTemp.parent.left == nextTemp) {
            nextTemp.parent.left = nextTemp.right;
        }
        if (nextTemp.parent != null && nextTemp.parent.right == nextTemp) {
            nextTemp.parent.right = nextTemp.right;
        }
        if (temp.left != null) {
            temp.left.parent = nextTemp;
        }
        if (temp.right != null) {
            temp.right.parent = nextTemp;
        }
        nextTemp.left = temp.left;
        nextTemp.right = temp.right;
        nextTemp.parent = temp.parent;
        if (temp.parent == null) {
            root = nextTemp;
            temp = null;
            return;
        }
        if (temp.parent.right == temp) {
            temp.parent.right = nextTemp;
            temp = null;
            return;
        }
        temp.parent.left = nextTemp;
        temp = null;
    }
}