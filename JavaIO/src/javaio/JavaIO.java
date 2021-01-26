
package javaio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author Administrator
 */
public class JavaIO {

 
    public static void main(String[] args) {
        // TODO code application logic here
         
        try{  
            File fl = new File("ro.txt");
            
            FileWriter fw= new FileWriter(fl);
           // BufferedReader br = new BufferedReader(fr);
            String[] st = new String[3];
            st[0]="Nguyễn văn rô ";
            st[1]="lớp 16ct ";
            st[2]="study java ";
            for( int i=0; i<st.length; i++){
                fw.write(st[i]+"\n");
            }
            
            //String st = "Student are from DAU";
            //fw.write(st);
            fw.close();
            fl.exists();
            
            
            
               
            
        }catch(Exception e){
            
            e.printStackTrace();
            
        }
        try {
          // open a file to read
            File fl = new File("ro.txt");
            FileReader fr = new FileReader(fl);
            // buffer to using 
            BufferedReader br = new BufferedReader(fr);
            String st;
            while((st=br.readLine())!=null) 
            {
                System.out.println(st);;
                
            }
            br.close();
            fl.exists();
            
        } catch (Exception e) {
        }
    }
    
    //
    
    
}
