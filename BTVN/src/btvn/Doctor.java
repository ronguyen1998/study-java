package btvn;

import java.util.ArrayList;
import java.util.Scanner;
import btvn.Check;

public class Doctor implements Comparable<Doctor> {
	private String code;
	private String name;
	private String specialization;
	private int availability;
	//private double test;
	//private String phone;
	
	

//	public Doctor(String phone) {
//		super();
//		this.phone = phone;
//	}

//	public String getPhone() {
//		return phone;
//	}

//	public void setPhone(String phone) {
//		this.phone = phone;
//	}
//
//	public Doctor(double test) {
//		super();
//		this.test = test;
//	}
//
//	public double getTest() {
//		return test;
//	}

//	public void setTest(double test) {
//		this.test = test;
//	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public int getAvailability() {
		return availability;
	}

	public void setAvailability(int availability) {
		this.availability = availability;
	}

    public Doctor(String code, String name, String specialization, int availability) {
        this.code = code;
        this.name = name;
        this.specialization = specialization;
        this.availability = availability;
    }
    
	public Doctor() {

	}
       
	public void addDoctor() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Code Doctor: ");
		code=Check.checkInputString();
		System.out.print("Enter Name Doctor: ");
		name =Check.checkInputString();
		System.out.print("Enter Specialization: ");
		specialization = Check.checkInputString();
		System.out.print("Enter Availability: ");
		availability = Check.checkInputInt();
//		System.out.println("Nhap So Test");
//		test=CheckInput.checkInputDouble();
//		System.out.println("Nhập Số Phone");
//		phone=CheckInput.checkInputString();
		//System.out.print("Nhập Số Phone");
		//phone=CheckInput.checkInputNumberPhone();
		System.err.print("Add sucsessful !\n");
		
	}
	public int compareTo(Doctor o)
	{
		return this.name.compareTo(o.name);
	}
}