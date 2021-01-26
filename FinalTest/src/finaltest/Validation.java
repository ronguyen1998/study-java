
package finaltest;

import static java.lang.System.in;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Validation {

    private static final Scanner in = new Scanner(System.in);
    static Scanner scanner = new Scanner(System.in);
    static Scanner temp = new Scanner(System.in);

    public static String checkStringInput() {
        String input;
        while (true) {
            input = scanner.nextLine();
            if (input.isEmpty()) {
                System.err.println("Ko dung !");
                System.out.print("Nhap lai: ");
            } else {
                return input;
            }

        }
    }

    public static int checkIntInput() {
        while (true) {
            try {
                int check;
                check = Integer.parseInt(scanner.nextLine());
                return check;
            } catch (Exception e) {
                System.out.print("Only Number, Again: ");
            }
        }
    }

    public static int checkInputLimit(int min, int max) {
        while (true) {
            try {
                int result = temp.nextInt();
                if (result < min || result > max) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number in rage [" + min + "]" + "[" + max + "]" + "Again !");
                System.out.print("Enter your choice: ");
            }
        }
    }

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

    public static boolean checkCodeProduct(ArrayList<Product> o, int code) {
        for (Product pd : o) {
            if (pd.getId() == code) {
                return false;
            }
        }
        return true;
    }

    public static Product getProduct(ArrayList<Product> o, int code) {
        for (Product pd : o) {
            if (pd.getId() == code) {
                return pd;
            }
        }
        return null;
    }

    public static int autoIncreaseIDProduct(ArrayList<Product> lp) {
        int max = 0;
        for (Product p : lp) {
            if (max < p.getId()) {
                max = p.getId();
            }
        }
        return max + 1;
    }

    public static int autoIncreaseIDCus(ArrayList<Oder> lo) {
        int max = 0;
        for (Oder o : lo) {
            if (max < o.getId()) {
                max = o.getId();
            }
        }
        return max + 1;
    }

    public static int autoIncreaseIDOder(ArrayList<Oder> lo) {
        int max = 0;
        for (Oder o : lo) {
            if (max < o.getId()) {
                max = o.getId();
            }
        }
        return max + 1;
    }

    public static boolean checkCodeOder(ArrayList<Oder> o, int code) {
        for (Oder od : o) {
            if (od.getId() == code) {
                return false;
            }
        }
        return true;
    }

    public static Oder getOder(ArrayList<Oder> o, int code) {
        for (Oder od : o) {
            if (od.getId() == code) {
                return od;
            }
        }
        return null;
    }

    public static boolean checkCodeCus(ArrayList<Oder> o, int code) {
        for (Oder od : o) {
            if (od.getId() == code) {
                return false;
            }
        }
        return true;
    }
}
