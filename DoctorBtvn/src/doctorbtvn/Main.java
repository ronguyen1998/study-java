
package doctorbtvn;

/**
 *
 * @author Administrator
 */

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Doctor> ls = new ArrayList<>();
		Validation validation = new Validation();
		ls.add(new Doctor("1", "NGUYEN VAN RO ","ABC", 1));
		ls.add(new Doctor("2", "NGUYEN VAN ba ","cde", 2));
                ls.add(new Doctor("3", "NGUYEN thi cu ","def", 3));
		int count = 3;
		// loop until user want to exit program
		while (true) {
			// Show menu option
			Manager.menu();
			int choice = Validation.checkInputIntLimit(1,5);
			switch (choice) {
			case 1:
				Manager.adddoctor(count, ls);
				break;
			case 2:
				Manager.updatedoctor(count, ls);
				break;
			case 3:
				Manager.deletedoctor(ls);
				break;
                        case 4: 
                                Manager.searchdoctor(ls);             
			case 5:
				return;
			}

		}
	}
}

