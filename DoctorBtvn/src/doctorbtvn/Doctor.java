
package doctorbtvn;

public class Doctor implements  Comparable<Doctor>{

    static void setspecialization(String specialization) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
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

    Doctor(String code, String name, String specialization, String availability) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
  
   
    @Override
    public int compareTo(Doctor o) {
        return o.Name.compareTo(this.Name);
    }
    public void print() {
		System.out.printf("%-15s%-15s%-15s\n", Name,Specialization,Availability);
	}

    void setAvailability(String availability) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Object getDoctorName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

