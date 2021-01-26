package btnvt5_19;
import java.util.ArrayList;

public class Exercise2 {
    public static void main(String[] args) {
        ArrayList<Integer> myarr = new ArrayList<Integer>();
        for(int i=1 ;i<=10 ;i++){
            myarr.add(i);
        }
        for(Integer  a:myarr){
            System.out.println(a);
        }
    }
    
}
