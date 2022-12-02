
public class BinarySearchTree {
    int size;
    Node root;
    Product product;

    public BinarySearchTree() {
        product = new Product();
        this.size = 0;
        this.root = null;
    }

    public Node SearchClient(Product data) {
        return SearchHelper(root, data);
    }

    private Node SearchHelper(Node root, Product data) {
        Node n = new Node(data);
        if (root == null) {
            return null;
        } else if (n.data.Receiver.compareToIgnoreCase(root.data.Receiver) < 0) {
            return SearchHelper(root.left, data);
        } else if (n.data.Receiver.compareToIgnoreCase(root.data.Receiver) > 0) {
            return SearchHelper(root.right, data);
        } else {
            return null;
        }
    }

    public Node SearchProduct(Product data) {
        return SearchProductHelper(root, data);
    }

    private Node SearchProductHelper(Node root, Product data) {
        Node n = new Node(data);
        if (root == null) {
            return null;
        } else if (n.data.ProductName.compareToIgnoreCase(root.data.Receiver) < 0) {
            return SearchHelper(root.left, data);
        } else if (n.data.ProductName.compareToIgnoreCase(root.data.Receiver) > 0) {
            return SearchHelper(root.right, data);
        } else {
            return null;
        }
    }
    public void insert(Product data) {
        root = insertRec(root, data);
    }

    private Node insertRec(Node root, Product data) {

        Node Node1 = new Node(data);
        if (root == null) {
            root = new Node(data);
            return root;
        } else if (Node1.data.ProductName.compareToIgnoreCase(root.data.ProductName) < 0) {
            root.left = insertRec(root.left, data);
        } else if (Node1.data.ProductName.compareToIgnoreCase(root.data.ProductName) > 0) {
            root.right = insertRec(root.right, data);
        }
        return root;
    }
    public void delete(Product data) {
        Node temp = SearchProduct(data);
        if (temp.data != data) {return;}
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
    }
}