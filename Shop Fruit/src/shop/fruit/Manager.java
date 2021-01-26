
package shop.fruit;

import java.util.ArrayList;
import java.util.Scanner;


public class Manager {
  
 public static int menu(){
     
			System.out.println("___Program product ___   ");
			System.out.println("1.Add Product            : ");
			System.out.println("2.Update product         : ");
			System.out.println("3.prinAll product         : ");
			
			System.out.println("0.EXIT");
			System.out.print("Enter choice          : ");
                        int choice = Validation.checkInputLimit(1,3);
                        return choice;
			
 }	
			
 
 

    public static void addproduct(ArrayList<Product> ls) {
        System.out.println("Enter id :");
        String id = Validation.checkInputString();
        System.out.println("enter name :");
        String name = Validation.checkInputString();
        System.out.println("enter price: ");
        int price = Validation.checkInputInt();
        ls.add(new Product(id, name, price));
         System.err.println("Add Successfull ");
    }
        
   


    


}

	
    