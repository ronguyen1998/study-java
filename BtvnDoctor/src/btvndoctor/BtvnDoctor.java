package btvndoctor;
/**
 *
 * @author NGUYENVANRO
 */
public class BtvnDoctor {
    private String Code;
    private String Name;
    private String Specialization;
    private int Availability;

    public BtvnDoctor(){
        
    }
    public BtvnDoctor(String Code, String Name, String Specialization, int Availability) {
        this.Code = Code;
        this.Name = Name;
        this.Specialization = Specialization;
        this.Availability = Availability;
    }
    
    public String getCode() {
        return Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
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
        return "BtvnDoctor{" + "Code=" + Code + ", Name=" + Name + ", Specialization=" + Specialization + ", Availability=" + Availability + '}';
    }
    BtvnDoctor(String code, String name, String specialiazation, String availability) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       
}
