package FinalTest;

import java.util.ArrayList;

public class FinalTest {

	public static void main(String[] args) {

		ArrayList<Product> lp = new ArrayList<>();
		ArrayList<Order> lo = new ArrayList<>();
		
	//	lp.add(new Product(1, "a", 3.0));
	//	lo.add(new Order(1,null, "b", null, 0, lp));
		while (true) {
			int choice = Management.menu();
			switch (choice) {
			case 1: {
				Management.addNewProduct(lp);
				break;
			}
			case 2: {
				Management.UpdateProduct(lp);
				break;
			}
			case 3: {
				Management.listAllProduct(lp);
				break;
			}
			case 4: {
				Management.creaNewOder(lo, lp);
				break;
			}
			case 5: {
				Management.printInformationOrder(lo);
				break;
			}
			case 6: {
				Management.sortProductByProductPrice(lp);
				break;
			}
			case 7: {
				Management.printInformationOrderByCustomerID(lo);
				break;
			}
			case 8: {

				break;
			}
			case 9:

				break;

			case 10:
				return;
			}
		}
	}
}
