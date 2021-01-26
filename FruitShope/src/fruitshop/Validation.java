/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fruitshop;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Validation {
    
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
    
}
