
package FinalTest;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

class Management {

	public static int menu() {
		System.out.println("1. Add a new product to the Store.");
		System.out.println("2. Update price for a particular product");
		System.out.println("3. A list of all available products in the Store");
		System.out.println("4. Create a new Order");
		System.out.println("5. Printf information of an Order by OrderID");
		System.out.println("6. Sort all products by product price as ascending");
		System.out.println("7. Print information of all Orders by a specific customer ID");
		System.out.println("8. Print information of all Orders to the text file.");
		System.out.println("9. Save product to Database");
		System.out.println("10. Exit");
		System.out.print("Seclect your choice: ");
		int choice = Validation.checkInputIntLimit(1, 10);
		return choice;
	}

	// -------------Function for Product-----------------//
	public static void addNewProduct(ArrayList<Product> lp) {
		int id = Validation.autoIncreaseIDProduct(lp);
		System.out.println("Enter Product Name: ");
		String name = Validation.checkInputString();
		System.out.println("Enter Product Price: ");
		double price = Validation.checkInputDouble();
		lp.add(new Product(id, name, price));

	}

	public static void listAllProduct(ArrayList<Product> lp) {
		System.out.printf("%-5s%-20s%-5s\n", "ID", "name", "Price");
		for (Product p : lp) {
			System.out.printf("%-5s%-20s%-5s\n", p.getId(), p.getName(), p.getPrice());
		}
	}

	public static void UpdateProduct(ArrayList<Product> lp) {
		System.out.print("Nhap ID Product: ");
		int id = Validation.checkInputInt();

		Product productUpdate = Validation.checkProductID(lp, id);
		if (productUpdate != null) {
			System.out.print("Nhap Price Moi: ");
			double price = Validation.checkInputDouble();
			productUpdate.setPrice(price);
			System.err.println("Update Successful");
		}else
			System.err.println("Update Failed");

	}

	public static void creaNewOder(ArrayList<Order> lo, ArrayList<Product> lp) {
		int id = Validation.autoIncreaseIDOrder(lo);
		LocalDate date = LocalDate.now();
		System.out.print("Nhap Ten Khach Hang:");
		String name = Validation.checkInputString();
		System.out.print("Nhap Dia Chi Nguoi Khach Hang:");
		String address = Validation.checkInputString();
		System.out.println("Nhap CID Khach Hang: ");
		int cid = Validation.checkInputInt();

		Order o = new Order(id, date, name, address, cid, lp);
		lo.add(o);
	}

	public static void printInformationOrder(ArrayList<Order> lo) {
		System.out.println("nhap iD");
		int id = Validation.checkInputInt();
		
		Order order = Validation.checkOrderID(lo, id);
		if(order != null) {
			System.out.println(order.toString());
		}else
			System.out.println("ID not found");
	}

	public static void sortProductByProductPrice(ArrayList<Product> lp) {
		Collections.sort(lp);

		listAllProduct(lp);
	}
	
	public static void printInformationOrderByCustomerID(ArrayList<Order> lo) {
		for (Order order : lo) {
			System.out.println(order.toString());
		}
	}

}
