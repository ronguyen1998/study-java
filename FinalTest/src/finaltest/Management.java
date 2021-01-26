package finaltest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


 class Management{

    static Product product;

    public static int menu() {
        System.out.println("__CLOTHES MANAGEMENT SYSTEM__ ");
        System.out.println("1. Add a new Clothes to the Store.");
        System.out.println("2. Update price and quantity for a particular Clothes");
        System.out.println("3. A list of all available  Clothes in the Store");
        System.out.println("4. Create a new Shopping");
        System.out.println("5. Print information of Clothes that haved minimum Price");
        System.out.println("6. Sort all Clothes by Clothes ID as ascending");
        System.out.println("7. Print information of all Shopping by a specific customer ID");
        System.out.println("8. Export information of a specific Shopping ID to text file.");
        System.out.println("9. Exit");
        System.out.print("Seclect your choice: ");
        int choice = Validation.checkInputLimit(1, 10);
        return choice;

    }

    //-------------Function for Product-----------------//
    public static void addNewProduct(ArrayList<Product> lp) {
        Scanner sc = new Scanner(System.in);
      //  System.out.println("Enter id           : ");
        int id = Validation.autoIncreaseIDProduct(lp);
        System.out.println("enter name product : ");
        String name = Validation.checkStringInput();
        System.out.println("enter price        : ");
        double price = Validation.checkInputDouble();
        lp.add(new Product(id, name, price));
         System.err.println(" ___Add Successfull___\n ");     
    }
    public static void updatePrice(ArrayList<Product> lp) {
        Scanner scanner = new Scanner(System.in);
        double price;

        System.out.print("Enter ID: ");
        int code = scanner.nextInt();

        if (Validation.checkCodeProduct(lp, code)) {
            System.err.println("Not found Code !");
            return;
        } else {
            System.out.print("Enter new Price: ");
            price = Validation.checkInputDouble();

            product = Validation.getProduct(lp, code);
            product.setPrice(price);
            System.out.println("_____Update successflly_____ !");
        }
    }

    public static void listAllProduct(ArrayList<Product> lp) {
        if (lp.size() == 0) {
            System.out.println("List Null !");
        } else {
            System.out.println("ID" + "\t" + "Name Product" + "\t" + "Price");
            for (int i = 0; i < lp.size(); i++) {
                System.out.print(lp.get(i).getId());
                System.out.print("\t");
                System.out.print(lp.get(i).getName());
                System.out.print("\t" + "\t");
                System.out.print(lp.get(i).getPrice());
                System.out.print("\n");
            }
        }
    }

    public static void sortProductByPrice(ArrayList<Product> lp) {

        Collections.sort(lp);

    }
    //-------------Function for Order-----------------//

    public static Oder createNewOrder(ArrayList<Oder> lo, ArrayList<Product> lp) {

        ArrayList<Product> pd = new ArrayList<>();

        int id = Validation.autoIncreaseIDOder(lo);
        System.out.println("Customer ID : " + id);
        System.out.printf("Order Date : ");
        System.out.printf("Enter your Name: ");
        String cname = Validation.checkStringInput();
        System.out.printf("Enter your Address: ");
        String caddress = Validation.checkStringInput();
        int cid = Validation.autoIncreaseIDCus(lo);
        System.out.printf("Your ID: " + cid);

        LocalDate date = LocalDate.now();

        System.out.print("\n");
        listAllProduct(lp);
        System.out.print("\n");

        System.out.printf("Enter ID Product your choose: ");
        int code = Validation.checkIntInput();
        if (Validation.checkCodeProduct(lp, code)) {
            System.err.println("Not found Product to List!");
            System.out.println("Please try again !");
        } else {
            Product product = Validation.getProduct(lp, code);
            pd.add(product);

            System.out.printf("Enter Quantity: ");
            int quan = Validation.checkIntInput();
            double amount = product.getPrice() * quan;
            System.out.print("Amount you need to pay: " + amount);

            Oder od = new Oder(id, cname, caddress, cid, date, quan, amount);
            od.setLp(pd);
            System.out.println("\n" + "___OK___ ! ");

            return od;
        }
        return null;
//        Date date = new Date();
//        date.getDate();
    }

    public static void printOrderByID(ArrayList<Oder> lo) {
        System.out.print("Enter ID Oder you want search: ");
        int code = Validation.checkIntInput();

        if (Validation.checkCodeOder(lo, code)) {
            System.err.println("Not found Oder to List !");
            System.err.println("Please try again !");
        } else {
            Oder od = Validation.getOder(lo, code);
            System.out.println("Id Oder: " + od.getId());
            System.out.println("Id Customer: " + od.getCid());
            System.out.println("Name Customer: " + od.getCname());
            System.out.println("Address Customer: " + od.getCaddres());
//            System.out.println("Product: " + od.getLp().get(od.getLp().size()));
            System.out.println("LocalDate in Oder: " + od.getLocaldate());
            System.out.println("Product:");
            ArrayList<Product> pd = od.getLp();
            if (pd.size() == 0) {
                System.out.println("List null !");
            } else {
                for (int i = 0; i < pd.size(); i++) {
                    System.out.print(pd.get(i).getId());
                    System.out.print("\t");
                    System.out.print(pd.get(i).getName());
                    System.out.print("\t");
                    System.out.print(pd.get(i).getPrice());
                    System.out.print("\n");
                }
            }
            System.out.println("Amount you need to pay: " + od.getAmount());
        }
    }

    public static void printOrderByCustomerID(ArrayList<Oder> lo) {
        System.out.print("Enter ID Customer you want search: ");
        int code = Validation.checkIntInput();

        if (Validation.checkCodeCus(lo, code)) {
            System.err.println("Not found CUstomer to List !");
            System.err.println("Please try again !");
        } else {
            Oder od = Validation.getOder(lo, code);
            System.out.println("Id Oder: " + od.getId());
            
            System.out.println("Id Customer: " + od.getCid());
            
            System.out.println("Name Customer: " + od.getCname());
            
            System.out.println("Address Customer: " + od.getCaddres());

            System.out.println("LocalDate in Oder: " + od.getLocaldate());
            System.out.println("Product:");
            ArrayList<Product> pd = od.getLp();
            if (pd.size() == 0) {
                System.out.println("List null !");
            } else {
                for (int i = 0; i < pd.size(); i++) {
                    System.out.print(pd.get(i).getId());
                    System.out.print("\t");
                    System.out.print(pd.get(i).getName());
                    System.out.print("\t");
                    System.out.print(pd.get(i).getPrice());
                    System.out.print("\n");
                }
            }
            System.out.println("Amount you need to pay: " + od.getAmount());
        }
    }

    public static void SaveToFile(ArrayList<Oder> lo) throws FileNotFoundException, IOException {
//        System.out.println(sinhvien.get(0));
        FileOutputStream fos = new FileOutputStream("Oder.txt");
        ObjectOutputStream os = new ObjectOutputStream(fos);

        for (int i = 0; i < lo.size(); i++) {
            os.writeObject(lo.get(i));
        }
        os.close();
        fos.close();
    }



    public static void exportInformation(ArrayList<Oder> lo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

}
