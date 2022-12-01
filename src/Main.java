import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n---------------------------------------------");
        System.out.println("Welcome to BAU  System");
        System.out.println("---------------------------------------------");
        System.out.println("\n--Please log in to the system--");



//        try{
//            String Username= "admin";
//            String Password= "123";
//            Scanner input1 = new Scanner(System.in);
//            System.out.println("\nEnter Username : ");
//            String username = input1.next();
//            Scanner input2 = new Scanner(System.in);
//            System.out.println("\nEnter Password : ");
//            String password = input2.next();
//            if (username.equals(Username) && password.equals(Password)) {
//                System.out.println("\n--Access Granted! Welcome!--");
//            }
//            else if (username.equals(Username)) {
//                System.out.println("\nInInvalid Password! You cannot log in to the system. Please try again.");
//                System.exit(0);
//            }
//            else if (password.equals(Password)) {
//                System.out.println("\nInvalid Username! You cannot log in to the system. Please try again.");
//                System.exit(0);
//            }
//            else{
//                System.out.println("\nInvalid Username & Password! You cannot log in to the system. Please try again.");
//                System.exit(0);
//            }
//            File f = new File("backup");
//            if(f.exists()){
//                FileInputStream fin=new FileInputStream(f);
//                ObjectInputStream ois=new ObjectInputStream(fin);
//                Hotel.ob=(holder)ois.readObject();
//            }
//            Scanner sc = new Scanner(System.in);
//            int ch,ch2;
//            char wish;
//            x:
//            do{
//                System.out.println("\nEnter your choice :\n1.Add item\n2.Take item \n3.Display items\n4.Search by items\n5.Search by costumers\n6.Exit\n");
//                ch = sc.nextInt();
//                switch(ch){
//                    case 1: System.out.println("\nChoose room type :\n1.Luxury Double Room \n2.Deluxe Double Room \n3.Luxury Single Room \n4.Deluxe Single Room\n");
//
//                        break;
//                    case 2:System.out.println("\nChoose room type :\n1.Luxury Double Room \n2.Deluxe Double Room \n3.Luxury Single Room\n4.Deluxe Single Room\n");
//
//                        break;
//                    case 3:System.out.println("\nChoose room type :\n1.Luxury Double Room \n2.Deluxe Double Room \n3.Luxury Single Room\n4.Deluxe Single Room\n");
//
//                        break;
//                    case 4:
//
//                        break;
//                    case 5:
//
//                        break;
//
//                    case 6:break x;
//                }
//                System.out.println("\nContinue : (y/n)");
//                wish=sc.next().charAt(0);
//                if(!(wish=='y'||wish=='Y'||wish=='n'||wish=='N')){
//                    System.out.println("Invalid Option");
//                    System.out.println("\nContinue : (y/n)");
//                    wish=sc.next().charAt(0);
//                }
//            }
//            while(wish=='y'||wish=='Y');
//            Thread t=new Thread(new write(Hotel.ob));
//            t.start();
//        }
//        catch(Exception e){
//            System.out.println("Not a valid input");
//        }

        PLinkedList l = new PLinkedList();

        l.insertAtFront(new Product("Ahmad","slim","Lenovo Laptop"));
        l.insertAtFront(new Product("Mounzer","BIGG","RTX 4090"));
        l.insertAtFront(new Product("Moestassem","smoll","Pistol"));

        PNode n = l.searchByReceiver("Mounzer");
        if(n != null){
            System.out.println(n.data);
        }

        BinarySearchTree b1 = new BinarySearchTree();
        b1.insert(new Product("Ahmad","slim","Lenovo Laptop"));
        b1.insert(new Product("Mounzer","BIGG","RTX 4090"));
        b1.insert(new Product("Samir","small","HP PC"));
        b1.insert(new Product("baker","huge","KNIFE"));

    }
}