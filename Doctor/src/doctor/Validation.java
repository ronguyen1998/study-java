package doctor;

import static doctor.Main.ThongTin;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
    public static String checkInputString(){
        String rs;
        while (true){
            
        rs= ThongTin.nextLine();
        if (rs.isEmpty()){
        System.out.println("String can not be empty : ");
        System.out.println("Enter again :");
        }
        else
    {
        return rs;
    }  
        }  
    }
    public static int checkInputInt(){
        int rs;
        while (true){
            try{
        rs = Integer.parseInt(ThongTin.nextLine() );
        return rs;
    }
    catch (Exception e )
    {
        System.out.println("please enter a interger number only :");
        System.out.println("enter again : ");
              
        
    }
   }

 }
    public static boolean checkFormatNumberPhone(String text) {
		Pattern pattern = Pattern.compile("(09|07|05|03[2|6|8|9])+([0-9]{8})\\b");
		Matcher matcher = pattern.matcher(text);
		return (matcher.find());
	}
 static Scanner scn = new Scanner(System.in);
	public static String checkInputNumberPhone() {
		String res;
		while (true) {
			try {
				res = scn.nextLine();
				if (!checkFormatNumberPhone(res)) {
					throw new Exception();
				}

				return res;
			} catch (Exception e) {
				System.err.println("format numberphone error - please reinput numberphone");
			}
		}
	}
}


