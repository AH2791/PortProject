import java.util.Scanner;

public class PortManagement {
    BinarySearchTree BST ;
    LinkedList L;
    Product ob=new Product();
    static void Details(int i,int rn) {
        Scanner sc = new Scanner(System.in);
        String name;
        String ProductName;
        System.out.print("\n--Please fill in customer details--\n");
        System.out.print("\nEnter customer name: ");
        name = sc.next();
        System.out.print("\nEnter Product Name: ");
        ProductName = sc.next();
        int priority = sc.nextInt();
        switch (i){
            case 1:ob.arr1[rn]=new container(name,ProductName,priority);
                break;
            case 2:ob.arr2[rn]=new container(name,ProductName,priority);
                break;
            case 3:ob.arr3[rn]=new container(name,ProductName,priority);
                break;
            case 4:ob.arr4[rn]=new container(name,ProductName,priority);
                break;
            default:System.out.println("Wrong option");
                break;
        }
    }
    public static void add(container a, int priority){
        BST.insert(a);
        L.insertAtFront(a , priority);
    }
    public static void delete(container c){
        BST.delete(c);
        L.deleteFromFront();
    }
    public static void Display() {
        L.display();
    }
    public static void SearchProduct(container data){
        BST.SearchProduct(data);
    }
    public static void SearchName(container data){
        BST.SearchClient(data);
    }
}
