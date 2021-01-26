package sinhvien;

import java.io.Serializable;


public class SinhVien implements Serializable{

   private String Name;
   private int age;
   
   public SinhVien(){
       
   }

    public SinhVien(String Name, int age) {
        this.Name = Name;
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
   
  
}
