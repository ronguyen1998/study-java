package btvndoctor;

import java.util.ArrayList;

/**
 *
 * @author NGUYENVANRO
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<BtvnDoctor> dt = new ArrayList<BtvnDoctor>();
        dt.add(new BtvnDoctor("a001", "nguyen van ro", "tim ", 1));
        dt.add(new BtvnDoctor("a002", "nguyen van hoang", "nao ", 2));
        dt.add(new BtvnDoctor("a003", "nguyen thi hoa", "than kinh ", 3));
        
        while (true ){
            int choice = Manager.menu();
            switch(choice){
                case 1:
                    Manager.createDoctor(dt);
                    break;
                case 2:
                    Manager.printAllDoctor(dt);
                    break;
               case 3: 
                    Manager.updateorDeleteDoctor(dt);
                    break;
                case 5:
                    Manager.searchDoctor(dt);
                    break;
                case 6:
                    return;
            }
        }
    }  
}
