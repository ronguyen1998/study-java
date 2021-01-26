
package shop.fruit;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class Main {
    public static void main(String[] args) {
         ArrayList<Product> ls = new ArrayList<>();
         ls.add(new Product("a","bananas",1));
         ls.add(new Product("b","apple",2));
         
         while (true){
             int choice = Manager.menu();
             switch (choice){
                 case 1:
                     Manager.addproduct(ls);
                     break;
                 case 4:
                     return;
             }
         }
         
    }
    
}
