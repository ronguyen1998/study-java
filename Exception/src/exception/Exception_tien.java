package exception;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Administrator
 */
public class Exception_tien {

    static Scanner scn = new Scanner(System.in);

    public static boolean checkFormatNumberPhone(String text) {
        Pattern pattern = Pattern.compile("(09|07|05|03[2|6|8|9])+([0-9]{8})\\b");
        Matcher matcher = pattern.matcher(text);
        return (matcher.find());
    }

    public static String checkInputNumberPhone() {
        String res;
        while (true) {
            try {
                res = scn.nextLine();
                if (!checkFormatNumberPhone(res)) {
                    throw new Exception();
                }

                return res;
            } catch (Exception e) {
                System.err.println("format numberphone error - please reinput numberphone");
            }
        }
    }
    public static void main(String[] args) {
        
    }
    
}
