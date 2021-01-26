/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finaltestkientruc;

import java.util.ArrayList;
import java.util.Scanner;
import static jdk.nashorn.internal.runtime.Debug.id;
import static org.omg.CORBA.AnySeqHelper.id;
import static org.omg.CORBA.CharSeqHelper.id;


public class Validation {

    private static final Scanner in = new Scanner(System.in);

    public static double checkInputDouble() {
        while (true) {
            try {
                double result = Double.parseDouble(in.nextLine().trim());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Input must be in Integer type");
                System.out.print("Enter again: ");
            }
        }
    }

    public static String checkInputString() {
        while (true) {
            try {
                String result = in.nextLine().trim();
                if (result.isEmpty()) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Input must not be empty!");
                System.out.print("Enter again: ");
            }
        }
    }
    public static int autoIncreaseIDProduct(ArrayList<Product> lp){
        int max = 0;
        for(Product p : lp){
            if (max <p.getId()){
                max = p.getId();
            }
                    }
        return max+1;
    }
 public static int autoIncreaseIDOrder(ArrayList<Order> lo){
        int max = 0;
        for(Order p : lo){
            if (max <p.getId()){
                max = p.getId();
            }
                    }
        return max+1;
    }
 public static int autoIncreaseIDCus(ArrayList<Order> lo){
        int max = 0;
        for(Order p : lo){
            if (max <p.getcId()){
                max = p.getcId();
            }
                    }
        return max+1;
    }
    
    public static int checkInputIntLimit(int min, int max) {
        while (true) {
            try {
                int result = checkInputInt();
                if (result < min || result > max) {
                    throw new Exception();
                }
                return result;
            } catch (Exception ex) {
                System.err.println("Input must be from " + min + " to " + max);
                System.out.print("Enter again: ");
            }
        }
    }

    public static int checkInputInt() {
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Input must be in Integer type");
                System.out.print("Enter again: ");
            }
        }
    }


    public static boolean checkYN() {
        while (true) {
            try {
                String r = checkInputString();
                if (r.equalsIgnoreCase("Y")) {
                    return true;
                } else if (r.equalsIgnoreCase("N")) {
                    return false;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.err.println("You must input Y or N");
                System.out.print("Enter again: ");
            }
        }
    }

    public static Product checkProductID(ArrayList<Product> lp, int id) {
        for (Product p:lp ){
            if(p.getId() == id ) {
                return p;
                
            }
        }
        return null;
        
    }
    public static boolean checkIDOrderExist(ArrayList<Order> lo, int id) {
        for (Order o : lo) {
            if (o.getId() == id) {
        return true;
        }
        }
            return false;
    }
    

}
