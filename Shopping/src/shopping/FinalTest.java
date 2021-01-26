

package shopping;


import java.util.ArrayList;

public class FinalTest {

	public static void main(String[] args) {

		ArrayList<Clothes> lp = new ArrayList<>();
		ArrayList<Shopping> lo = new ArrayList<>();
		
	
		while (true) {
			int choice = Management.menu();
			switch (choice) {
			case 1: {
				Management.createNewClothes(lp);
				break;
			}
			case 2: {
				Management.updateClothes(lp);
				break;
			}
			case 3: {
				Management.showAllClothes(lp);
				break;
			}
			case 4: {
				Management.createNewShopping(lo, lp);
				break;
			}
			case 5: {
				
				break;
			}
			case 6: {
				Management.sortClothes(lp);
				break;
			}
			case 7: {
				Management.showAllShopping(lo);
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
