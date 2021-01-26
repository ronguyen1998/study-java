// nhap vao 2 so THUC , try - catch kiem tra so nhap vao co phai la so thuc
// kiem tra co phai la so chia 
package exception;

import java.util.Scanner;


public class Exception1 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("so bia chia : ");
        int soBiChia = sc.nextInt();
        System.out.print("so chia ");
        int soChia = sc.nextInt();
        int ketQua = soBiChia/soChia;
        System.out.printf("\nResult:%d/%d=%d\n" ,soBiChia, soChia,ketQua);
        
    }
    
}
