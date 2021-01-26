
package finaltestkientruc;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.sql.Connection;
import java.sql.DriverManager;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


class Management {

    public static int menu() {
        System.out.println("1. Add a new product to the Store.");
        System.out.println("2. Update price for a particular product");
        System.out.println("3. A list of all available products in the Store");
        System.out.println("4. Create a new Order");
        System.out.println("5. Printf information of an Order by OrderID");
        System.out.println("6. Sort all products by product price as ascending");
        System.out.println("7. Print information of all Orders by a specific customer ID");
        System.out.println("8. Print information of all Orders .");
        System.out.println("9. Exit");
        System.out.print("Seclect your choice: ");
        int choice = Validation.checkInputIntLimit(1, 10);
        return choice;
        
        
        
        
        
    }

    //-------------Function for Product-----------------//
    public static void addNewProduct(ArrayList<Product> lp) {
        Scanner sc = new Scanner(System.in);
      //  System.out.println("Enter id           : ");
        int id = Validation.autoIncreaseIDProduct(lp);
        System.out.println("enter name product : ");
        String name = Validation.checkInputString();
        System.out.println("enter price        : ");
        double price = Validation.checkInputDouble();
        lp.add(new Product(id, name, price));
         System.err.println(" ___Add Successfull___\n ");     
    }

    public static void updatePrice(ArrayList<Product> lp) {
       Scanner sc = new Scanner(System.in);
       
        System.out.print("enter product id       : ");
       int id = Validation.checkInputInt();
       for ( Product p:lp){
           if (p.getId() ==id){
               System.out.print("Enter new Price : ");
               double price = Validation.checkInputDouble();
               p.setPrice(price);
               System.err.println(" ____Update successfully____ !\n ");
               return;
               
           }
       }
       
        System.out.println("ID not found ");
        
    }
    public static void listAllProduct(ArrayList<Product> lp) {
        System.out.printf("%-15s%-15s%-15s\n"," Product ID ","Name","Price");
        for(Product p:lp){
            System.out.printf("-15d%-15s%-15.1f\n",p.getId(),p.getName(),p.getPrice());
            
        }
    }

    public static void sortProductByPrice(ArrayList<Product> lp) {
     
    }
    //-------------Function for Order-----------------//

    public static void createNewOrder(ArrayList<Order> lo, ArrayList<Product> lp) {
        int id = Validation.autoIncreaseIDOrder(lo);
        LocalDate date = LocalDate.now();
        
        System.out.print("Enter customer name : ");
        String name = Validation.checkInputString();
        
        System.out.println("Enter custor address : ");
        String address = Validation.checkInputString();
        int cId = Validation.checkInputInt();
        
        //int cId = Validation.autoIncreaseIDCus(lo);
        
        Order o = new Order(id, date, name, address, cId);
        
        while (true ){
           Management.listAllProduct(lp);
            System.out.println("Enter product id : ");
            int pId =Validation.checkInputInt();
            Product p  = Validation.checkProductID(lp,pId);
            if(p==null){
                System.out.println("Product doesn't exist ! ");
                
            }else{
                o.getLp().add(p);
            }
            System.out.println("Do you want to continue shopping ? (Y/N)");
            if (Validation.checkYN()){
                break;
            }
                    }
       lo.add(o);
        System.out.println("Add successfully !\n ");
        
    }

    public static void printOrderByID(ArrayList<Order> lo) {
        System.out.print("enter order id : ");
        int id = Validation.checkInputInt();
        for(Order o :lo){
            if(o.getId() == id){
                System.out.println("Customer Id      :" +o.getcId());
                System.out.println("Customer name    : "+o.getcName());
                System.out.println("Customer Address :"+o.getcAddress());
                System.out.println("date order       : "+o.getDate());
                System.out.println("--------"+o.getcName()+"'s Product -------");
                listAllProduct(o.getLp());
                return;
                
                
            }
        }
       
    }

    public static void printOrderByCustomerID(ArrayList<Order> lo) {
        
    }
    
    public static void SaveToFile(ArrayList<Order> lo) throws FileNotFoundException, IOException{
        File f = new File("final.txt");
        if(f.exists()) f.delete();
        RandomAccessFile r = new RandomAccessFile("final.txt","rw");
        for(Order o:lo){
            r.writeBytes(o.getId()+"\r\n");
            r.writeBytes(o.getDate().toString()+"\r\n");
            r.writeBytes(o.getcName()+"\r\n");
            r.writeBytes(o.getcAddress()+"\r\n");
            r.writeBytes(o.getcId()+"\r\n");
            for(Product p: o.getLp()){
            r.writeBytes(p.getId()+"  ");
            r.writeBytes(p.getName()+"  ");
            r.writeBytes(String.valueOf(p.getPrice()) +"\r\n");
            
        }
            
        }
    }


public static void saveProductDB(ArrayList<Product> lp)
{
    

}

}