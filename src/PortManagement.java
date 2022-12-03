import java.util.Scanner;

public class PortManagement {
    static Scanner sc = new Scanner(System.in);
    static BinarySearchTree BST ;
    static LinkedList L;
    static Product ob=new Product();
    static void Details(int i,int rn) {
        Scanner sc = new Scanner(System.in);
        String name;
        String ProductName;
        System.out.print("\n--Please fill in customer details--\n");
        System.out.print("\nEnter customer name: ");
        name = sc.next();
        System.out.print("\nEnter Product Name: ");
        ProductName = sc.next();
        switch (i){
            case 1:ob.arr1[rn]=new container(name,ProductName);
                break;
            case 2:ob.arr2[rn]=new container(name,ProductName);
                break;
            case 3:ob.arr3[rn]=new container(name,ProductName);
                break;
            case 4:ob.arr4[rn]=new container(name,ProductName);
                break;
            default:System.out.println("Wrong option");
                break;
        }
    }
    public static void add(container a, int i){
        int j;
        int rn;
        System.out.println("\nThe valid container number is: ");
        switch (i){
            case 1:
                for(j=0;j<ob.arr1.length;j++){
                    if(ob.arr1[j]==null){
                        System.out.print(j+1+",");
                    }
                }
                System.out.print("\n\nEnter container number: ");
                try{
                    rn=sc.nextInt();
                    rn--;
                    if(ob.arr1[rn]!=null)
                        throw new NotAvailable();
                    Details(i,rn);
                }
                catch(Exception e){
                    System.out.println("Invalid Option");
                    return;
                }
                break;
            case 2:
                for(j=0;j<ob.arr2.length;j++){
                    if(ob.arr2[j]==null){
                        System.out.print(j+11+",");
                    }
                }
                System.out.print("\n\nEnter container number: ");
                try{
                    rn=sc.nextInt();
                    rn=rn-11;
                    if(ob.arr2[rn]!=null)
                        throw new NotAvailable();
                    Details(i,rn);
                }
                catch(Exception e){
                    System.out.println("Invalid Option");
                    return;
                }
                break;
            case 3:
                for(j=0;j<ob.arr3.length;j++){
                    if(ob.arr3[j]==null){
                        System.out.print(j+31+",");
                    }
                }
                System.out.print("\n\nEnter container number: ");
                try{
                    rn=sc.nextInt();
                    rn=rn-31;
                    if(ob.arr3[rn]!=null)
                        throw new NotAvailable();
                    Details(i,rn);
                }
                catch(Exception e){
                    System.out.println("Invalid Option");
                    return;
                }
                break;
            case 4:
                for(j=0;j<ob.arr4.length;j++){
                    if(ob.arr4[j]==null){
                        System.out.print(j+41+",");
                    }
                }
                System.out.print("\n\nEnter container number: ");
                try{
                    rn=sc.nextInt();
                    rn=rn-41;
                    if(ob.arr4[rn]!=null)
                        throw new NotAvailable();
                    Details(i,rn);
                }
                catch(Exception e){
                    System.out.println("Invalid Option");
                    return;
                }
                break;
            default:
                System.out.println("Enter valid option");
                break;
        }
        System.out.println("\n--container reserved--");
        BST.insert(a);
        L.insertAtFront(a);
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
