package btvn;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Check {

	final static Scanner sc = new Scanner(System.in);

	public static String checkInputString() {

		String rs;
		while (true) {

			rs = sc.nextLine();
			if (rs.isEmpty()) {
				System.err.println("String is can not be empty");
				System.out.print("Enter again");
			}
			return rs;
		}
	}

	public static int checkInputInt() {
		int rs;
		while (true) {
		try {
			rs = Integer.parseInt(sc.nextLine());
			return rs;
		} catch (Exception e) {
			System.err.println("Pls enter only munber");
			System.out.println("Enter again: ");
		}

	}}
	public static double checkInputDouble() {
		double rs;
		while(true) {
			try {
				rs=Double.parseDouble(sc.nextLine());
				return rs; 
			} catch (Exception e) {
				System.err.println("Pls enter Double number");
				System.out.print("Enter again");
			}
		}
		
	}
	
	public static boolean checkFormatNumberPhone(String text) {
		Pattern pattern = Pattern.compile("(09|07|05|03[2|6|8|9])+([0-9]{8})\\b");
		Matcher matcher = pattern.matcher(text);
		return (matcher.find());
	}

	public static String checkInputNumberPhone() {
		String res;
		while (true) {
			try {
				res = sc.nextLine();
				if (!checkFormatNumberPhone(res)) {
					throw new Exception();
				}

				return res;
			} catch (Exception e) {
				System.err.print("format numberphone error - please reinput numberphone");
			}
		}
	}
}
