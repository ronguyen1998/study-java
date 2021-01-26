package javadb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;


public class JavaDB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // open database 
        // send statment  to db
        // recive result 
        
        // 1 open database connection 
        try {
            String conectionURL  = "jdbc:derby://localhost:1527/MyProductDAU" ;
            // get connection
        Connection conn = DriverManager.getConnection(conectionURL,"ro","123");
        // insert a record 
            Scanner input = new Scanner(System.in);
            System.out.println("enter product id   : ");
            int id = input.nextInt();
            System.out.println("enter product name : ");
            input.nextLine();
            String name = input.nextLine();
            System.out.println("enter product price : ");
            double price = input.nextDouble();
            
            // sen insert sql
            String sqlInsert = "insert into Product values ( ? , ?, ?  )";
            PreparedStatement ps =conn.prepareStatement(sqlInsert);
            ps.setInt(1,id);
            ps.setString(2, name);
            ps.setDouble(3, price);
             if(
                     ps.executeUpdate()!=0){
                 System.out.println("Add Product to DB successfully ");
             }
             String sqlSelect ="Select*from product ";
            // Statement st = st.executeQuery(sqlSelect);
             //Result rs 
        
        } catch (Exception e) {
            System.out.println(" "+e);
        }
        
        
    }
    
}
