package btvndoctor;

import static java.lang.System.in;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author NGUYENVANRO
 */
public class Validation {
    private final static Scanner in = new Scanner(System.in);
    
    
    public static int checkInputIntLimit(int min, int max){ 
        while (true){
            try{
                int result = Integer.parseInt(in.nextLine().trim());
                if(
                        result< min || result> max ){
                    throw new NumberFormatException();
                }
                return result;
                }
            catch (NumberFormatException e ){
                System.err.println("Please input number in range [" +min+ ","  +max+"]");
                System.out.println("Enter again : ");
            }
                    }
    }

    public static String checkInputString() {
   
        while(true ){
            String result = in.nextLine().trim();
            if(result.isEmpty()){
            System.err.println("Not empty ");
            System.out.print("Enter again ");
        }else
        {
            return result;
        }   
    } 
 }
    public static boolean checkInputYN(){
        while(true){
            String result = checkInputString();
            
            if(result.equalsIgnoreCase("Y ")){
                return true;
            }
            if(result.equalsIgnoreCase("N ")){
                return false;
            }
            System.err.println("please input y/Y or n/N");
            System.out.print("Enter agian :");    
        }
    }

    static int checkInputInt() {
        while (true){
            try{
                int result = Integer.parseInt(in.nextLine());
                return result;
            }catch (Exception e){
                System.err.println("Please input number:  ");
                System.out.print("Enter again:          ");
            }
        }
}

    static boolean checkIdExist(ArrayList<BtvnDoctor> dt, String code, String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static String checkInputAvailability() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static boolean checkBtvnDoctorExist(ArrayList<BtvnDoctor> dt, String code, String name, String specialization, String availability) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static boolean checkInputUD() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static String checkInputavaialability() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static boolean checkChangeInfomation(BtvnDoctor btvnDoctor, String code, String name, String specialiazation, String avaialability) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
        
        
    

   
    



