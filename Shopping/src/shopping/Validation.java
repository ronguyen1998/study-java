/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shopping;

import java.util.ArrayList;
import java.util.Scanner;

public class Validation {
	private final static Scanner scn = new Scanner(System.in);

	public static boolean checkChooseYN(char x) {
		return (x == 'y' || x == 'Y');
	}

	public static Double checkInputDouble() {
		Double res;
		while (true) {
			try {
				res = Double.parseDouble(scn.nextLine().trim());
				return res;
			} catch (Exception e) {
				System.err.println("Please reinput double");
			}
		}
	}

	public static int checkInputInt() {
		int res;
		while (true) {
			try {
				res = Integer.parseInt(scn.nextLine().trim());
				return res;
			} catch (Exception e) {
				System.err.println("Please reinput integer");
			}
		}
	}

	public static String checkInputString() {
		String res;
		while (true) {
			res = scn.nextLine();
			if (res.trim().equals("")) {
				System.err.println("Please enter string not empty");
			} else
				break;
		}
		return res;
	}

	public static Character checkInputCharacter() {
		String res;
		while (true) {
			try {
				res = scn.nextLine().trim();

				if (res.isEmpty() || res.length() > 1) {
					throw new Exception();
				}

				return res.charAt(0);
			} catch (Exception e) {
				System.err.println("Please re-enter character");
			}
		}
	}

	public static int checkLimitInput(int _min, int _max) {
		int choice;

		while (true) {
			try {
				choice = Integer.parseInt(scn.nextLine());
				if (choice < _min || choice > _max) {
					throw new NumberFormatException();
				}
				return choice;
			} catch (NumberFormatException e) {
				System.err.println("range received from " + _min + " to " + _max);
			}
		}
	}

	public static int autoIncreaseIdByClothes(ArrayList<Clothes> listClothes) {
		int id = 0;
		for (Clothes clothes : listClothes) {
			id = Math.max(id, clothes.getId());
		}
		return (id + 1);
	}

	public static int autoIncreaseIdByShopping(ArrayList<Shopping> listShopping) {
		int id = 0;

		for (Shopping shopping : listShopping) {
			id = Math.max(id, shopping.getId());
		}
		return (id + 1);
	}

	public static Clothes findIdOfListClothes(ArrayList<Clothes> listClothes, int id) {
		for (Clothes clothes : listClothes) {
			if (clothes.getId() == id)
				return clothes;
		}
		return null;
	}

	public static Shopping findIdOfListShopping(ArrayList<Shopping> listShopping, int id) {
		for (Shopping shopping : listShopping) {
			if (shopping.getId() == id)
				return shopping;
		}
		return null;
	}
	
	public static double getMinPriceOfClothes(ArrayList<Clothes> listClothes) {
		double minPrice = Double.MAX_VALUE;
		for (Clothes clothes : listClothes) {
			minPrice = Math.min(minPrice, clothes.getPrice());
		}
		return minPrice;
	}
}
