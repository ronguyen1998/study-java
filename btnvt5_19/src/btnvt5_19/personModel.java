package btnvt5_19;

import btnvt5_19.Employee;
import java.util.ArrayList;


public class personModel<t> {
    public ArrayList<t> ls = new ArrayList<t>();
    public void addObject(t obj) 
    {
        ls.add(obj);
    }
    public void display(){
        for(t dp:ls){
            System.out.println(dp);
        }
    }
   
    public static void main(String[] args) {
        personModel<Student> a = new personModel<Student>();
        a.addObject(new Student (" Sv1 ", " nguyen van ro","1"));
        a.addObject(new Student (" Sv2 ", " nguyen van teo","22"));
        a.display();
        System.out.println();
        
        personModel<Employee> b = new personModel<Employee>();
        b.addObject(new Employee(1 , " nguyen thi a",19));
        b.addObject(new Employee(2 , " nguyen van b",22));
        b.display();
        System.out.println();
        
        personModel<String> string = new personModel<String>();
        string.addObject(new String (" nguyen van ro"));
        string.addObject(new String (" nguyen van teo"));
        string.display();
        
    }
    
}