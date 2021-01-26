package sinhvien;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class Object {
    public static void main(String[] args)throws IOException {
         SinhVien[] list ={new SinhVien("nguyen van ro",21),
             new SinhVien("nguyen van hai ",22),
             new SinhVien("nguyen thi hoa ",23)};
         try {
             FileOutputStream fos = new FileOutputStream("sinhvien.dat");
             ObjectOutputStream oos = new ObjectOutputStream(fos);
             for( int i=0; i<list.length;i++)
                 oos.writeObject(list[i]);
                          
             oos.close();
             fos.close();
        } catch (IOException e) {
             System.out.println("co loi xay ra "+e);
        }
         SinhVien a1 = new SinhVien();
         SinhVien a2 = new SinhVien();
         SinhVien a3 = new SinhVien();
         try {
             FileInputStream fis = new FileInputStream("sinhvien.dat");
             ObjectInputStream ois = new ObjectInputStream(fis);
             a1 = (SinhVien) ois.readObject();
             a2 = (SinhVien) ois.readObject();
             a3= (SinhVien) ois.readObject();
             ois.close();
             fis.close();
        } catch (IOException io) {
             System.out.println("có lôi xay ra : "+io);
             
        }catch(ClassNotFoundException ex ){
             System.out.println("ko tim thay : "+ex);
             
        }
         System.out.println("thong tin sinh vien a1 :\n Name: "+a1.getName()+ "\n age :"+a1.getAge());
         System.out.println("thong tin sinh vien a2 :\n Name: "+a2.getName()+ "\n age :"+a2.getAge());
         System.out.println("thong tin sinh vien a3 :\n Name: "+a3.getName()+ "\n age :"+a3.getAge());
        }
    
    
}
