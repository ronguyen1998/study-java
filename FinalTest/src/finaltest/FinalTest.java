package finaltest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FinalTest {

    
    public static void main(String[] args) {

        ArrayList<Product> lp = new ArrayList<>();
        ArrayList<Oder> lo = new ArrayList<>();

        while (true) {
            int choice = Management.menu();
            switch (choice) {
                case 1: {
                    lp.add(Management.addNewProduct(lp));
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
                    lo.add(Management.createNewOrder(lo, lp));
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
                case 8:{
                    Management.exportInformation(lo);
                    break;
                }


                case 9:
                    return;
            }
        }
    }
}
