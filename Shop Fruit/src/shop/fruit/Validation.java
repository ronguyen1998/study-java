
package shop.fruit;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Validation {
    private static final Scanner in = new Scanner(System.in);
    
    public static int checkInputLimit(int min, int max){
        while(true ){
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                if (result <min || result>max){
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                //System.err.println("Please input number : ["+min+","+max+"]");
               // System.out.print("Enter again :");
            }
        }
    }

    public static String checkInputString() {
        while (true ){
            String result = in.nextLine().trim();
            if(result.isEmpty()){
                System.out.println("");
            }
        }
    }

   

     
}
