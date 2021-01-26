package btvndoctor;

import com.sun.org.apache.bcel.internal.classfile.Code;
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.util.ArrayList;
import java.util.jar.Attributes.Name;

/**
 *
 * @author NGUYENVANRO
 */
public class Manager {
    private static int count;
    private static ArrayList<BtvnDoctor> btvnDoctorFindByName;

    public static int menu() {
        System.out.println("1.Add a Doctor    ");
        System.out.println("2.Show Doctor     ");
        System.out.println("3.Update a Doctor ");
        System.out.println("4.Delete a Doctor ");
        System.out.println("5.Search a Doctor ");
        System.out.println("6.Exit            ");
        System.out.print("Enter your choice:  ");
        int choice =Validation.checkInputIntLimit(1,6);
        return choice;
    }
    
    public static void createDoctor(ArrayList<BtvnDoctor> dt) {
		// gioi han so luong nguoi ( toi da 10 nguoi)
		if (count > 10) {
			System.out.print("Do you want to continue (Y/N): ");
			if (!Validation.checkInputYN()) {
				return;
			}
		}
		// loop until user input not duplicate
		while (true) {
			System.out.print("Enter code Doctor: ");
			String code = Validation.checkInputString();
			System.out.print("Enter Name: ");
			String name = Validation.checkInputString();
			if (!Validation.checkIdExist(dt,code, name)) {
                            System.err.println("Da ton tai");
                            continue;
                        } else {
                        }
			System.out.print("Enter Specialization: ");
			String specialization = Validation.checkInputString();
			System.out.print("Enter Availability: ");
			String availability = Validation.checkInputAvailability();
			if (Validation.checkBtvnDoctorExist(dt, code, name, specialization, availability)) {
				dt.add(new BtvnDoctor( code, name, specialization, availability));
				count++;
				System.err.println("ADD success.");
				return;
			}
			System.err.println("FAIL.");

		}
	}    
    

    public static void printAllDoctor(ArrayList<BtvnDoctor> dt) {
        System.out.printf("%-5s%-25s%-20s%-20s%-20s%-20s%-20s\n","code","Name","Specialization","Availability");
        for(BtvnDoctor btvndoctor:dt){
            System.out.printf("%-5d%-25s%-20s%-20s%-20s%-20s%-20s\n",
                    btvndoctor.getCode(),btvndoctor.getName(),
                    btvndoctor.getSpecialization(), btvndoctor.getAvailability());
        }
    }

    public static void updateOrDelete(int count, ArrayList<BtvnDoctor> dt) {
		// if list empty
		if (dt.isEmpty()) {
			System.err.println("List empty.");
			return;
		}
		System.out.print("Enter code: ");
		String code = Validation.checkInputString();
		ArrayList<BtvnDoctor> listStudentFindByName = getListStudentById(dt, code);
		// check list empty
		if (btvnDoctorFindByName.isEmpty()) {
			System.err.println("Not found doctor.");
			return;
		} else {
			BtvnDoctor btvnDoctor = getBtvnDoctorByListFound(btvnDoctorFindByName);
			System.out.print("Do you want to update (U) or delete (D) student: ");
			// check user want to update or delete
			if (Validation.checkInputUD()) {
				System.out.print("Enter code: ");
				String idStudent = Validation.checkInputString();
				System.out.print("Enter name Doctor: ");
				String name = Validation.checkInputString();
				System.out.print("Enter specialiazation: ");
				String specialiazation = Validation.checkInputString();
				System.out.print("Enter name Avaialability: ");
				String avaialability = Validation.checkInputavaialability();
				// check user change or not
				if (!Validation.checkChangeInfomation(btvnDoctor, code, name, specialiazation, avaialability)) {
					System.err.println("Nothing change.");
				}
				// check student exist or not
				if (Validation.checkBtvnDoctorExist(dt, code, name, specialiazation, avaialability))) {
					btvnDoctor.setCode(code);
					btvnDoctor.setName(name);
					btvnDoctor.setSpecialization(specialiazation);
                                        btvnDoctor.setAvailability(avaialability);
					System.err.println("Update success.");
				}
				return;
			} else {
				ls.remove(student);
				count--;
				System.err.println("Delete success.");
				return;
			}
		}
	}
    

    public static ArrayList<BtvnDoctor> BtvnDoctorFindByName(ArrayList<BtvnDoctor> dt) {
		ArrayList<BtvnDoctor> btvnDoctorFindByName = new ArrayList<>();
		System.out.print("Enter name to search: ");
		String name = Validation.checkInputString();
		for (BtvnDoctor btvnDoctor:dt) {
			if (btvnDoctor.getCode().contains(name)) {
				btvnDoctorFindByName.add(btvnDoctor);
			}
		}
		return btvnDoctorFindByName;
	}


    private static BtvnDoctor getBtvnDoctorByCode(ArrayList<BtvnDoctor> dt, String codeDelete) {
        for(BtvnDoctor btvnDoctor:dt){
            if(btvnDoctor.getCode()==codeDelete){
                return btvnDoctor;
            }
        }
        return null;
    }

    private static ArrayList<BtvnDoctor> getListStudentById(ArrayList<BtvnDoctor> dt, String code) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static BtvnDoctor getBtvnDoctorByListFound(ArrayList<BtvnDoctor> listStudentFindByName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static void updateorDeleteDoctor(ArrayList<BtvnDoctor> dt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
