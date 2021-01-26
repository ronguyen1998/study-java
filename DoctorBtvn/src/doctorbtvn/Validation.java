
package doctorbtvn;
import java.util.ArrayList;
import java.util.Scanner;

public class Validation {
	private final static Scanner in = new Scanner(System.in);

    //check user input number limit
    public static int checkInputIntLimit(int min, int max) {
        //loop until user input correct
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();

                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number in rage [" + min + ", " + max + "]");
                System.out.print("Enter again: ");
            }
        }
    }

    //check user input string
    public static String checkInputString() {
        //loop until user input correct
        while (true) {
            String result = in.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty");
                System.out.print("Enter again: ");
            } else {
                return result;
            }
        }
    }

    //check user input yes/ no
    public static boolean checkInputYN() {
        //loop until user input correct
        while (true) {
            String result = checkInputString();
            //return true if user input y/Y
            if (result.equalsIgnoreCase("Y")) {
                return true;
            }
            //return false if user input n/N
            if (result.equalsIgnoreCase("N")) {
                return false;
            }
            System.err.println("Please input y/Y or n/N.");
            System.out.print("Enter again: ");
        }
    }

    //check user input u / d
    public static boolean checkInputUD() {
        //loop until user input correct
        while (true) {
            String result = checkInputString();
            //return true if user input u/U
            if (result.equalsIgnoreCase("U")) {
                return true;
            }
            //return false if user input d/D
            if (result.equalsIgnoreCase("D")) {
                return false;
            }
            System.err.println("Please input u/U or d/D.");
            System.out.print("Enter again: ");
        }
    }

    //check user input course
    public static String checkInputAvailability() {
        //loop until user input correct
        while (true) {
            String result = checkInputString();
            //check input course in java/ .net/ c/c++
            if (result.equalsIgnoreCase("java")
                    || result.equalsIgnoreCase(".net")
                    || result.equalsIgnoreCase("c/c++")) {
                return result;
            }
            System.err.println("There are only three courses: Java, .Net, C/C++");
            System.out.print("Enter again: ");
        }
    }

    //check doctor exist
    public static boolean checkDoctorExist(ArrayList<Doctor> ls, String id,
            String doctorName, String semester, String courseName) {
        int size = ls.size();
        for (Doctor doctor : ls) {
            if (id.equalsIgnoreCase(doctor.getCode())
                    && doctorName.equalsIgnoreCase(doctor.getDoctorName())
                    && semester.equalsIgnoreCase(doctor.getSemester())
                    && courseName.equalsIgnoreCase(doctor.getCourseName())) {
                return false;
            }
        }
        return true;
    }

    //check report exist
//    public static boolean checkReportExist(ArrayList<Report> lr, String name,
//            String course, int total) {
//        for (Report report : lr) {
//            if (name.equalsIgnoreCase(report.getDoctorName())
//                    && course.equalsIgnoreCase(report.getCourseName())
//                    && total == report.getTotalCourse()) {
//                return false;
//            }
//        }
//        return true;
//    }

    //check id and exist
    public static boolean checkCodeExist(ArrayList<Doctor> ls, String code, String name) { {
        for (Doctor doctor : ls) {
            if (code.equalsIgnoreCase(doctor.getCode())
                    && !name.equalsIgnoreCase(doctor.getName())) {
                return false;
            }
        }
        return true;
    }

    //check user change or not
    public static boolean checkChangeInfomation(Doctor doctor, String code,
            String name, String specialization, String availability) {
        if (code.equalsIgnoreCase(doctor.getCode())
                && name.equalsIgnoreCase(doctor.getName())
                && specialization.equalsIgnoreCase(doctor.getSpecialization()
                && availability.equalsIgnoreCase(doctor.getAvailability())) {
            return false;
        }
        return true;
    }

    static int checkInputInt() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static boolean checkCodeExist(ArrayList<Doctor> ls, String code) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static boolean checkChangeInfomation(Doctor doctor, String Code) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static boolean checkDoctorExist(ArrayList<Doctor> ls, String Code) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    }

    
}
