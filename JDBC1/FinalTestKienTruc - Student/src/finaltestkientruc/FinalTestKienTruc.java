
package finaltestkientruc;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FinalTestKienTruc {

    public static void main(String[] args) {
        ArrayList<Product> lp = new ArrayList<>();
        ArrayList<Order> lo = new ArrayList<>();
       
        while (true) {
            int choice = Management.menu();
            switch (choice) {
                case 1: {
                    Management.addNewProduct(lp);
                    break;
                }
                case 2: {
                    Management.updatePrice(lp);
                    break;
                }
                case 3: {
                    Management.listAllProduct(lp);
                    break;
                }
                case 4: {
                    Management.createNewOrder(lo, lp);
                    break;
                }
                case 5: {
                    Management.printOrderByID(lo);
                    break;
                }
                case 6: {
                    Management.sortProductByPrice(lp);
                    break;
                }
                case 7: {
                    Management.printOrderByCustomerID(lo);
                    break;
                }
                case 8: {
                    try {
                        Management.SaveToFile(lo);
                    } catch (IOException ex) {
                        Logger.getLogger(FinalTestKienTruc.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                }
                case 9:
                    Management.saveProductDB(lp);
                    break;
                    
                case 10:
                    return;
            }
        }
    }
}
