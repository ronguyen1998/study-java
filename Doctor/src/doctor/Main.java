package doctor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
   
    static  final Scanner ThongTin = new Scanner(System.in);
    public static void main(String[] args) {
        Doctor rs;
        System.out.println("Enter code ");
        String c = Validation.checkInputString();
        System.out.println("Name ");
        String n = ThongTin.nextLine();
        System.out.println("Specilization ");
        String s = ThongTin.nextLine();
        System.out.println("Availability ");
        int a = ThongTin.nextInt();
        ThongTin.nextLine();
        rs = new Doctor(c , n, s, a );
        //System.out.println(doc);
        
        List <Doctor> arrDoc = new ArrayList <Doctor>();
        
        Doctor doc = new Doctor();
        
        for( int i=0; i<2; i++){
            System.out.println(" Enter doc :" +i);
            Doctor d = doc.enterData();
            arrDoc.add(d);
        
        
        }
        System.out.println(arrDoc);
    
   while (true){
    int choice = Manager.menu();
    switch(choice){
        case 1:
            Manager.createDoctor(arrDoc);
            break;
        case 2: 
            Manager.updateDoctor(arrDoc);
            break;
        case 3:
            Manager.deleteDoctor(arrDoc);
            break;
        case 4:
            Manager.searchDoctor(arrDoc);
            break;
        case 5:
            return;
    }
}
}
}
