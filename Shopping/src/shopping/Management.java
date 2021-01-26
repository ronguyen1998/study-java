/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shopping;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Management {

	public static int menu() {
		System.out.println("1. Add a new Clothes to the Store.");
		System.out.println("2. Update price and quantity for a particular Clothes ");
		System.out.println("3. A list of all available Clothes in the Store");
		System.out.println("4. Create a new Shopping");
		System.out.println("5. Print information of Clothes that haved minimum Price");
		System.out.println("6. Sort all Clothes by Clothes ID as ascending ");
		System.out.println("7.Print information of all Shopping by a specific customer ID");
		System.out.println("8.. Export information of a specific Shopping ID to text file.");
		
		System.out.print("Seclect your choice: ");
		int choice = Validation.checkLimitInput(1, 9);
		return choice;
	}

	// 1
	public static Clothes newClothes(ArrayList<Clothes> listClothes) {
		int id = Validation.autoIncreaseIdByClothes(listClothes);
		System.out.print("Enter name clothes: ");
		String name = Validation.checkInputString();
		System.out.print("Enter price clothes: ");
		double price = Validation.checkInputDouble();
		System.out.print("Enter quantity clothes: ");
		int quantity = Validation.checkInputInt();

		return new Clothes(id, name, price, quantity);
	}

	public static void createNewClothes(ArrayList<Clothes> listClothes) {
		boolean flag = listClothes.add(newClothes(listClothes));

		if (flag)
			System.err.println("Add success!!!");
		else
			System.err.println("Add failed!!!");
	}

	// 3
	public static Shopping newShopping(ArrayList<Shopping> listShopping, ArrayList<Clothes> listClothes) {
		int id = Validation.autoIncreaseIdByShopping(listShopping);
		LocalDate dateNow = LocalDate.now();

		System.out.print("Enter name: ");
		String name = Validation.checkInputString();
		System.out.print("Enter address: ");
		String address = Validation.checkInputString();

		ArrayList<Clothes> shoppingClothes = new ArrayList<>();
		showAllClothes(listClothes);

		char choiceYN = 'n';
		int choice;
		do {
			System.out.print("Enter clothes ID: ");
			choice = Validation.checkInputInt();

			Clothes clothes = Validation.findIdOfListClothes(listClothes, choice);
			if (clothes != null) {
				System.out.println("Enter quantity: ");
				int quantity = Validation.checkInputInt();

				if (quantity <= clothes.getQuantity()) {
//					Clothes clothesShopping = (Clothes) clothes.clone();
//					clothesShopping.setQuantity(quantity);
//					clothes.setQuantity(clothes.getQuantity() - quantity);
//					shoppingClothes.add(clothesShopping);

					if (clothes.getQuantity() == 0)
						listClothes.remove(clothes);
				} else {
					System.err.println("quantity in store is not enough");
				}
			} else {
				System.err.println("id you choice not found");
			}

			System.out.println("Do you want to continue shopping? (Y/N)");
			choiceYN = Validation.checkInputCharacter();

		} while (Validation.checkChooseYN(choiceYN));

		return new Shopping(id, name, address, dateNow, shoppingClothes);
	}

	public static void createNewShopping(ArrayList<Shopping> listShopping, ArrayList<Clothes> listClothes) {
		boolean flag = listShopping.add(newShopping(listShopping, listClothes));
		if (flag)
			System.err.println("Add success!!!");
		else
			System.err.println("Add failed!!!");
	}
//3
	public static void updateClothes(ArrayList<Clothes> listClothes) {
		if (listClothes.isEmpty())

		{
			System.err.println("list clothes is empty");
			return;
		}

		showAllClothes(listClothes);
		System.out.print("Enter id update: ");
		int id = Validation.checkInputInt();

		Clothes clothes = Validation.findIdOfListClothes(listClothes, id);
		if (clothes != null) {
			System.out.print("Enter new price: ");
			double priceNew = Validation.checkInputDouble();

			System.out.println("Enter new quantity: ");
			int quantityNew = Validation.checkInputInt();

			clothes.setPrice(priceNew);
			clothes.setQuantity(quantityNew);
			System.err.println("Update success!!!");
		} else
			System.err.println("Update failed!!!");
	}
//4
	public static void showAllClothes(ArrayList<Clothes> listClothes) {
		for (Clothes clothes : listClothes) {
			System.out.println(clothes.toString());
		}
	}
	//6
	public static void sortClothes(ArrayList<Clothes> listClothes) {
		Collections.sort(listClothes);
		System.err.println("sort success");
	}
	//7
	public static void showAllShopping(ArrayList<Shopping> sp) {
		for (Shopping shopping : sp) {
			System.out.println(shopping.toString());
		}
	}

    static int menu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}

