package btvn;

import java.awt.Container;
import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import org.w3c.dom.ls.LSInput;

import btvn.Doctor;

public class DoctorDriver {
	int dem=0;

	private void showInfor() {
		for (Doctor list : listDoctor) {
			System.out.println(list.toString());
		}
	}
ArrayList<Doctor> listDoctor = new ArrayList<Doctor>();

	public static void main(String[] args) {
		DoctorDriver testDemoDoctor = new DoctorDriver();
		do {
			System.out.println("___Program Manager Doctor___   ");
			System.out.println("1.Add Doctor            : ");
			System.out.println("2.Update Doctor         : ");
			System.out.println("3.Delete Doctor         : ");
			System.out.println("4.Search Doctor         : ");
			//System.out.println("5.SHOW INFORMATION DOCTOR");
			//System.out.println("6.SORT LISTDOCTOR ");
			System.out.println("0.EXIT");
			System.out.print("Enter choice          : ");
			Scanner sc = new Scanner(System.in);
			int choose = sc.nextInt();
			switch (choose) {
			case 1:
				testDemoDoctor.addDoctor();
				break;
			case 2:
				testDemoDoctor.updateDoctor();
				break;
			case 3:
				testDemoDoctor.deleteDoctor();
				break;
			case 4:
				testDemoDoctor.searchDoctor();
				break;
			case 5:
				testDemoDoctor.showInfor();
				break;
			case 6:
				testDemoDoctor.sortDoctor();
				break;
			case 0:
				System.exit(0);
			}
		} while (true);
	}
	

	private void sortDoctor() {
		Collections.sort(listDoctor);
		for (Doctor list : listDoctor) {
			System.out.println(list.toString());
		}
		
	}

	private void updateDoctor() {
		Scanner scann = new Scanner(System.in);
		//System.out.print("Nhập Mã Doctor: ");
		String code = scann.nextLine();

		for (Doctor list : listDoctor) {
			boolean iscontains = list.getCode().contains(code);
			
			if (iscontains == true) {
				System.out.print("Enter new code       : ");
				code = scann.nextLine();
				list.setCode(code);
				System.out.print("Enter New Name       : ");
				String name = scann.nextLine();
				list.setName(name);
				System.out.print("Enter Specialization : ");
				String specialization = scann.nextLine();
				list.setSpecialization(specialization);
				System.out.print("Enter Availability   : ");
				int availability = scann.nextInt();
				list.setAvailability(availability);
				System.err.println("Update  Successful");
				dem++;
			}
			}
			if(dem==0)
			{
				System.err.println("Does Not Exist!");
			}
		}
	

	private boolean deleteDoctor() {


		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Code Doctor: ");
		String code = scan.nextLine();
		
		int oldSize=listDoctor.size();
		listDoctor.removeIf(t ->code.equals(t.getCode()));
		int newSize=listDoctor.size();
		System.err.println("Delete Successful");
		return oldSize != newSize;
	}
	
	

	private void searchDoctor() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Name Doctor: ");
		String name = scan.nextLine();
		
		for (Doctor list : listDoctor) {
			
			if (name.equals(list.getName())) {
						System.out.println(list);
						dem++;
					}}
			
			if(dem==0){
				System.out.println("Does Not Exist!");
			}
		}
		

	private void addDoctor() {
		Doctor doctor = new Doctor();
		doctor.addDoctor();
		listDoctor.add(doctor);
	}

}