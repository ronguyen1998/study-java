
package doctorbtvn;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.jar.Attributes.Name;

public class Manager {
    private static String Name;
    private static Doctor doctor1;
    public static void menu() {
       System.out.println(" 1.Add a Doctor           :     ");
        System.out.println("2.Update a Doctor        :     ");
        System.out.println("3.Delete a doctor        :     ");
        System.out.println("4.Search a Doctor        :     ");
        System.out.println("5.Exit                   :     ");
        System.out.print("Enter your choice          :     ");
        int choice =Validation.checkInputIntLimit(1,5);
        
    }

	// Allow  add a doctor
	public static void adddoctor(int count, ArrayList<Doctor> ls)  {
		// gioi han so luong nguoi ( toi da 10 nguoi)
		if (count > 5) {
			System.out.print("Do you want to continue (Y/N): ");
			if (!Validation.checkInputYN()) {
				return;
			}
		}
		// loop until user input not duplicate
		while (true) {
			System.out.print("Enter code : ");
			String code = Validation.checkInputString();
			System.out.print("Enter name : ");
			String name = Validation.checkInputString();
			if (!Validation.checkCodeExist(ls, code, name)) {
				System.err.println("Already exist ! ");
				continue;
			}
			System.out.print("Enter Specialization: ");
			String specialization = Validation.checkInputString();
			System.out.print("Enter Availability: ");
			String availability = Validation.checkInputAvailability();
			if (Validation.checkDoctorExist(ls, code, name, specialization, availability)) {
				ls.add(new Doctor(code, name, specialization, availability));
				count++;
				System.err.println("Add success.");
				return;
			}
			System.err.println("___FAIL__");

		}
	}
	
//        public static void updatedoctor(ArrayList<Doctor> ls) {
//
//            System.out.print("Enter code: ");
//            String code = Validation.checkInputString();
// //check code exist or not
//            if (Validation.checkCodeExist(ls, code)) {
//            System.err.println("Not found doctor");
//            return;
//            }
//            System.out.print("Enter code: ");
//            System.out.print("Enter name doctor: ");
//            String name = Validation.checkInputString();
//            System.out.print("Enter Sspecialization: ");
//            String specialization = Validation.checkInputString();
//            System.out.print("Enter name Availability: ");
//            int availability = Validation.checkInputInt();
//                
//        //check user change infomation or not
//            if (!Validation.checkChangeInfor(doctor, code, name, specialization, availability)) {
//                System.err.println("No change");
//            return;
//            }
//            
//            doctor.setCode(codeUpdate);
//            doctor.setName(name);
//            doctor.setspecialization(specialization);
//            doctor.setAvailability(availability);
//            System.err.println("Update successful");
//            }

	public static void updatedoctor(int count, ArrayList<Doctor> ls) {
		// if list empty
		if (ls.isEmpty()) {
			System.err.println("List empty.");
			return;
		}
		System.out.print("Enter code : ");
		String code = Validation.checkInputString();
		ArrayList<Doctor> listDoctorFindByName = getListDoctorByCode(ls, code);
		// check list empty
		if (listDoctorFindByName.isEmpty()) {
			System.err.println("Not found doctor.");
			return;
		} else {
			Doctor doctor = getDoctorByListFound(listDoctorFindByName);
			System.out.print("Do you want to update (U) or delete (D) doctor: ");
			// check user want to update or delete
			if (Validation.checkInputUD()) {
				System.out.print("Enter code: ");
				String Code = Validation.checkInputString();
				System.out.print("Enter name doctor: ");
				String Name = Validation.checkInputString();
				System.out.print("Enter Specialization: ");
				String Specialization = Validation.checkInputString();
				System.out.print("Enter name Availability: ");
				String Availability = Validation.checkInputAvailability();
				// check user change or not
				if (!Validation.checkChangeInfomation(doctor, Code, Name, Specialization, Availability)) {
					System.err.println("Nothing change.");
				}
				// check doctor exist or not
				if (Validation.checkDoctorExist(ls, Code, Name, Specialization, Availability)) {
					doctor.setCode(Code);
					doctor.setName(Name);
					doctor.setSpecialization(Specialization);
					doctor.setAvailability(Availability);
					System.err.println("Update success.");
				}
				return;
			} else {
				ls.remove(doctor);
				count--;
				System.err.println("Delete success.");
				return;
			}
		}
	}
//        public static void deletedoctor(ArrayList<Doctor> ls) {
//        System.out.print("Enter code: ");
//        String Code = Validation.checkInputString();
//	System.out.print("Enter name doctor: ");
//	String Name = Validation.checkInputString();
//	System.out.print("Enter Specialization: ");
//	String Specialization = Validation.checkInputString();
//	System.out.print("Enter name Availability: ");
//	String Availability = Validation.checkInputAvailability();
//				// check user change or not
//            if (Validation.checkChangeInformation(Doctor, Code, Name, Specialization, Availability)) {
//				} else {
//                System.err.println("Nothing change.");
//        }
//				// check doctor exist or not
//            if (Validation.checkDoctorExist(ls, Code, Name, Specialization, Availability)) {
//		Doctor.setCode(Code);
//		doctor.setName(Name);
//		doctor.setSpecialization(Specialization);
//		doctor.setAvailability(Availability);
// //Students write here appropriate statements to complete this function
//                System.err.println("Delete successful.");
//                    }
//        }
//
//
//    
//    

	// Get doctor user want to update/delete in list found
	public static Doctor getDoctorByListFound(ArrayList<Doctor> listDoctorFindByName) {
		System.out.println("List doctor found: ");
		int count = 1;
		System.out.printf("%-10s%-15s%-15s%-15s\n", "Number", "Doctor name", "specialization", "Course Name");
		// display list doctor found
		for (Doctor doctor : listDoctorFindByName) {
			System.out.printf("%-10d%-15s%-15s%-15s\n", count, doctor.getName(),
                                doctor.getSpecialization(),
				doctor.getAvailability());
			count++;
		}
		System.out.print("Enter doctor: ");
		int choice = Validation.checkInputIntLimit(1, listDoctorFindByName.size());
		return listDoctorFindByName.get(choice - 1);
	}
        // Tim kiem va sap xep theo ten
	public static void search(ArrayList<Doctor> ls) { {
		// check rong
		if (ls.isEmpty()) {
			System.err.println("List empty.");
			return;
		}
		ArrayList<Doctor> listDoctorFindByName = listDoctorFindByName(ls);
		if (listDoctorFindByName.isEmpty()) {
			System.err.println("Not exist.");
		} else {
			Collections.sort(listDoctorFindByName);
			System.out.printf("%-15s%-15s%-15s\n", "Doctor name", "specialization", "Course Name");
			for (Doctor doctor : listDoctorFindByName) {
				doctor.print();
			}
		}
	}

 //Tim kiem ten
	public static ArrayList<Doctor> listFoundByName(ArrayList<Doctor> ls, String name) {
        ArrayList<Doctor> listFoundByName = new ArrayList<>();
            for (Doctor doctor : ls) {
            if (doctor.getName().contains(name)) {
                listFoundByName.add(doctor);
            }
            }
            return listFoundByName;
        }
 }

	 //Get list doctor find by id
	public static Doctor getDoctorByCode(ArrayList<Doctor> ls, String code) {
 for (Doctor doctor : ld) {
 if (doctor.getCode().equalsIgnoreCase(code)) {
 return doctor;
 }
 }
 return null;
 }

            
            }
        }
}
        

            

