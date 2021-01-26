package doctor;

import static doctor.Main.ThongTin;


public class Doctor implements  Comparable<Doctor>{
    private String code;
    private String Name;
    private  String Specialization;
    private int Availability;
    
    public Doctor(String code, String Name, String Specialization, int Availability ) {
        this.code = code;
        this.Name = Name;
        this.Specialization = Specialization;
        this.Availability = Availability;
        
    }
    public Doctor() {
        
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getSpecialization() {
        return Specialization;
    }

    public void setSpecialization(String Specialization) {
        this.Specialization = Specialization;
    }

    public int getAvailability() {
        return Availability;
    }

    public void setAvailability(int Availability) {
        this.Availability = Availability;
    }

    @Override
    public String toString() {
        return "Doctor{" + "code=" + code + ", Name=" + Name + ", Specialization=" + Specialization + ", Availability=" + Availability + '}';
    }
  
    public Doctor enterData(){
        Doctor rs;
        System.out.println("Enter code:  ");
        String c = Validation.checkInputString();
        System.out.println("Name:  ");
        String n = ThongTin.nextLine();
        System.out.println("Specilization:  ");
        String s = ThongTin.nextLine();
        System.out.println("Availability: ");
        int a = Validation.checkInputInt();
        ThongTin.nextLine();
        rs = new Doctor(c , n, s, a );
        return rs;
    }

    @Override
    public int compareTo(Doctor o) {
        return this.Name.compareTo(o.Name);
    }
}
