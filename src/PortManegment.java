import java.util.Scanner;

public class PortManegment {

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
}
